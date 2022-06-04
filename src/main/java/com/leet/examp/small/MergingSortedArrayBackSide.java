package com.leet.examp.small;

public class MergingSortedArrayBackSide {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int j=n-1;
            int i=m-1;
            int counter = nums1.length - 1;
            for(; i>=0 && j >= 0; ) {
                if(nums1[i] >= nums2[j]) {
                    nums1[counter] = nums1[i];
                    counter--;
                    i--;
                } else {
                    nums1[counter] = nums2[j];
                    counter--;
                    j--;
                }
            }
            while(i >= 0) {
                nums1[counter] = nums1[i];
                counter--;
                i--;
            }
            while(j >= 0) {
                nums1[counter] = nums2[j];
                counter--;
                j--;
            }
        }
    }
}
