package com.leet.examp.medium;

public class TriangularSum {

    public int triangularSum(int[] nums) {
        int size = nums.length;
        if(size == 1) {
            return nums[0];
        }
        if(size == 2) {
            int val = nums[0] + nums[1];
            return val%10;
        }
        int i = size-1;
        while(i>0) {
            for(int j=0; j<i; j++) {
                nums[j] = (nums[j]+nums[j+1])%10;
            }
            i--;
        }
        return nums[0];
    }

    public static void main(String[] args) {
        TriangularSum ts = new TriangularSum();
        int[] nums = new int[] {1,2,3,4,5};
        System.out.println(ts.triangularSum(nums));
    }

}
