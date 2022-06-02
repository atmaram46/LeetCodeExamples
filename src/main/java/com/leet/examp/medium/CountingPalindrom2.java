package com.leet.examp.medium;

public class CountingPalindrom2 {

    public static int longestPalSubstr(String str) {
        int n = str.length();

        int[][] table = new int[n][n];
        int maxLength = 1;
        int count = 0;
        for (int i = 0; i < n; ++i) {
            table[i][i] = 1;
            count++;
        }


        int start = 0;
        for (int i = 0; i < n - 1; ++i) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
                table[i][i + 1] = 1;
                start = i;
                maxLength = 2;
            }
        }

        for (int k = 3; k <= n; ++k) {
            for (int i = 0; i < n - k + 1; ++i) {
                int j = i + k - 1;
                if (table[i + 1][j - 1] == 1 && str.charAt(i) == str.charAt(j)) {
                    count++;
                    table[i][j] = 1;
                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        return maxLength;
    }
}
