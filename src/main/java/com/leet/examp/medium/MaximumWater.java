package com.leet.examp.medium;

public class MaximumWater {

    public int maxArea(int[] height) {
        int maxWater =0;
        int sum = 0;
        if(height.length <= 1) {
            return 0;
        }
        if(height.length == 2) {
            return Math.min(height[0], height[1]);
        }
        int leftMax = 0;
        int rightMax = height.length - 1;
        while(leftMax < rightMax) {
            int min = Math.min(height[leftMax], height[rightMax]);
            int currWater = min * (rightMax-leftMax);
            maxWater = Math.max(currWater, maxWater);
            if(height[leftMax] < height[rightMax]) {
                leftMax++;
            } else {
                rightMax--;
            }
        }
        return maxWater;
    }

}
