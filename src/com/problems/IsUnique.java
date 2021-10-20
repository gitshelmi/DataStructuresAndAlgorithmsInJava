package com.problems;

import java.util.HashSet;
import java.util.List;

public class IsUnique extends ProblemBase {
    public IsUnique() {
        super.name = "IsUnique";
        super.description = "";
        super.source = "Cracking the Coding Interview, 6th Edition, 1.1";
        super.level = Level.Easy;
        super.tags = List.of(Tags.Arrays.toString(), Tags.Strings.toString());
    }

    // assuming the ASCII system is used and there are 128 characters
    public boolean isUniqueArray(String input) {
        if (input.length() > 128) {
            return false;
        }

        var charList = new boolean[128];

        for (int i = 0; i < input.length(); i++) {
            var index = (int) input.charAt(i);
            if (charList[index]) {
                return false;
            }
            charList[index] = true;
        }
        return true;
    }

    public boolean isUniqueSet(String input) {
        var charList = new HashSet<Character>();

        for (int i = 0; i < input.length(); i++) {
            var letter = input.charAt(i);
            if (charList.contains(letter)) {
                return false;
            }
            charList.add(letter);
        }
        return true;
    }

    // naive solution O(N^2)
    public boolean isUniqueNoExtraDataStructure(String input) {
        for (var i = 0; i < input.length() - 1; i++) {
            var letter = input.charAt(i);
            for (var j = i + 1; j < input.length(); j++) {
                if (letter == input.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
