package com.leet.examp.small;

public class FindInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int count = 0;
        for(int num : nums) {
            if(num == target || target < num)
                return count;
            else
                count++;
        }
        return count;
    }

}
