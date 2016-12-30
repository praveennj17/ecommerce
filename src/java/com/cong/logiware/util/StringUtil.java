package com.cong.logiware.util;

import java.io.Serializable;

/**
 *
 * @author Sunil
 */
public class StringUtil implements Serializable {

    private static final String WHITE_SPACE = " ";

    /**
     * It returns the concate String if text is bigger than specified length.
     *
     * @param text - text to be processed
     * @param length - max length of text
     * @return - concate String
     */
    public static String contace(String text, int length) {
        if (text == null) {
            return null;
        } else {
            if (text.length() > length) {
                return text.substring(0, length);
            } else {
                return text;
            }
        }
    }

    /**
     * It will convert the string to given length, if text size is more than specified length, it will trim the text If
     * the size is less the length, it will add extra whitespace.
     *
     * @param text
     * @param length
     * @return
     */
    public static String getFixedString(int text, int length) {
        return getFixedString(text + "", length);
    }

    public static String getFixedString(String text, int length) {
        //Check text length
        if (length <= 0) {
            throw new RuntimeException("Length should not be negative number.");
        }
        //check null content
        StringBuilder buffer = new StringBuilder();
        if (text == null) {
            text = "";
        }
        //remove the new line or carriage from the text
        text = text.replaceAll("/n", " ").replaceAll("/r", " ").replaceAll("\\n", " ").replaceAll("\\r", " ");

        //create the text for specified length.
        if (text.length() > length) {
            buffer.append(text.substring(0, length));
        } else if (text.length() < length) {
            buffer.append(text);
            for (int i = text.length(); i < length; i++) {
                buffer.append(WHITE_SPACE);
            }
        } else {
            buffer.append(text);
        }
        //make everything in uppper case
        return buffer.toString().toUpperCase();
    }

    public static double convertToDouble(String input) {
        try {
            return new Double(input);
        } catch (Exception e) {
            return 0d;
        }
    }

}
