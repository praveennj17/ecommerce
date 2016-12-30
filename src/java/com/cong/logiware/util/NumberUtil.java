/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cong.logiware.util;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import org.apache.commons.lang.ArrayUtils;

/**
 *
 * @author sunil
 */
public class NumberUtil implements Serializable {

    public static String formatNumber(Object number, String pattern) {
        try {
            NumberFormat numberFormat = new DecimalFormat(pattern);
            return numberFormat.format(number);
        } catch (NumberFormatException e) {
            return null;
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    public static String getOrdinalNumberSuffix(int number) {
        if (!ArrayUtils.contains(new int[]{11, 12, 13}, number % 100)) {
            switch (number % 10) {
                case 1:
                    return "ST";
                case 2:
                    return "ND";
                case 3:
                    return "RD";
            }
        }
        return "TH";
    }

    public static boolean isDouble(String str) {
        if(str == null){
            return false;
        }
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /*
    private static void printOrdinalNumbersWithSuffix() {
    for (int i = 1; i <= 1000; i++) {
    System.out.format("%d%s" + ((i == (10 * (i / 10))) ? "\n" : "\t"), i, getOrdinalNumberSuffix(i));
    }
    }

    public static void main(String[] args) {
    printOrdinalNumbersWithSuffix();
    }
     */
}
