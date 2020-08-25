package cz.osu.student.R19584.Problem_0XX.Problem_03X;

import SharedCodeBase.Palindromic;

/*

The decimal number, 585 = 1001001001 (binary), is palindromic in both bases.

Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.

(Please note that the palindromic number, in either base, may not include leading zeros.)

 */

public class Problem_036 {
    public static long main() {
        int sum = 0;
        for(int num = 1; num < 1000001; num++) if(Palindromic.check(num) && Palindromic.check(Integer.toBinaryString(num))) sum += num;
        return sum;
    }
}
