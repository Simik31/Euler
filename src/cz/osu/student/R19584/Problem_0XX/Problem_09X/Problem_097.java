package cz.osu.student.R19584.Problem_0XX.Problem_09X;

import java.math.BigInteger;

/*

The first known prime found to exceed one million digits was discovered in 1999, and is a Mersenne prime of the form 2^(6972593)−1; it contains exactly 2,098,960 digits. Subsequently other Mersenne primes, of the form 2^(p)−1, have been found which contain more digits.

However, in 2004 there was found a massive non-Mersenne prime which contains 2,357,207 digits: 28433×2^(7830457)+1.

Find the last ten digits of this prime number.

 */

public class Problem_097 {
    public static long main() {
        String prime = BigInteger.TWO.pow(7830457).multiply(BigInteger.valueOf(28433)).toString();
        return Long.parseLong(prime.substring(prime.length() - 10)) + 1;
    }
}