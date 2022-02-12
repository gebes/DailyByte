package io.gebes;

import java.util.HashMap;
import java.util.Map;

/*
You are typing on a broken keyboard trying to spell your friend's name. Since the keyboard is broken, sometimes when you press a key the key is typed one or more times. Given a string typed and a string namereturn whether or not you've successfully typed your friend's name even though certain keys might be repeated.
Note: Both strings will only contain lowercase alphabetical characters.

Ex: Given the following typed and name...

typed = "kkevin", name = "kevin", return true.
Ex: Given the following typed and name...

typed = "timmm", name = "timmy", return false.
 */
public class DB5_BrokenKeyboard {

    public static void main(String[] args) {
        System.out.println(brokenKeyboard("kkevin", "kevin"));
        System.out.println(brokenKeyboard("timmm", "timmy"));
    }

    // Time O(n)
    // Space O(1)
    public static boolean brokenKeyboard(String brokenName, String name) {
        int i = 0;
        int j = 0;

        char[] ichars = brokenName.toCharArray();
        char[] jchars = name.toCharArray();

        if(ichars[0] != jchars[0]){
            return false;
        }

        char s = jchars[0];

        while (true) {
            int ci = 0, cj = 0;
            boolean oi = false, oj = false;
            while(ichars[i] == s){
                ci++;
                i++;
                if (i == ichars.length){
                    oi = true;
                    break;
                }
            }
            while(jchars[j] == s){
                cj++;
                j++;
                if (j == jchars.length){
                    oj = true;
                    break;
                }
            }

            if(ci < cj){
                return false;
            }
            if(oi && oj){
                return true;
            }else if(oi || oj) {
                return false;
            }
            s = jchars[j];
        }
    }

}
