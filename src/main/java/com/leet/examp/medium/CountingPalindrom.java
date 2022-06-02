package com.leet.examp.medium;

public class CountingPalindrom {

    public static int countSubstrings(String s) {
        int size = s.length();
        int count = 0;
        char[] sChars = s.toCharArray();
        if (size % 2 != 0) {
            for (int i = 0; i < size; i++) {
                count++;
                int left = i - 1;
                int right = i + 1;
                while (left >= 0 && right < size) {
                    if (sChars[left] == sChars[right]) {
                        count++;
                        left--;
                        right++;
                    } else
                        break;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                count++;
                int left = i - 1;
                int right = i;
                while (left >= 0 && right < size) {
                    if (sChars[left] == sChars[right]) {
                        count++;
                        left--;
                    } else
                        break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("hello"));
    }


}