package cz.osu.student.R19584.Problem_0XX.Problem_06X;

import java.math.BigInteger;

/*

The 5-digit number, 16807=7^5, is also a fifth power. Similarly, the 9-digit number, 134217728=8^9, is a ninth power.

How many n-digit positive integers exist which are also an nth power?

 */

public class Problem_063 {

    public static long main() {
        int counter = 0;
        for(int n = 1; n < 25; n++) {
            for (int x = 1; x <= 9; x++) {
                BigInteger d = BigInteger.valueOf(x).pow(n);
                if (d.toString().length() == n) counter++;
            }
        }
        return counter;
    }
}
