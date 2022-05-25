package com.leet.examp.small;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        RomanToInteger romData = new RomanToInteger();
        System.out.println(romData.romanToInt("MCMXCIV"));
    }

    public int romanToInt(String input) {
        Map<Character, Integer> data = createValueMap();
        int inputSize = input.length();
        int sumValue = 0;
        for(int i=0; i<inputSize; i++) {
            char charAt = input.charAt(i);
            int valueAt = data.get(charAt);
            int valueNext = 0;
            if(i+1 != inputSize) {
                char charNext = input.charAt(i+1);
                valueNext = data.get(charNext);
            }
            if(valueNext > valueAt) {
                sumValue += (valueNext-valueAt);
                i++;
            } else {
                sumValue += valueAt;
            }
        }
        return sumValue;
    }

    public Map<Character, Integer> createValueMap() {
        Map<Character, Integer> data = new HashMap<>();
        data.put('M', 1000);
        data.put('D', 500);
        data.put('C', 100);
        data.put('L', 50);
        data.put('X', 10);
        data.put('V', 5);
        data.put('I', 1);
        return data;
    }
}
