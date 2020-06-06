package cz.osu.student.R19584.Problem_0XX.Problem_05X;

import SharedCodeBase.Combination;

import java.math.BigInteger;

public class Problem_053 {
    public static long main() {
        int counter = 0;
        for(int n = 1; n <= 100; n++) for(int r = 1; r <= n; r++) if (Combination.BigInteger(n, r).compareTo(BigInteger.valueOf(1000000)) > 0) counter++;
        return counter;
    }
}