package com.leet.examp.small;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();

        int size = nums.length;
        if(size == 0) {
            return result;
        }
        result.add(0, String.valueOf(nums[0]));
        if(size == 1) {
            return result;
        }

        int j=0;
        int firstNum = nums[0];
        for(int i=1; i<size; i++) {
            int incominVal = nums[i];
            if(firstNum+1 == incominVal) {
                String[] data = result.get(j).split("->");
                data[1] = String.valueOf(incominVal);
                result.remove(j);
                result.add(j, data[0]+"->"+data[1]);
                firstNum = incominVal;
            } else {
                j++;
                result.add(j, String.valueOf(incominVal));
                firstNum = incominVal;
            }
        }
        return result;
    }
}
