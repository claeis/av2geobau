package org.interlis2.av2geobau.impl;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class DxfGroup {
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

    private int code;
    private String value;
    private long address;
    
    public DxfGroup(int code, String value) {
        this.code = code;
        this.value = value;
    }
    
    public DxfGroup(String code, String value) throws NumberFormatException {
        try {
            this.code = Integer.parseInt(code);
            this.value = value;
        } catch(NumberFormatException nfe) {throw nfe;}
    }

    public int getCode() {return code;}
    public void setCode(int code) {this.code = code;}
    public String getValue() {return value;}
    public int getIntValue() {return Integer.parseInt(value.trim());}
    public float getFloatValue() {return Float.parseFloat(value.trim());}
    public double getDoubleValue() {return Double.parseDouble(value.trim());}
    public void setValue() {this.value = value;}
    public long getAddress() {return address;}
   
    
    public boolean equals(DxfGroup other){
        if (code==other.getCode() && value.equals(other.getValue())) {
            return true;
        }
        else return false;
    }
    
    public String toString() {
      String codeString = "    " + Integer.toString(code);
      int stringLength = codeString.length();
      codeString = codeString.substring(stringLength-(code<1000?3:4), stringLength);
      return codeString + "\r\n" + value + "\r\n";
    }
    
    public static String int34car(int code) {
        if (code<10) return "  " + Integer.toString(code);
        else if (code<100) return " " + Integer.toString(code);
        else return Integer.toString(code);
    }
    
    public static String int6car(int value) {
        String s = "     " + Integer.toString(value);
        return s.substring(s.length()-6, s.length());
    }
    
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
