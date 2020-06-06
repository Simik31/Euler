package cz.osu.student.R19584.Problem_0XX.Problem_04X;

import SharedCodeBase.Prime;

import java.util.ArrayList;

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
