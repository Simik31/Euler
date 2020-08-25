package cz.osu.student.R19584.Problem_0XX.Problem_06X;

import java.math.BigInteger;

public class Problem_065 {

    public static long main() {
        int result = 0;
        BigInteger d = BigInteger.valueOf(1);
        BigInteger n = BigInteger.valueOf(2);
        for (int i = 2; i <= 100; i++) {
            BigInteger temp = d;
            d = n;
            if(i % 3 == 0) n = d.multiply(BigInteger.valueOf(2 * (i / 3))).add(temp);
            else n = d.add(temp);
        }
        for (char c : n.toString().toCharArray()) result += c - '0';
        return result;
    }
}
