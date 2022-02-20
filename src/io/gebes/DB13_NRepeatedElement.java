package io.gebes;

import java.util.*;

/*
You are given an integer array, nums, which contains 2N elements. Within nums there are N + 1 unique elements and a specific element occurs N times. Return the element within nums that appears N times.

Ex: Given the following nums…

nums = [3, 3, 5, 1], return 3.
Ex: Given the following nums…

nums = [4, 2, 4, 5, 4, 1], return 4.

 */
public class DB13_NRepeatedElement {

    public static void main(String[] args) {
        System.out.println(nRepeatedElement(new int[]{3, 3, 5, 1}));
        System.out.println(nRepeatedElement(new int[]{4, 2, 4, 5, 4, 1}));
    }

    // Time O(n)
    // Space O(n)
    public static int nRepeatedElement(int[] n) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int k : n) {
            count.put(k, count.getOrDefault(k, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() == n.length / 2) {
                return entry.getValue();
            }
        }
        return -1;
    }

}
