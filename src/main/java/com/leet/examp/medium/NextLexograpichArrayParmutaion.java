package com.leet.examp.medium;

import java.util.Arrays;

public class NextLexograpichArrayParmutaion {

    public static void main(String[] args) {
        NextLexograpichArrayParmutaion np = new NextLexograpichArrayParmutaion();
        int[] nums = new int[] {5,4,7,5,3,2}; //213
        //1,4,3,2 2143
        np.nextPermutation(nums);
    }

    public void nextPermutation(int[] nums) {
        int size = nums.length;
        for(int i=size-1; i>0; i--) {
            if(nums[i] > nums[i-1]) {
                int j=size-1;
                while(nums[i-1] >= nums[j])
                    j--;
                swapData(nums, j, i-1);
                nums = findRemainingData(nums, i, size);
                return;
            }
        }
        for(int i=0; i<size/2; i++) {
            swapData(nums, i, size-i-1);
        }
    }

    public void swapData(int[] nums, int i, int j) {
        int change = nums[i];
        nums[i] = nums[j];
        nums[j] = change;
    }

    public int[] findRemainingData(int[] nums, int i, int size) {
        for(; i<size-1; i++) {
            for(int j=i+1; j<size; j++) {
                if (nums[i] > nums[j]) {
                    swapData(nums, i, j);
                }
            }
        }
        return nums;
    }

}
