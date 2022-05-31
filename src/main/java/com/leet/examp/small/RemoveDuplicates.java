package com.leet.examp.small;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return 1;
        }
        int lastVal = nums[0];
        int sizeInd = 0;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] != lastVal) {
                sizeInd++;
                nums[sizeInd] = nums[i];
                lastVal = nums[i];
            }
        }
        return sizeInd+1;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}
