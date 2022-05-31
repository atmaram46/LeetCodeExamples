package com.leet.examp.small;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExactlyOneSum2 {

    public static int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        for(int i=0; i<size; i++) {
            int diff = target - nums[i];
            for(int j=i+1; j<size; j++) {
                if(nums[j] == diff) {
                    return new int[] {nums[i], nums[j]};
                }
            }
        }
        return null;
    }
}
