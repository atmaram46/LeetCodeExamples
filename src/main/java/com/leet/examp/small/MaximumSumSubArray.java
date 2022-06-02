package com.leet.examp.small;

public class MaximumSumSubArray {

    public static void main(String[] args) {
       // Input: nums = [-2,1,-3,4,-1,2,1,-5,4,3]
    }

    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = nums[0];
        int size = nums.length;
        for(int i=0; i<size; i++) {
            sum += nums[i];
            if(maxSum < sum) {
                maxSum = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
