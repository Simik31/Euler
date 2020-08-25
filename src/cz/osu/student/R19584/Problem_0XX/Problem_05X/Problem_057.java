package cz.osu.student.R19584.Problem_0XX.Problem_05X;

import java.math.BigInteger;

/*

It is possible to show that the square root of two can be expressed as an infinite continued fraction.

2–√=1+12+12+12+…
By expanding this for the first four iterations, we get:

1+1/2 = 3/2 = 1.5
1+1/(2+1/2) = 7/5 = 1.4
1+1/(2+1/(2+1/2)) = 17/12 = 1.41666…
1+1/(2+1/(2+1/(2+1/2))) = 41/29 = 1.41379…

The next three expansions are 99/70, 239/169, and 577/408, but the eighth expansion, 1393/985, is the first example where the number of digits in the numerator exceeds the number of digits in the denominator.

In the first one-thousand expansions, how many fractions contain a numerator with more digits than the denominator?

 */

public class Problem_057 {
    public static long main() {
        int counter = 0;
        for(int i = 0; i < 1000; i++) {
            String fraction = fraction(i);
            String denominator = fraction.split("/")[1];
            BigInteger numerator = new BigInteger(denominator).add(new BigInteger(fraction.split("/")[0]));
            if (numerator.toString().length() > denominator.length()) counter++;
        }
        return counter;
    }

    private static String fraction(int iter) {
        if(iter == 0) return "1/2";
        String fraction = fraction(iter - 1);
        String denominator = fraction.split("/")[1];
        return denominator + "/" + new BigInteger(denominator).multiply(BigInteger.TWO).add(new BigInteger(fraction.split("/")[0]));
    }
}