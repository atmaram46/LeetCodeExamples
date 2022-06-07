package com.leet.examp.small;

public class CommonPrefix {

    public static void main(String[] args) {
        String[] strs = new String[] {"flower","flow","flight"};
        CommonPrefix cp = new CommonPrefix();
        cp.longestCommonPrefix(strs);
    }

    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        for(int i=1; i<strs.length; i++) {
            int lengthR = result.length();
            if(lengthR == 0)
                return "";
            String data = strs[i];
            int lengthD = data.length();
            if(lengthD < lengthR) {
                result = result.substring(0, lengthD);
                lengthR = lengthD;
            }
            for(int j=0; j<lengthR; ) {
                if(result.charAt(j) == data.charAt(j)) {
                    j++;
                } else {
                    result = result.substring(0, j);
                    break;
                }
            }
        }
        return result;
    }
}
