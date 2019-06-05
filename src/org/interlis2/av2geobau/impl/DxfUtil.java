package org.interlis2.av2geobau.impl;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class DxfUtil {
    private static final DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.US);
    private static final DecimalFormat[] decimalFormats = new DecimalFormat[]{
                          new DecimalFormat("#0", dfs),
                          new DecimalFormat("#0.0", dfs),
                          new DecimalFormat("#0.00", dfs),
                          new DecimalFormat("#0.000", dfs),
                          new DecimalFormat("#0.0000", dfs),
                          new DecimalFormat("#0.00000", dfs),
                          new DecimalFormat("#0.000000", dfs),
                          new DecimalFormat("#0.0000000", dfs),
                          new DecimalFormat("#0.00000000", dfs),
                          new DecimalFormat("#0.000000000", dfs),
                          new DecimalFormat("#0.0000000000", dfs),
                          new DecimalFormat("#0.00000000000", dfs),
                          new DecimalFormat("#0.000000000000", dfs)};

    private DxfUtil() {}
    
    private static String int34car(int code) {
        if (code<10) return "  " + Integer.toString(code);
        else if (code<100) return " " + Integer.toString(code);
        else return Integer.toString(code);
    }
    
    private static String int6car(int value) {
        String s = "     " + Integer.toString(value);
        return s.substring(s.length()-6, s.length());
    }
    
    /** Writes the simplest dxf object, a group, composed of a numeric code 
     * and a value. The value type can be interpreted looking at the code.
    */
    public static String toString(int code, String value) {
      return int34car(code) + "\r\n" + value + "\r\n";
    }

    public static String toString(int code, int value) {
      return int34car(code) + "\r\n" + int6car(value) + "\r\n";
    }

    public static String toString(int code, float value, int decimalPartLength) {
      return int34car(code) + "\r\n" +
              decimalFormats[decimalPartLength].format((double)value) + "\r\n";
    }

    public static String toString(int code, double value, int decimalPartLength) {
      return int34car(code) + "\r\n" +
              decimalFormats[decimalPartLength].format(value) + "\r\n";
    }

    public static String toString(int code, Object value) {
        if (value instanceof String) {return toString(code, (String)value);}
        else if (value instanceof Integer) {return toString(code, ((Integer)value).intValue());}
        else if (value instanceof Float) {return toString(code, ((Float)value).floatValue(), 3);}
        else if (value instanceof Double) {return toString(code, ((Double)value).doubleValue(), 6);}
        else return toString(code, value.toString());
    }

}
