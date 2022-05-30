package com.leet.examp.medium;

public class RightInterval {

    public static void main(String[] args) {
        int[][] data = new int[3][2];
        data[0][0] = 1;
        data[0][1] = 4;
        data[1][0] = 2;
        data[1][1] = 3;
        data[2][0] = 3;
        data[2][1] = 4;
        int[] result = findRightInterval(data);
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] findRightInterval(int[][] intervals) {
        int size = intervals.length;
        int[] result = new int[size];
        if(size == 1) {
            result[0] = -1;
            return result;
        }
        for(int i=0; i<size; i++) {
            int rightIndex = -1;
            boolean isToUpdate = false;
            for(int j=0; j<size; j++) {
                isToUpdate = findRightInterval(intervals, intervals[i][1], j, rightIndex);
                if(isToUpdate) {
                    rightIndex = j;
                    if(intervals[i][1] == intervals[rightIndex][0]) {
                        result[i] = rightIndex;
                        break;
                    }
                }
            }
            result[i] = rightIndex;
        }
        return result;
    }

    public static boolean findRightInterval(int[][] data, int endPoint, int j, int rightIndex) {
        int rightInterval = data[j][0];
        if(rightIndex == -1) {
            if(rightInterval >= endPoint) {
                return true;
            }
        } else {
            if(rightInterval < data[rightIndex][0]) {
                if(rightInterval >= endPoint) {
                    return true;
                }
            }
        }
        return false;
    }
}
