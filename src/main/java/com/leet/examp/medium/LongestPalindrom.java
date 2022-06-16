package com.leet.examp.medium;

public class LongestPalindrom {

    public static void main(String[] args) {
        longestPalSubstr("ramchahelilachaahcalilramchahe");
    }

    public static int longestPalSubstr(String str) {
        int n = str.length();

        int[][] table = new int[n][n];
        int maxLength = 1;
        for (int i = 0; i < n; ++i)
            table[i][i] = 1;

        int start = 0;
        for (int i = 0; i < n - 1; ++i) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                table[i][i + 1] = 1;
                start = i;
                maxLength = 2;
            }
        }

        for (int k = 3; k <= n; ++k) {
            for (int i = 0; i < n - k + 1; ++i) {
                int j = i + k - 1;
                if (table[i + 1][j - 1] == 1 && str.charAt(i) == str.charAt(j)) {
                    table[i][j] = 1;
                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        printMatrix(table, n);
        printSubStr(str, start, start + maxLength - 1);
        return maxLength;
    }

    public static void printSubStr(String str, int low, int high) {
        System.out.println(str.substring(low, high + 1));
    }

    public static void printMatrix(int[][] matchingMatrix, int size) {
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                System.out.print(matchingMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
