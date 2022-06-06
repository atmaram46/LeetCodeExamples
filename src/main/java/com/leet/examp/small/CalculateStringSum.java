package com.leet.examp.small;

//1,131,503
public class CalculateStringSum {

    public static void main(String[] args) {
        CalculateStringSum cs = new CalculateStringSum();
        cs.digitSum("00000000", 3);
    }

    public String digitSum(String s, int k) {
        int size = s.length();
        while(size > k) {
            s = updateString(s, k);
            size = s.length();
        }
        return s;
    }

    public String updateString(String str, int k) {
        int size = str.length();
        int count = 0;
        int sum = 0;
        String result = "";
        for(int i=0; i<size; i++) {
            sum += Character.getNumericValue(str.charAt(i));
            count++;
            if(count == k) {
                result = result + sum;
                sum = 0;
                count = 0;
            }
        }
        if(count > 0) {
            result = result + sum;
        }
        return result;
    }
}
