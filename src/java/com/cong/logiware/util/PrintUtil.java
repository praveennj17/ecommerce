package com.cong.logiware.util;

/**
 *
 * @author N K Bala
 */
import java.nio.ByteBuffer;
import com.sun.pdfview.PDFFile;
import com.sun.pdfview.PDFPrintPage;
import java.io.File;
import java.awt.Desktop;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import javax.print.PrintService;

public class PrintUtil implements Serializable{

    public static Boolean printDefaultPrinter(String file) throws Exception {
        try {
            Desktop desktop = null;
            if (Desktop.isDesktopSupported()) {
                desktop = Desktop.getDesktop();
            }            
            desktop.print(new File(file));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Boolean printFile(String printerName, String file) throws IOException {
        File printingFile = null;
        FileInputStream fileInputStream = null;
        FileChannel fileChannel = null;
        try {
            printingFile = new File(file);
            fileInputStream = new FileInputStream(printingFile);
            fileChannel = fileInputStream.getChannel();
            ByteBuffer bb = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, fileChannel.size());
            PDFFile pdfFile = new PDFFile(bb); // Create PDF Print Page
            PDFPrintPage pdfPrintPages = new PDFPrintPage(pdfFile);
            boolean flag = false;
            // Create Print Job
            PrinterJob printerJob = PrinterJob.getPrinterJob();
            PrintService[] printerService = PrinterJob.lookupPrintServices();
            PrintService printService = null;
            for (PrintService service : printerService) {
                if (null != printerName && printerName.equals(service.getName())) {
                    printService = service;
                    break;
                }
            }
            if (null == printService && null != printerService && printerService.length > 0) {
                printService = printerService[0];
            }
            if (null != printService) {
                printerJob.setPrintService(printService);
                PageFormat pageFormat = PrinterJob.getPrinterJob().defaultPage();
                Paper paperInsets = new Paper();
                paperInsets.setImageableArea(30.0D, 0.0D, paperInsets.getWidth() * 2, paperInsets.getHeight());
                pageFormat.setPaper(paperInsets);
                printerJob.setJobName(printingFile.getName());
                Book printingBook = new Book();
                printingBook.append(pdfPrintPages, pageFormat, pdfFile.getNumPages());
                printerJob.setPageable(printingBook);
                printerJob.print();
                flag = true;
            }
            return flag;
        } catch (PrinterException ex) {
            ex.printStackTrace();
            return false;
        } catch (IOException ex) {
            ex.printStackTrace();
            return false;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        } finally {
            //release the objects
            printingFile = null;
            if (null != fileInputStream) {
                fileInputStream.close();
            }
            if (null != fileChannel) {
                fileChannel.close();
            }

        }

    }
}
