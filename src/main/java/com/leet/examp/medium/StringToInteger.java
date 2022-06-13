package com.leet.examp.medium;

public class StringToInteger {

    public static void main(String[] args) {
        StringToInteger si = new StringToInteger();
        si.myAtoi("  0000000000012345678");
    }

    public int myAtoi(String s) {
        String newData = s.trim();
        int len = newData.length();
        if(len == 0)
            return 0;
        boolean flag = false;
        int result = 0;
        if(newData.charAt(0) == '-') {
            flag = true;
            newData = newData.substring(1);
        } else if(newData.charAt(0) == '+') {
            newData = newData.substring(1);
        }
        for(char c: newData.toCharArray()) {
            if(Character.isDigit(c)) {
                int numVal = Character.getNumericValue(c);
                if(Integer.MAX_VALUE/10 < result || Integer.MAX_VALUE/10 == result && Integer.MAX_VALUE %10 < numVal) {
                    if(flag)
                        return Integer.MIN_VALUE;
                    else
                        return Integer.MAX_VALUE;
                }
                result = result * 10 + numVal;
            } else
                break;
        }
        if(flag)
            return -result;
        else
            return result;
    }
}
