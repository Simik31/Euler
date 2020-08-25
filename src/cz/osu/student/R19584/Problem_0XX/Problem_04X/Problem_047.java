package cz.osu.student.R19584.Problem_0XX.Problem_04X;

import SharedCodeBase.Prime;

/*

The first two consecutive numbers to have two distinct prime factors are:

14 = 2 × 7
15 = 3 × 5

The first three consecutive numbers to have three distinct prime factors are:

644 = 2^2 × 7 × 23
645 = 3 × 5 × 43
646 = 2 × 17 × 19.

Find the first four consecutive integers to have four distinct prime factors each. What is the first of these numbers?

 */

public class Problem_047 {
    public static long main() {

        for(int i = (3 * 7 * 13 * 487); ; i += 3) {
            if(Prime.prime_divisors(i).size() == 4) {
                if (Prime.prime_divisors(i + 1).size() == 4) {
                    if (Prime.prime_divisors(i + 2).size() == 4) {
                        if (Prime.prime_divisors(i + 3).size() == 4) return i;
                    }
                }
            }
        }
    }
}
//134043