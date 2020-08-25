package cz.osu.student.R19584.Problem_0XX.Problem_05X;

import java.math.BigInteger;

/*

A googol (10^100) is a massive number: one followed by one-hundred zeros; 100^100 is almost unimaginably large: one followed by two-hundred zeros. Despite their size, the sum of the digits in each number is only 1.

Considering natural numbers of the form, a^b, where a, b < 100, what is the maximum digital sum?

 */

public class Problem_056 {
    public static long main() {

        long max = 0;

        for(int a = 1; a < 100; a++) {
            for(int b = 1; b < 100; b++) {
                String number = BigInteger.valueOf(a).pow(b).toString();
                long sum = 0;
                for(int i = 0; i < number.length(); i++) sum += (number.charAt(i) - '0');
                if(sum > max) max = sum;
            }
        }
        return max;
    }
}
