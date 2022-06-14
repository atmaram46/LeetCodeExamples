package com.leet.examp.medium;

public class SearchRotatedSortedArray {

    //967,603
    public static void main(String[] args) {
        SearchRotatedSortedArray sr = new SearchRotatedSortedArray();
        int[] data = new int[] {4,5,6,7,0,1,2};
        System.out.println(sr.search(data, 0));
    }

    public int search(int[] nums, int target) {
        int startVal = nums[0];
        if(startVal == target)
            return 0;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = (start + end)/2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[start] <= nums[mid]) {
                if(target < nums[mid] && target >= nums[start]) {
                    end = mid - 1;
                } else
                    start = mid + 1;
            }
            if(nums[mid] <= nums[end]) {
                if(target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else
                    end = mid - 1;
            }
        }
        return -1;
    }
}
