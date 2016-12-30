/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cong.logiware.util;

import com.itextpdf.text.Document;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Bharani
 */
public class PdfUtil implements Serializable{

    public static void concatPDFs(List<InputStream> streamOfPDFFiles, OutputStream outputStream, boolean paginate) {
	Document document = new Document(new Rectangle(0,850,612,0),0,0,0,0);
	List<InputStream> pdfs = streamOfPDFFiles;
	try {
	    List<PdfReader> readers = new ArrayList<PdfReader>();
	    int totalPages = 0;
	    Iterator<InputStream> iteratorPDFs = pdfs.iterator();

	    // Create Readers for the pdfs.
	    while (iteratorPDFs.hasNext()) {
		InputStream pdf = iteratorPDFs.next();
		PdfReader pdfReader = new PdfReader(pdf);
		readers.add(pdfReader);
		totalPages += pdfReader.getNumberOfPages();
	    }
	    // Create a writer for the outputstream
	    PdfWriter writer = PdfWriter.getInstance(document, outputStream);

	    document.open();
	    BaseFont bf = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
	    PdfContentByte cb = writer.getDirectContent(); // Holds the PDF
	    // data

	    PdfImportedPage page;
	    int currentPageNumber = 0;
	    int pageOfCurrentReaderPDF = 0;
	    Iterator<PdfReader> iteratorPDFReader = readers.iterator();

	    // Loop through the PDF files and add to the output.
	    while (iteratorPDFReader.hasNext()) {
		PdfReader pdfReader = iteratorPDFReader.next();

		// Create a new page in the target for each source page.
		while (pageOfCurrentReaderPDF < pdfReader.getNumberOfPages()) {
		    document.newPage();
		    pageOfCurrentReaderPDF++;
		    currentPageNumber++;
		    page = writer.getImportedPage(pdfReader, pageOfCurrentReaderPDF);
		    cb.addTemplate(page, 0, 0);
		    // Code for pagination.
		    if (paginate) {
			cb.beginText();
			cb.fill();
			cb.setFontAndSize(bf, 8);
			cb.showTextAligned(PdfContentByte.ALIGN_CENTER, "PAGE " + currentPageNumber + " OF " + totalPages, 306, 20, 0);
			cb.endText();
		    }

		}
		pageOfCurrentReaderPDF = 0;
	    }
	    outputStream.flush();
	    document.close();
	    outputStream.close();
	    for (InputStream inputStream : pdfs) {
		inputStream.close();
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    if (document.isOpen()) {
		document.close();
	    }
	    try {
		if (outputStream != null) {
		    outputStream.close();
		}
		if (pdfs != null) {
		    for (InputStream inputStream : pdfs) {
			inputStream.close();
		    }
		}
	    } catch (IOException ioe) {
		ioe.printStackTrace();
	    }
	}
    }
}
