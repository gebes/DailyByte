package io.gebes;

/*
This question is asked by Facebook. Given a string, return whether or not it forms a palindrome ignoring case and non-alphabetical characters.
Note: a palindrome is a sequence of characters that reads the same forwards and backwards.

Ex: Given the following strings...

"level", return true
"algorithm", return false
"A man, a plan, a canal: Panama.", return true
 */
public class DB6_ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(validPalindrome("level"));
        System.out.println(validPalindrome("algorithm"));
        System.out.println(validPalindrome("A man, a plan, a canal: Panama."));
    }

    // Time O(n)
    // Space O(n)
    public static boolean validPalindrome(String n) {
        n = n.toLowerCase();

        StringBuilder s = new StringBuilder();
        for (char c : n.toCharArray()) {
           if(Character.isAlphabetic(c)) s.append(c);
        }

        int half = s.length()/2;
        for (int i = 0; i < half; i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        
        return true;
    }

}
