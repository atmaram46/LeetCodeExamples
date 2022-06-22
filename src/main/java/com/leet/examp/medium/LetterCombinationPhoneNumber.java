package com.leet.examp.medium;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationPhoneNumber {

    public static void main(String[] args) {
        LetterCombinationPhoneNumber lp = new LetterCombinationPhoneNumber();
        lp.letterCombinations("345");
    }

    public List<String> letterCombinations(String digits) {
        int size = digits.length();
        List<String> result = new LinkedList<>();
        if(size == 0) {
            return result;
        }
        String[] keys = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        combinationOfChar("", digits, 0, result, keys);
        return result;
    }

    private void combinationOfChar(String prefix, String digits, int curOffset, List<String> result, String[] keys) {
        if(curOffset >= digits.length()) {
            result.add(prefix);
            return;
        }
        String letters = keys[(digits.charAt(curOffset) - '0')];
        for(int i=0; i<letters.length(); i++) {
            combinationOfChar(prefix+letters.charAt(i), digits, curOffset+1, result, keys);
        }
    }

}
