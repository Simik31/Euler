package cz.osu.student.R19584.Problem_0XX.Problem_03X;

import SharedCodeBase.Prime;

/*

The number 3797 has an interesting property. Being prime itself, it is possible to continuously remove digits from left to right, and remain prime at each stage: 3797, 797, 97, and 7. Similarly we can work from right to left: 3797, 379, 37, and 3.

Find the sum of the only eleven primes that are both truncatable from left to right and right to left.

NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.

 */

public class Problem_037 {
    public static long main() {
        int sum = 0, counter = 0;
        for(int num = 10; counter < 11; num++) {
            String s_num = String.valueOf(num);
            boolean arePrime = true;
            for (int i = 0; i < s_num.length(); i++) {
                String left = s_num.substring(i);
                String right = s_num.substring(0, s_num.length() - i);
                if (left.equals("1") || right.equals("1") || !(Prime.check(left) && Prime.check(right))) {
                    arePrime = false;
                    break;
                }
            }
            if (arePrime) {
                sum += num;
                counter++;
            }
        }
        return sum;
    }
}
