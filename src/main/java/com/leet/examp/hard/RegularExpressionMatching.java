package com.leet.examp.hard;

public class RegularExpressionMatching {

    public static void main(String[] args) {
        RegularExpressionMatching re = new RegularExpressionMatching();
        System.out.println(re.isMatch("abcd", "d*"));
        //""abcd"
        //"d*""
        //"mis*is*ip*."
    }

    public boolean isMatch(String s, String p) {
        boolean result = true;
        int size = p.length();
        if(size == 1) {
            if(s.length() > 1)
                return false;
            else if(s.charAt(0) == p.charAt(0) || p.charAt(0) == '.') {
                return true;
            } else
                return false;
        }
        int j = 0;
        char prev = p.charAt(j);
        j++;
        if(prev == '.' && p.charAt(j) == '*')
            return true;
        int i=0;
        for(; i<s.length() && j<size;) {
            char c = s.charAt(i);
            if(p.charAt(j) == '*'){
                if(c == prev || prev == '.') {
                    i++;
                    continue;
                } else if(j+1 <size) {
                    if(c == p.charAt(j+1) || p.charAt(j+1) == '.') {
                        j++;
                        prev = p.charAt(j);
                        j++;
                    }
                } else {
                    return false;
                }
            } else if(prev == '.') {
                prev = p.charAt(j);
                j++;
                i++;
            } else {
                if(c == prev) {
                    prev = p.charAt(j);
                    j++;
                    i++;
                } else
                    return false;
            }
        }
        for(;i<s.length();) {
            char c = s.charAt(i);
            if(c == prev || prev == '.') {
                prev = '*';
                i++;
            } else
                return false;
        }
        return result;
    }

}
