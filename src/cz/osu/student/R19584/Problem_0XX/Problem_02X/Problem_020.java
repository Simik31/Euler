package cz.osu.student.R19584.Problem_0XX.Problem_02X;

import SharedCodeBase.Factorial;

/*

n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!

 */

public class Problem_020 {
    public static long main() {
        long sum = 0;
        for (char c : Factorial.String(100).toCharArray()) sum += c - '0';
        return sum;
    }
}
