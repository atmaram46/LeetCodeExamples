package com.leet.examp.medium;

import java.util.*;
import java.util.stream.Collectors;

public class ThreeSum2 {

    public static void main(String[] args) {
        int[] nums = new int[] {-1,0,1,2,-1,4};
        ThreeSum2 ts= new ThreeSum2();
        ts.threeSum(nums);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        List<Integer> data = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int size = nums.length;
        for(int i=0; i<size-2; i++) {
            for(int j=i+1; j<size-1; j++) {
                int sum2 = nums[i] + nums[j];
                int valToFind = 0 - sum2;
                if(data.contains(valToFind)) {
                    int indexOf = data.indexOf(valToFind);
                    if(indexOf != j && indexOf > i) {
                        List<Integer> tuple = Arrays.asList(nums[i], nums[j], nums[indexOf]);
                        Collections.sort(tuple);
                        result.add(tuple);
                    }
                }
            }
        }
        return new ArrayList(result);
    }
}
