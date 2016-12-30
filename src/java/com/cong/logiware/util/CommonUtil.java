package com.cong.logiware.util;

import com.cong.logiware.constant.SpecialCharacterConstant;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Sunil
 */
public class CommonUtil implements SpecialCharacterConstant, Serializable {

    /**
     * Check whether the instance is null or not
     *
     * @param o
     * @return true if the object is null
     */
    public static boolean isNull(Object o) {
        return !isNotNull(o);
    }

    /**
     * Check whether the instance is not null
     *
     * @param o
     * @return - true if the object is null else return false;
     */
    public static boolean isNotNull(Object o) {
        if (o == null || o.toString().trim().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Object is empty or not.
     *
     * @param item Object
     * @return - true if the object is not null and not empty else return false;
     */
    public static boolean isNotEmpty(Object item) {
        return !isEmpty(item);
    }

    /**
     * Object is the NULL or empty .
     *
     * @param item
     * @return true if the if the Object is NULL or empty else return false.
     */
    public static boolean isEmpty(Object item) {
        if (item == null || item.toString().trim().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Collection is the NULL or empty .
     *
     * @param item
     * @return true if the if the Object is NULL or empty else return false.
     */
    public static boolean isEmpty(Collection coll) {
        if (coll == null || coll.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEmpty(Map map) {
        if (map == null || map.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTrue(Boolean flag) {
        return flag != null && flag;
    }

    /**
     * Is Collection is empty or not.
     *
     * @param list
     * @return - true if the Collection is null or empty else return false.
     */
    public static boolean isNotEmpty(Collection list) {
        if (list == null || list.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isEqualIgnoreCase(String str1, String str2) {
        if (isNull(str1) && isNull(str2)) {
            return true;
        } else if (isNull(str1) || isNull(str2)) {
            return false;
        } else {
            return (str1.equalsIgnoreCase(str2));
        }
    }

    /**
     * Check whether two Strings are equal or not.
     *
     * @param str1
     * @param str2
     * @return - true if both strings are null or if they are equal.
     */
    public static boolean isEqual(String str1, String str2) {
        if (isNull(str1) && isNull(str2)) {
            return true;
        } else if (isNull(str1) || isNull(str2)) {
            return false;
        } else {
            return (str1.equals(str2));
        }
    }

    /**
     * Check whether two Objects are equal or not.
     *
     * @param o1
     * @param o2
     * @return - true if both objects are null or if they are equal.
     */
    public static boolean isEqual(Object o1, Object o2) {
        if (o1 == null && o2 == null) {
            return true;
        } else if (o1 == null || o2 == null) {
            return false;
        } else {
            return o1.equals(o2);
        }
    }

    /**
     * Get Deep copy of any objects.
     *
     * @param <T> - Object type
     * @param obj Object to be copied
     * @return - copy of object
     * @throws Exception - If Object or its content of class type are not Serializable.
     */
    public static <T extends Serializable> T getDeepCopy(T obj) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(obj);
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deepCopy = ois.readObject();
        return (T) deepCopy;
    }

    /**
     * Get PrintStackTrace as String.
     *
     * @param throwable
     * @return
     */
    public static String getStackTrace(Throwable throwable) {
        Writer writer = null;
        PrintWriter printWriter = null;
        try {
            writer = new StringWriter();
            printWriter = new PrintWriter(writer);
            throwable.printStackTrace(printWriter);
            return writer.toString();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
                if (printWriter != null) {
                    printWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Long getLong(Object o) {
        if (o == null) {
            return 0L;
        }
        return Long.parseLong(o.toString());
    }

    public static Integer getInt(Object o) {
        if (o == null) {
            return 0;
        }
        return Integer.parseInt(o.toString());
    }

    public static Double getDouble(Object o) {
        if (o == null) {
            return 0.0;
        }
        return Double.parseDouble(o.toString());
    }

    public String concatWords(String o, int num) {
        if (o != null) {
            try {
                o = o.substring(0, num);
                o = o.concat(DOTS);
            } catch (Exception e) {
                return o;
            }
        }
        return o;
    }

    /**
     * Replace the special characters [^a-zA-Z 0-9]
     *
     * @param txt
     * @return - replaced text
     */
    public static String removeSpecialChars(String txt) {
        return txt.replaceAll("[^a-zA-Z 0-9]+", "");
    }

    public static String checkNullReplaceStr(String replaceStr) {
        if (replaceStr == null) {
            return "";
        }
        return replaceStr;
    }

    public static String escapeXml(String str) {
        str = replaceString(str, "&", "&amp;");
        str = replaceString(str, "<", "&lt;");
        str = replaceString(str, ">", "&gt;");
        str = replaceString(str, "\"", "&quot;");
        str = replaceString(str, "'", "&apos;");
        return str;
    }

    public static String replaceString(String text, String repl, String with) {
        return replaceStringTo(text, repl, with, -1);
    }

    public static String replaceStringTo(String text, String repl, String with, int max) {
        if (text == null) {
            return null;
        }
        StringBuffer buffer = new StringBuffer(text.length());
        int start = 0;
        int end = 0;
        while ((end = text.indexOf(repl, start)) != -1) {
            buffer.append(text.substring(start, end)).append(with);
            start = end + repl.length();

            if (--max == 0) {
                break;
            }
        }
        buffer.append(text.substring(start));

        return buffer.toString();
    }

    /**
     * Convert int value to String with leading zero
     *
     * @param num - int value
     * @param digits - total size of string
     * @return
     */
    public static String intToString(int num, int digits) {
        StringBuilder s = new StringBuilder(digits);
        int zeroes = digits - (int) (Math.log(num) / Math.log(10)) - 1;
        for (int i = 0; i < zeroes; i++) {
            s.append(0);
        }
        return s.append(num).toString();
    }

    /**
     * Get word count from the text
     *
     * @param text
     * @param regex
     * @return
     */
    public static int getWordCount(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(text);
        int count = 0;
        while (m.find()) {
            count++;
        }
        return count;
    }
}
