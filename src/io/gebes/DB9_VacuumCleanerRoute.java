package io.gebes;

/*
This question is asked by Amazon. Given a string representing the sequence of moves a robot vacuum makes, return whether or not it will return to its original position. The string will only contain L, R, U, and D characters, representing left, right, up, and down respectively.

Ex: Given the following strings...

"LR", return true
"URURD", return false
"RUULLDRD", return true
 */
public class DB9_VacuumCleanerRoute {

    public static void main(String[] args) {
        System.out.println(vacuumCleanerRoute("LR"));
        System.out.println(vacuumCleanerRoute("URURD"));
        System.out.println(vacuumCleanerRoute("RUULLDRD"));
    }

    // Time O(n)
    // Space O(1)
    public static boolean vacuumCleanerRoute(String n) {
        int x = 0, y = 0;

        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            switch (c) {
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid char: " + c);
            }
        }

        return x == 0 && y == 0;
    }

}
