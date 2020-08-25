package cz.osu.student.R19584.Problem_0XX.Problem_05X;

import SharedCodeBase.Combination;

import java.math.BigInteger;

/*

There are exactly ten ways of selecting three from five, 12345:

123, 124, 125, 134, 135, 145, 234, 235, 245, and 345

In combinatorics, we use the notation, (5 3)=10.

In general, (n r)=n!r!(n−r)!, where r≤n, n!=n×(n−1)×...×3×2×1, and 0!=1.

It is not until n=23, that a value exceeds one-million: (23 10)=1144066.

How many, not necessarily distinct, values of (n r) for 1≤n≤100, are greater than one-million?

 */

public class Problem_053 {
    public static long main() {
        int counter = 0;
        for(int n = 1; n <= 100; n++) for(int r = 1; r <= n; r++) if (Combination.BigInteger(n, r).compareTo(BigInteger.valueOf(1000000)) > 0) counter++;
        return counter;
    }
}