package cz.osu.student.R19584.Problem_0XX.Problem_04X;

import java.math.BigInteger;

/*

The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.

Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.

 */

public class Problem_048 {
    public static long main() {
        BigInteger num = BigInteger.ZERO;
        for(int i = 1; i <= 1000; i++) num = num.add(new BigInteger(String.valueOf(i)).pow(i));
        return Long.parseLong(num.toString().substring(num.toString().length() - 10));
    }
}
