package com.leet.examp.small;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        PascalTriangle pt = new PascalTriangle();
        pt.generate(5);
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        result.add(row);
        if(numRows == 1) {
            return result;
        }
        List<Integer> secondRow = new ArrayList<>();
        secondRow.add(1);
        secondRow.add(1);
        result.add(secondRow);
        if(numRows == 2) {
            return result;
        }
        for(int i=2; i<numRows; i++) {
            result.add(calculateRow(result.get(i-1), i+1));
        }
        return result;
    }

    public List<Integer> calculateRow(List<Integer> lastRow, int currSize) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for(int i=1; i<currSize-1; i++) {
            int val1 = lastRow.get(i);
            int val2 = lastRow.get(i-1);
            row.add(val1+val2);
        }
        row.add(1);
        return row;
    }
}
