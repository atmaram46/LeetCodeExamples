package com.leet.examp.medium;

import java.math.BigInteger;

public class LongMultiply {

    public static String multiply(String num1, String num2) {
        BigInteger val1=new BigInteger(num1);
        BigInteger val2 = new BigInteger(num2);
        BigInteger result = val1.multiply(val2);
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        String num1 = "498828660196";
        String num2 = "840477629533";
        System.out.println(multiply(num1, num2));
    }
}
