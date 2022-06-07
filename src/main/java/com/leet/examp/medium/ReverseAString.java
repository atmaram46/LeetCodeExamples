package com.leet.examp.medium;

public class ReverseAString {

    public static void main(String[] args) {
        int data = 1534236469;
        ReverseAString rs = new ReverseAString();
        rs.reverse(data);
    }

    public int reverse(int x) {
        int result = 0;
        while(x!=0) {
            int val = x%10;
            int newResult = result * 10 + val;
            if((newResult - val)/10 != result)
                return 0;
            result = newResult;
            x = x/10;
        }

        return result;
    }
}
