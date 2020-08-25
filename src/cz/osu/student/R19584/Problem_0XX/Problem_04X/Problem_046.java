package cz.osu.student.R19584.Problem_0XX.Problem_04X;

import SharedCodeBase.Prime;

import java.util.ArrayList;

/*

It was proposed by Christian Goldbach that every odd composite number can be written as the sum of a prime and twice a square.

9 = 7 + 2×1^2
15 = 7 + 2×2^2
21 = 3 + 2×3^2
25 = 7 + 2×3^2
27 = 19 + 2×2^2
33 = 31 + 2×1^2

It turns out that the conjecture was false.

What is the smallest odd composite that cannot be written as the sum of a prime and twice a square?

 */

public class Problem_046 {
    public static long main() {
        for (int num = 1; ; num += 2) {
            ArrayList<Long> primes = Prime.get_bellow(num);
            for (int i = 0; i < primes.size(); i++) {
                if (Math.sqrt((num - primes.get(i)) / 2) % 1 == 0.0) break;
                if (i == primes.size() - 1) return num;
            }
        }
    }
}
