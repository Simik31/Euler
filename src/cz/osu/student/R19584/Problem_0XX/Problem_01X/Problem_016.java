package cz.osu.student.R19584.Problem_0XX.Problem_01X;

import java.math.BigInteger;

/*

2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?

 */

public class Problem_016 {
    public static long main() {
        long sum = 0;
        for(char ch : new BigInteger(String.valueOf(2)).pow(1000).toString().toCharArray()) sum += (ch - '0');
        return sum;
    }
}
