package cz.osu.student.R19584.Problem_0XX.Problem_03X;

import SharedCodeBase.Prime;

/*

The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and 719, are themselves prime.

There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.

How many circular primes are there below one million?

 */

public class Problem_035 {
    public static long main() {
        int counter = 0;
        for(int num = 2; num < 1000001; num++) {
            String s_num = String.valueOf(num);
            boolean arePrime = true;
            for (int i = 0; i < s_num.length(); i++) {
                if(!Prime.check(Integer.parseInt(s_num.substring(i) + s_num.substring(0, i)))) {
                    arePrime = false;
                    break;
                }
            }
            if(arePrime) counter++;
        }
        return counter;
    }
}
