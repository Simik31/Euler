package cz.osu.student.R19584.Problem_0XX.Problem_06X;

import java.math.BigInteger;

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
