package com.leet.examp.small;

//2,080,996
public class Palindrom {

    public static boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        String value = String.valueOf(x);
        int size = value.length();
        for(int i=0; i<size/2; i++) {
            char start = value.charAt(i);
            char end = value.charAt(size-i-1);
            if(start != end)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(10));
    }
}
