package cz.osu.student.R19584.Problem_0XX.Problem_05X;

import SharedCodeBase.Prime;

public class Problem_058 {
    public static long main() {
        long layer = 1, counter = 0, prime_counter = 0;
        for(long number = 3; ; number += layer * 2) {
            if (Prime.check(number)) prime_counter++;
            if(++counter == 4) {
                if(prime_counter / (4.0 * layer + 1) < 0.1) return 2 * layer + 1;
                counter = 0;
                layer++;
            }
        }
    }
}