package com.leet.examp.medium;

public class FindFirstAndLastSortedArray {

    public int[] searchRange(int[] nums, int target) {
        int size = nums.length;
        int[] result = new int[] {-1, -1};
        if(size == 0)
            return result;
        int start = 0;
        int end = size - 1;
        result[0] =findLeft(nums, start, end, target);
        result[1] = findRight(nums,start,end,target);
        return result;
    }

    public int findLeft(int[] nums, int start, int end, int target) {
        int result = -1;
        while(start <= end) {
            int mid = (start + end) /2;
            if(nums[mid] >= target) {
                end = mid - 1;
            } else
                start = mid + 1;
            if(nums[mid] == target) {
                result = mid;
            }
        }
        return result;
    }

    public int findRight(int[] nums, int start, int end, int target) {
        int result = -1;
        while(start <= end) {
            int mid = (start + end) /2;
            if(nums[mid] <= target) {
                start = mid + 1;
            } else
                end = mid - 1;
            if(nums[mid] == target) {
                result = mid;
            }
        }
        return result;
    }
}
