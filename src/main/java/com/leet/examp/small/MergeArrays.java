package com.leet.examp.small;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {10,30,50,70};
        int[] arr2 = {20,40,60,80,90};
        int[] result = mergeArray(arr1, arr2);
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

    private static int[] mergeArray(int[] arr1, int[] arr2) {
        int size1 = arr1.length;
        int size2 = arr2.length;
        int newSize = size1 + size2;
        int[] result = new int[newSize];
        int counter1 = 0;
        int counter2 = 0;
        int i=0;
        for(;counter1<size1 && counter2<size2;) {
            if(arr1[counter1] <= arr2[counter2]) {
                result[i] = arr1[counter1];
                i++;
                counter1++;
            } else {
                result[i] = arr2[counter2];
                i++;
                counter2++;
            }
        }
        while(counter1<size1) {
            result[i] = arr1[counter1];
            i++;
            counter1++;
        }
        while(counter2<size2) {
            result[i] = arr2[counter2];
            i++;
            counter2++;
        }
        return result;
    }
}
