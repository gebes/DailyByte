package io.gebes;

/*
Given a string, s, make it acceptable. An acceptable string is a string that contains no two adjacent characters that are the same with one letter being capitalized and the other being lowercased.
Note: An empty string is acceptable and only one distinct answer will exist.

Ex: Given the following string s...

s = "Aabb", return "bb".
Ex: Given the following string s...

s = "AabBcC", return "".
 */
public class DB7_AcceptableString {

    public static void main(String[] args) {
        System.out.println(acceptableString("Aabb"));
        System.out.println(acceptableString("AabBcC"));
    }

    // Time O(n)
    // Space O(n)
    public static String acceptableString(String n) {
        StringBuilder out = new StringBuilder();
        char[] chars = n.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if (Character.toLowerCase(chars[i]) == Character.toLowerCase(chars[i + 1]) &&
                Character.isUpperCase(chars[i]) ^ Character.isUpperCase(chars[i + 1])) {
                i += 1;
            } else {
                out.append(chars[i]).append(chars[i + 1]);
            }
        }
        return out.toString();
    }

}
