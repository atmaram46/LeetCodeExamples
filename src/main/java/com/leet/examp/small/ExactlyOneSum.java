package com.leet.examp.small;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExactlyOneSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int size = nums.length;
        List<Integer> newNum = Arrays.stream(nums).boxed().collect(Collectors.toList());
        for(int i=0; i<size; i++) {
            int diff = 0;
            if(target >= 0) {
                if(target > nums[i]) {
                    diff = target - nums[i];
                }
            } else {
                diff = target - nums[i];
            }
            int diffIndex = newNum.indexOf(diff);
            if(diffIndex == i) {
                diffIndex = newNum.lastIndexOf(diff);
            }
            if(diffIndex > 0 && diffIndex != i) {
                result[0] = i;
                result[1] = diffIndex;
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {-18,12,4,6};
        System.out.println(twoSum(input, -6));
        int[] input1 = {-1,-2,-3,-4,-5};
        System.out.println(twoSum(input1, -8));
        int[] input2 = {4742263,-1251372,-8572325,-5849876,1324437,-8952702,-9069471,3430459,9532049,
                3856391,8236560,9644501,-5973061,-219451,5552688,305456,-6216368,30569,1112314,9934564,
                4690965,-9372905,-7586160,2709886,8730120,2950692,5627439,-2500198,-5748174,6924689};
        System.out.println(twoSum(input2, 3490891));

    }
}
