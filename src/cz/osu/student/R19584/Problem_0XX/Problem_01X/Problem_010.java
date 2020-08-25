package cz.osu.student.R19584.Problem_0XX.Problem_01X;

import SharedCodeBase.Prime;

/*

The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.

 */

public class Problem_010 {
    public static long main() {
        long prime_sum = 0;
        for(int number = 2; number < 2000000; number ++) if(Prime.check(number)) prime_sum += number;
        return prime_sum;
    }
}
