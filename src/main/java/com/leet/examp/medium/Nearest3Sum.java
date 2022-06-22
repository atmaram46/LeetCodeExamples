package com.leet.examp.medium;

import java.util.Arrays;
import java.util.Map;

public class Nearest3Sum {

    public static void main(String[] args) {
        Nearest3Sum sum3 = new Nearest3Sum();
        int[] nums = new int[] {-1,2,1,-4};
        System.out.println(sum3.threeSumClosest(nums, 1));
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int size = nums.length;
        int currDiff = Integer.MAX_VALUE;
        int result = 0;
        for(int i=0; i<size-2;i++) {
            int j=i+1;
            int k=size-1;
            while(j<k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target) {
                    return sum;
                } else {
                    int diff = Math.abs(target - sum);
                    if(currDiff > diff) {
                        result = sum;
                        currDiff = diff;
                    }
                    if(sum > target)
                        k--;
                    else
                        j++;
                }
            }
        }
        return result;
    }
}
