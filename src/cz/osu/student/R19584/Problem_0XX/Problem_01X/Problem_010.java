package cz.osu.student.R19584.Problem_0XX.Problem_01X;

import SharedCodeBase.Prime;

public class Problem_010 {
    public static long main() {
        long prime_sum = 0;
        for(int number = 2; number < 2000000; number ++) if(Prime.check(number)) prime_sum += number;
        return prime_sum;
    }
}
