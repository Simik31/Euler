package cz.osu.student.R19584.Problem_0XX.Problem_07X;

/*

Euler's Totient function, φ(n) [sometimes called the phi function], is used to determine the number of positive numbers less than or equal to n which are relatively prime to n. For example, as 1, 2, 4, 5, 7, and 8, are all less than nine and relatively prime to nine, φ(9)=6.
The number 1 is considered to be relatively prime to every positive number, so φ(1)=1.

Interestingly, φ(87109)=79180, and it can be seen that 87109 is a permutation of 79180.

Find the value of n, 1 < n < 107, for which φ(n) is a permutation of n and the ratio n/φ(n) produces a minimum.

 */

import SharedCodeBase.Prime;

import java.util.ArrayList;

public class Problem_070 {

    public static long main() {
        long best = 1;
        double bestRatio = Double.POSITIVE_INFINITY;
        ArrayList<Long> primes = Prime.get_in_range(2000, 5000);
        for (int i = 0; i < primes.size(); i++) {
            for (int j = i + 1; j < primes.size(); j++) {
                long n = primes.get(i) * primes.get(j);
                if (n < 10000001) {
                    long phi = (primes.get(i) - 1) * (primes.get(j) - 1);
                    double ratio = ((double) n) / phi;
                    if (isPerm(n, phi) && bestRatio > ratio) {
                        best = n;
                        bestRatio = ratio;
                    }
                }
            }
        }
        return best;
    }

    private static boolean isPerm(long m, long n) {
        int[] arr = new int[10];
        while (n > 0) {
            arr[(int)(n % 10)]++;
            n /= 10;
        }
        while (m > 0) {
            arr[(int)(m % 10)]--;
            m /= 10;
        }
        for (int i = 0; i < 10; i++) if (arr[i] != 0) return false;
        return true;
    }
}
