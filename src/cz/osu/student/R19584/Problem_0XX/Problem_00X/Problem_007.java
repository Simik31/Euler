package cz.osu.student.R19584.Problem_0XX.Problem_00X;

import SharedCodeBase.Prime;

public class Problem_007 {
    public static int main() {
        int number = 2, prime_counter = 0;
        for(; prime_counter < 10001; number++) {
            if (Prime.check(number)) prime_counter++;
        }
        return number;
    }
}
