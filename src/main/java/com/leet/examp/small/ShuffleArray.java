package com.leet.examp.small;
//2,454,160
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

        String data = "asdfsad";
        int size = data.length();

        return result;
    }


}
