package io.gebes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Given a k-digit integer, num, return whether or not the number if magical.
Note: A magical numbers is a number in which the the sum of all its digits raised to the kth power sum to the number itself.

Ex: Given the following num…

num = 153, return true (1^3 + 5^3 + 3^3 = 153).
Ex: Given the following num…

num = 38, return false.
 */
public class DB1_MagicalNumber {

    public static void main(String[] args) {
        System.out.println("153: " +isMagicNumber(153));
        System.out.println("38: " +isMagicNumber(38));

        // Simple brute force
        List<Integer> nums = new ArrayList<>();
        int start = 0, end = 1000000;
        for (int i = start; i < end; i++) {
            if (isMagicNumber(i)){
                nums.add(i);
            }
        }
        System.out.println();
        System.out.println("Found some magic numbers between " + start + " and " + end);
        System.out.println(nums.stream().map(Object::toString).collect(Collectors.joining(", ")));
    }

    public static boolean isMagicNumber(int x){
        int xc = x;
        int d = 0;
        while (xc != 0) {
            d++;
            xc /= 10;
        }
        int s = 0;
        xc = x;
        while (xc != 0) {
            s += Math.pow(xc % 10, d);
            xc /= 10;
        }
        return s == x;
    }

}
