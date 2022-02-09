package io.gebes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Given two string arrays, word1 and word2, return whether or not the two arrays represent the same string.

Ex: Given the following word1 and word2…

word1 = ["abc", "d"], word2 = ["ab", "cd"], return true.
Ex: Given the following word1 and word2…

word1 = ["a", "b", "c"], word2 = ["a", "b", "d"], return false.
 */
public class DB2_CheckStrings {

    public static void main(String[] args) {
        System.out.println(checkStrings(new String[]{"abc", "d"}, new String[]{"ab", "cd"}));
        System.out.println(checkStrings(new String[]{"a", "b", "c"}, new String[]{"a", "b", "d"}));
        System.out.println(checkStrings(new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, new String[]{"abcdefghijklmnopqrstuvwxyz"}));
        System.out.println(checkStrings(new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, new String[]{"a"}));
    }

    // Time O(log n)
    // Space O(1)
    public static boolean checkStrings(String[] a, String[] b) {
        int ai = 0, bi = 0;
        int aj = 0, bj = 0;

        while (true) {
            boolean ae = false, be = false;
            if (ai >= a[aj].length()) {
                ai = 0;
                aj++;
                if (aj >= a.length) {
                    ae = true;
                }
            }

            if (bi >= b[bj].length()) {
                bi = 0;
                bj++;
                if (bj >= b.length) {
                    be = true;
                }
            }

            if (ae && be) {
                return true;
            } else if (ae || be) {
                return false;
            }

            if (a[aj].charAt(ai) != b[bj].charAt(bi)) {
                return false;
            }

            ai++;
            bi++;
        }

    }

}
