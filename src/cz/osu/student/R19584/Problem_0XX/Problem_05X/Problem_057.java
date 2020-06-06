package cz.osu.student.R19584.Problem_0XX.Problem_05X;

import java.math.BigInteger;

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