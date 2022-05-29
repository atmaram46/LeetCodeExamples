package com.leet.examp.medium;

import java.util.Arrays;

public class KStrongestElements {

    public static void main(String[] args) {
        int k = 2;
        int[] arr = {1,2,3,4,5};
        int[] result = getStrongest(arr, k);
        for(int i=0; i<k; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] getStrongest(int[] arr, int k) {
        int size = arr.length;
        int[] powerIndex = new int[k];
        Arrays.sort(arr);
        int medianIndex = (size-1)/2;
        int medianVal = arr[medianIndex];
        int backIndex = size -1;
        int i=0;
        int j=0;
        while(i < backIndex && j<k) {
            int startDiff = Math.abs(medianVal - arr[i]);
            int backDiff = Math.abs(arr[backIndex] - medianVal);
            if(backDiff > startDiff) {
                powerIndex[j] = arr[backIndex];
                j++;
                backIndex--;
            } else if(backDiff < startDiff) {
                powerIndex[j] = arr[i];
                i++;
                j++;
            } else {
                if(arr[backIndex] >= arr[i]) {
                    powerIndex[j] = arr[backIndex];
                    j++;
                    backIndex--;
                } else {
                    powerIndex[j] = arr[i];
                    i++;
                    j++;
                }
            }
        }
        if(j<k) {
            powerIndex[j] = arr[i];
        }
        return powerIndex;
    }
}
