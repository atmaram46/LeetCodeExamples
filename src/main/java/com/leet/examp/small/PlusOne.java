package com.leet.examp.small;

public class PlusOne {

    public static void main(String[] args) {
        int[] data = new int[] {9,9};
        solution(data);
    }

    public static int[] solution(int[] data) {
        int size = data.length;
        int newVal = data[size-1] + 1;
        if(newVal == 10) {
            data[size-1] = 0;
        } else {
            data[size-1] = newVal;
            return data;
        }
        int carry =1;
        for(int i=size-2; i>=0; i--) {
            newVal = data[i] + carry;
            if(newVal == 10) {
                data[i] = 0;
            } else {
                data[i] = newVal;
                return data;
            }
        }
        int[] result = new int[size+1];
        result[0] = 1;
        for(int i=0;i<size;i++) {
            result[i+1] = data[i];
        }
        return result;
    }
}
