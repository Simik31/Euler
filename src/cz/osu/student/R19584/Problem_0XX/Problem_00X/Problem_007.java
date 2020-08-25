package cz.osu.student.R19584.Problem_0XX.Problem_00X;

import SharedCodeBase.Prime;

/*

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?

 */

public class Problem_007 {
    public static int main() {
        int number = 2, prime_counter = 0;
        for(; prime_counter < 10001; number++) {
            if (Prime.check(number)) prime_counter++;
        }
        return number;
    }
}
