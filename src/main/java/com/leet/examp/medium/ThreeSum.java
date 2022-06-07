package com.leet.examp.medium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int size = nums.length;
        for(int i=0; i<size-2; i++) {
            if(i-1 >= 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int left = i+1;
            int right = size-1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left + 1 < right && nums[left] == nums[left+1])
                        left++;
                    while(right -1 > left && nums[right] == nums[right-1])
                        right--;
                    left++;
                    right--;
                } else if(sum > 0) {
                    right--;
                } else
                    left++;
            }
        }
        return result;
    }

}
