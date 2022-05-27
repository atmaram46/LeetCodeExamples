package com.leet.examp.medium;

public class LongMultiply {

    public static String multiply(String num1, String num2) {
        long val1 = Long.parseLong(num1);
        long val2 = Long.parseLong(num2);
        long result = val1*val2;
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        String num1 = "498828660196";
        String num2 = "840477629533";
        System.out.println(multiply(num1, num2));
    }
}
