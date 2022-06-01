package com.leet.examp.small;

public class RemoveElements {

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        int i = 0;
        for(int num: nums) {
            if(num != val) {
                nums[i] = num;
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] data = new int[] {3,2,2,3};
        removeElement(data, 3);
    }
}
