package io.gebes;

/*
This question is asked by Google. Given a string, return whether or not it uses capitalization correctly. A string correctly uses capitalization if all letters are capitalized, no letters are capitalized, or only the first letter is capitalized.

Ex: Given the following strings...

"USA", return true
"Calvin", return true
"compUter", return false
"coding", return true
 */
public class DB8_CorrectCapitalization {

    public static void main(String[] args) {
        System.out.println(correctCapitalization("USA"));
        System.out.println(correctCapitalization("Calvin"));
        System.out.println(correctCapitalization("compUter"));
        System.out.println(correctCapitalization("coding"));
    }

    // Time O(n)
    // Space O(1)
    public static boolean correctCapitalization(String n) {
        if (n.length() <= 1) return true;

        boolean f = Character.isUpperCase(n.charAt(0));
        boolean s = Character.isUpperCase(n.charAt(1));

        if (!f && s) return false;

        for (int i = 2; i < n.length(); i++) {
            if (f && s && !Character.isUpperCase(n.charAt(i)) || (!f || !s) && Character.isUpperCase(n.charAt(i))) {
                return false;
            }
        }
        return true;
    }

}
