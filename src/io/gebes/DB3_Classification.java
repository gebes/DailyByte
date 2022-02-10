package io.gebes;

import java.util.*;

/*
Given an integer array, nums, return an array that represents the classifications of each value within nums.
Note: Classifications start at one, the larger the value in nums, the larger the classification, two elements that have the same value have the same classification, and classifications should be made as small as possible.

Ex: Given the following nums…

nums = [7, 9, 8], return [1, 3, 2] (7 is the smallest value so its classification is 3, 9 is the largest value so its classification is 1, and 8 is the second-largest value so its classification is 2).
Ex: Given the following nums…

nums = [2, 9, 3, 5, 7, 4, 4], return [1, 6, 2, 4, 5, 3, 3].
 */
public class DB3_Classification {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(classification(new int[]{7, 9, 8})));
        System.out.println(Arrays.toString(classification(new int[]{2, 9, 3, 5, 7, 4, 4})));
        System.out.println(Arrays.toString(classification(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10})));
        System.out.println(Arrays.toString(classification(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8})));
        System.out.println(Arrays.toString(classification(new int[]{0, 1, 2, 3, 4, 5, 6, 700, 8})));
        System.out.println(Arrays.toString(classification(new int[]{})));
    }

    // Time O(n)
    // Space O(n)
    public static int[] classification(int[] nums) {
        if (nums.length == 0) return nums;

        int min = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }

        Set<Integer> inc = new HashSet<>();

        int max = nums[0] - (min - 1);
        for (int i = 0; i < nums.length; i++) {
            nums[i] -= (min - 1);
            inc.add(nums[i]);
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        Map<Integer, Integer> toSub = new HashMap<>();

        int current = 0;
        boolean search = false;

        for (int i = 1; i <= max; i++) {
            if (inc.contains(i)) {
                if (search) {
                    toSub.put(i, current);
                    search = false;
                }
                continue;
            }
            search = true;
            current++;
        }

        if (search) {
            toSub.put(max, current);
        }

        for (int i = 0; i < nums.length; i++) {
            Integer r = toSub.get(nums[i]);
            if (r != null) {
                nums[i] -= r;
            }
        }

        return nums;
    }

}
