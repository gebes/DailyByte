package io.gebes;

/*
You are given a certain number of candies and an exchange rate. For every exchange number of candy wrappers that you trade in, you receive an additional candy. Return the maximum number of candies that you can eat.
Note: Each candy is wrapped in a candy wrapped.

Ex: Given the following candies and exchange...

candies = 3, exchange = 3, return 4 (each your three candies, exchange 3 wrappers, each additional candy).
Ex: Given the following candies and exchange...

candies = 3, exchange = 4, return 3.
 */
public class DB10_EatingCandy {

    public static void main(String[] args) {
        System.out.println(eatingCandy(3, 3));
        System.out.println(eatingCandy(3, 4));
    }

    // Time O(1)
    // Space O(1)
    public static int eatingCandy(int candies, int exchange) {
        return candies + (candies / exchange);
    }

}
