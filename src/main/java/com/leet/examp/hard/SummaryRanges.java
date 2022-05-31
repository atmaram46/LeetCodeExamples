package com.leet.examp.hard;

import java.util.*;

public class SummaryRanges {

    static Set<Integer> inputData = new TreeSet<>();

    public static void main(String[] args) {
        addNum(1);
        display(getIntervals());
        addNum(3);
        display(getIntervals());
        addNum(7);
        display(getIntervals());
        addNum(2);
        display(getIntervals());
        addNum(6);
        display(getIntervals());
    }

    public static void display(int[][] values) {
        int size = values.length;
        for(int i=0; i<size; i++) {
            System.out.print(values[i][0] + " " + values[i][1]);
            System.out.println();
        }
        System.out.println("------------------------");
    }

    public SummaryRanges() {
    }

    public static void addNum(int val) {
        inputData.add(val);
    }

    public static int[][] getIntervals() {
        int size = inputData.size();
        List<int[]> data = new ArrayList<>();
        if(size == 0) {
            return null;
        } else if(size == 1) {
            Optional<Integer> startVal = inputData.stream().findFirst();
            data.add(new int[]{startVal.get(), startVal.get()});
            return convertListToArray(data);
        }
        int i=-1;
        for(int values : inputData) {
            if (i < 0) {
                data.add(new int[]{values, values});
                i++;
            } else {
                int[] oldVal = data.get(i);
                if(oldVal[1]+1 == values) {
                    data.remove(i);
                    oldVal[1] = values;
                    data.add(i, oldVal);
                } else {
                    data.add(new int[] {values, values});
                    i++;
                }
            }
        }
        return convertListToArray(data);
    }

    public static int[][] convertListToArray(List<int[]> data) {
        int size = data.size();
        int[][] result = new int[size][2];
        int index = 0;
        for(int[] val : data) {
            result[index][0] = val[0];
            result[index][1] = val[1];
            index++;
        }
        return result;
    }

}
