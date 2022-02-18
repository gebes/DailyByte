package io.gebes;

/*
You are typing on a computer when all of a sudden you realize you've been typing with caps lock on. Given a string s, return a new string containing all of its alphabetical character transformed to lowercase.
Note: Do you not use an built in library functions.

Ex: Given the following string s...

s = "ABC", return "abc".
Ex: Given the following string s...

s = "ABCa", return "abca".
 */
public class DB11_CapsLock {

    public static void main(String[] args) {
        System.out.println(capsLock("ABC"));
        System.out.println(capsLock("ABCa"));
    }

    // Time O(n)
    // Space O(n)
    public static String capsLock(String n) {
        char[] chars = n.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) ('a' + (chars[i] - 'A'));
            }
        }
        return new String(chars);
    }

}
