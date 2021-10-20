package com.problems;

import java.util.HashMap;
import java.util.List;

public class CheckPermutation extends ProblemBase {
    public CheckPermutation() {
        super.name = "CheckPermutation";
        super.description = "";
        super.source = "Cracking the Coding Interview, 6th Edition, 1.2";
        super.level = Level.Easy;
        super.tags = List.of(Tags.Arrays.toString(), Tags.Strings.toString());
    }

    // assuming using ascii or a coding system with limited number of characters
    public boolean checkPermutationArray(String input1, String input2) {
        if (input1.length() != input2.length()) {
            return false;
        }

        final int CHAR_SIZE = 128;
        var charList = new int[CHAR_SIZE];

        for (var i = 0; i < input1.length(); i++) {
            var index1 = (int) input1.charAt(i);
            var index2 = (int) input2.charAt(i);
            charList[index1]++;
            charList[index2]--;
        }

        for (var value : charList) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean checkPermutationHashMsp(String input1, String input2) {
        if (input1.length() != input2.length()) {
            return false;
        }

        var charCount1 = new HashMap<Character, Integer>();
        var charCount2 = new HashMap<Character, Integer>();

        for (var i = 0; i < input1.length(); i++) {
            var letter1 = input1.charAt(i);
            var letter2 = input2.charAt(i);

            incrementValue(charCount1, letter1);
            incrementValue(charCount2, letter2);
        }

        if (charCount1.size() != charCount2.size()) {
            return false;
        }

        for (var key : charCount1.keySet()) {
            if (!charCount2.containsKey(key)) {
                return false;
            }

            if (charCount1.get(key) != charCount2.get(key)) {
                return false;
            }
        }

        return true;
    }

    private void incrementValue(HashMap<Character, Integer> map, Character key) {
        var count = map.getOrDefault(key, 0);
        map.put(key, count + 1);
    }
}
