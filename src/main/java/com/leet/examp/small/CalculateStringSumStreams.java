package com.leet.examp.small;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CalculateStringSumStreams {

    public String digitSum(String s, int k) {
        while(s.length() > k) {
            s = Arrays.stream(s.split("(?<=\\G.{" + k + "})"))
                    .map(this::sum)
                    .map(String::valueOf)
                    .collect(Collectors.joining());
        }
        return s;
    }

    private int sum(String s) {
        return s.chars().map(Character::getNumericValue).sum();
    }
}
