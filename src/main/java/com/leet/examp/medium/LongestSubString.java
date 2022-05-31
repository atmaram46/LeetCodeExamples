package com.leet.examp.medium;

public class LongestSubString {

    public static int lengthOfLongestSubstring(String s) {
        String result = "";
        int lengthR = -1;

        if(s.isEmpty()) {
            return 0;
        }
        if(s.length() == 1) {
            return 1;
        }
        for(char c: s.toCharArray()) {
            if(result.contains(String.valueOf(c))) {
                result = result.substring(result.indexOf(c)+1);
            }
            result = result + c;
            lengthR = Math.max(lengthR, result.length());
        }
        return lengthR;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aabaab!bb"));
    }
}
