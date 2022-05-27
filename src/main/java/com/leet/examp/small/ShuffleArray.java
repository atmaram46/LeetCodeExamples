package com.leet.examp.small;

public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int j=0;
        for(int i=0; i<nums.length; i++) {
            result[i] = nums[j];
            i++;
            j++;
            result[i] = nums[n];
            n++;
        }
        return result;
    }
}
