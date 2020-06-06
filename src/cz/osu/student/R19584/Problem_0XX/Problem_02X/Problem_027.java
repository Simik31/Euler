package cz.osu.student.R19584.Problem_0XX.Problem_02X;

import SharedCodeBase.Prime;

public class Problem_027 {

    public static long main() {
        int max_a = 0, max_b = 0, max_n = 0;
        for (int a = -999; a < 1000; a += 2) {
            for (int b = -1000; b <= 1000; b++) {
                int n = 0;
                while (Prime.check(Math.abs(n * n + a * n + b))) n++;
                if (n > max_n) {
                    max_a = a;
                    max_b = b;
                    max_n = n;
                }
            }
        }
        return max_a * max_b;
    }



























}