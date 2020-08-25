package cz.osu.student.R19584.Problem_0XX.Problem_05X;

import java.util.HashSet;

/*

It can be seen that the number, 125874, and its double, 251748, contain exactly the same digits, but in a different order.

Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.

 */

public class Problem_052 {
    public static long main() {
        for(int x = 1; ; x++) {
            HashSet<String>[] seen = new HashSet[5];
            for(int n = 2;  n <= 6; n++) {;
                String s_num = String.valueOf(n * x);
                seen[n - 2] = new HashSet<>();
                for (int i = 0; i < s_num.length(); i++) seen[n - 2].add(s_num.substring(i, i + 1));
            }
            if (seen[0].equals(seen[1]) && seen[0].equals(seen[2]) && seen[0].equals(seen[3]) && seen[0].equals(seen[4])) return x;
        }
    }
}
