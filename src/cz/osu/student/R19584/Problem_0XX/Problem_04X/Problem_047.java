package cz.osu.student.R19584.Problem_0XX.Problem_04X;

import SharedCodeBase.Prime;

public class Problem_047 {
    public static long main() {

        for(int i = (3 * 7 * 13 * 487); ; i += 3) {
            if(Prime.prime_divisors(i).size() == 4) {
                if (Prime.prime_divisors(i + 1).size() == 4) {
                    if (Prime.prime_divisors(i + 2).size() == 4) {
                        if (Prime.prime_divisors(i + 3).size() == 4) return i;
                    }
                }
            }
        }
    }
}
//134043