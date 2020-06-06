package cz.osu.student.R19584.Problem_0XX.Problem_05X;

import java.math.BigInteger;

public class Problem_056 {
    public static long main() {

        long max = 0;

        for(int a = 1; a < 100; a++) {
            for(int b = 1; b < 100; b++) {
                String number = BigInteger.valueOf(a).pow(b).toString();
                long sum = 0;
                for(int i = 0; i < number.length(); i++) sum += (number.charAt(i) - '0');
                if(sum > max) max = sum;
            }
        }
        return max;
    }
}
