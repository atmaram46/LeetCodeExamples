package com.leet.examp.medium;

public class LongestPalindromSubSeq {

    public static void main(String[] args) {
        LongestPalindromSubSeq lss = new LongestPalindromSubSeq();
        System.out.println(lss.longestPalindromSubSq("PAYPALISILAPPAY"));
    }

    public int longestPalindromSubSq(String str) {
        int n = str.length();
        int[] pre = new int[n];
        int[] cur = new int[n];

        for(int i=n-1; i>=0; i--) {
            cur[i] = 1;
            for(int j=i+1; j<n; j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    cur[j] = pre[j-1] + 2;
                } else {
                    cur[j] = Math.max(cur[j-1], pre[j]);
                }
            }
            pre = cur;
            cur = new int[n];
        }
        return pre[n-1];
    }
}
