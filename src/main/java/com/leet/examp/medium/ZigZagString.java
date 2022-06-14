package com.leet.examp.medium;

public class ZigZagString {

    public static void main(String[] args) {
        ZigZagString zz = new ZigZagString();
        System.out.println(zz.convert("ABCDE", 2));
    }

    public String convert(String s, int numRows) {
        int size = s.length();
        if(size <= numRows || numRows == 1)
            return s;

        String result = "";
        if(numRows == 2) {
            for(int i=0; i<size; i=i+2) {
                result = result + s.charAt(i);
            }
            for(int j=1; j<size; j=j+2) {
                result = result + s.charAt(j);
            }
            return result;
        }
        int numRowVal = numRows;
        int count=0;
        while(size > 0) {
            if(numRowVal == numRows) {
                count++;
                size -= numRowVal;
                numRowVal--;
            } else if(numRowVal != 1) {
                count++;
                numRowVal--;
                size--;
            } else if(numRowVal == 1) {
                numRowVal = numRows;
            }
        }
        char[][] resultMat = new char[numRows][count];
        int i=0;
        int j=0;
        boolean flag = true;
        for(char c: s.toCharArray()) {
            if(i<numRows-1 && flag) {
                resultMat[i][j] = c;
                i++;
            } else if(i==numRows-1 && flag) {
                resultMat[i][j] = c;
                flag = false;
            } else if(i==0) {
                i++;
                flag = true;
                resultMat[i][j] =c;
                i++;
            } else {
                flag = false;
                i--;
                j++;
                resultMat[i][j] = c;
            }
        }
        return getResult(resultMat);
    }

    public String getResult(char[][] resultMat) {
        String result = "";
        for(int i=0; i<resultMat.length; i++) {
            for(int j=0; j<resultMat[i].length; j++) {
                if(resultMat[i][j] != '\0') {
                    result = result + resultMat[i][j];
                }
            }
        }
        return result;
    }
}
