package com.problems;

import java.util.HashMap;
import java.util.List;

public class TwoSum extends ProblemBase {
    public TwoSum() {
        super.name = "TwoSum";
        super.description = """
                Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.              
                You may assume that each input would have exactly one solution, and you may not use the same element twice.
                You can return the answer in any order.
                Example 1:              
                Input: nums = [2,7,11,15], target = 9
                Output: [0,1]
                Output: Because nums[0] + nums[1] == 9, we return [0, 1].
                                
                Example 2:              
                Input: nums = [3,2,4], target = 6
                Output: [1,2]
                """;
        super.source = "https://leetcode.com/problems/two-sum/";
        super.level = Level.Easy;
        super.tags = List.of(Tags.Arrays.toString());
    }

    public int[] twoSum(int[] nums, int target) {
        if (nums.length<2)
            return null;

        var complementIndexMap = new HashMap<Integer, Integer>();
        var indices = new int[]{0, 0};
        for (var index = 0; index < nums.length; index++) {
            var number = nums[index];
            // check if the complement has already found
            if (complementIndexMap.containsKey(number)) {
                indices[0] = complementIndexMap.get(number);
                indices[1] = index;
                break;
            }

            // add the complement and its index to the dictionary
            var complement = target - number;
            complementIndexMap.put(complement, index);
        }

        return indices;
    }
}

