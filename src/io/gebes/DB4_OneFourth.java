package io.gebes;

import java.util.*;

/*
Given an array of integers, nums, sorted in ascending order, return the element that occurs more than one fourth of the time.
Note: If no element appears more than a fourth of the time, return -1.

Ex: Given the following nums...

nums = [1, 2, 2, 3, 4], return 2.
Ex: Given the following nums...

nums = [1, 2, 3, 4], return -1.
 */
public class DB4_OneFourth {

    public static void main(String[] args) {
        System.out.println(oneFourth(new int[]{1, 2, 2, 3, 4}));
        System.out.println(oneFourth(new int[]{1, 2, 3, 4}));
        System.out.println(oneFourth2(new int[]{1, 2, 2, 3, 4}));
        System.out.println(oneFourth2(new int[]{1, 2, 3, 4}));
    }

    // Time O(n)
    // Space O(n)
    public static int oneFourth(int[] nums) {
        if (nums.length == 0) return -1;

        int fourth = nums.length / 4;

        Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() > fourth) {
                return entry.getKey();
            }
        }

        return -1;
    }

    // Time O(n)
    // Space O(1)
    public static int oneFourth2(int[] nums){
        if (nums.length == 0) return -1;

        int fourth = nums.length/4;
        int current = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if(current != nums[i]){
                if(count > fourth){
                    return current;
                }
                current = nums[i];
                continue;
            }
            count++;
        }
        return -1;
    }

}
