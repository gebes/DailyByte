package io.gebes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Given an integer array, nums, for each nums[i] you need to find the number of elements that are strictly smaller than it. Do this for all values in the array and return the result in an array.

Ex: Given the following nums...

nums = [1, 3], return [0, 1] (1 has 0 elements smaller than it and 3 has 1 element smaller than it).
Ex: Given the following nums...

nums = [4, 2, 9, 10, 3], return [2, 0, 3, 4, 1].
 */
public class DB12_SmallerElements {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerElements(new int[]{1, 3})));
        System.out.println(Arrays.toString(smallerElements(new int[]{4, 2, 9, 10, 3})));

        System.out.println(Arrays.toString(smallerElements2(new Integer[]{1, 3})));
        System.out.println(Arrays.toString(smallerElements2(new Integer[]{4, 2, 9, 10, 3})));
    }

    // Time O(n^2)
    // Space O(n)
    public static int[] smallerElements(int[] n) {
        int[] smaller = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            int c = 0;
            for (int k : n) {
                if (k < n[i]) {
                    c++;
                }
            }
            smaller[i] = c;
        }
        return smaller;
    }

    // Time O(n log n)
    // Space O(n)
    public static int[] smallerElements2(Integer[] n) {
        int[] smaller = new int[n.length];
        List<Integer> sorted = Arrays.asList(n.clone());
        Collections.sort(sorted);

        for (int i = 0; i < n.length; i++) {
           smaller[i] = sorted.indexOf(n[i]);
        }

        return smaller;
    }

}
