package com.leet.examp.hard;

public class MedianOfTwoSortedArray {

    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2};
        int[] nums2 = new int[] {3,4};
        MedianOfTwoSortedArray md = new MedianOfTwoSortedArray();
        double result = md.findMedianSortedArrays(nums1, nums2);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int i=0;
        int j=0;
        int count=0;
        for(; i<nums1.length && j<nums2.length; count++) {
            if(nums1[i] <= nums2[j]) {
                nums[count] = nums1[i];
                i++;
            } else {
                nums[count] = nums2[j];
                j++;
            }
        }
        while(i<nums1.length) {
            nums[count] = nums1[i];
            i++;
            count++;
        }
        while(j<nums2.length) {
            nums[count] = nums2[j];
            j++;
            count++;
        }
        if(count%2 != 0) {
            return nums[count/2];
        } else {
            int val = count/2;
            double sum = nums[val] + nums[val-1];
            double result = sum/2;
            return result;
        }
    }
}
