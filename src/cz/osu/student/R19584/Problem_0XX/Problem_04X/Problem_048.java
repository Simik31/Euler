package cz.osu.student.R19584.Problem_0XX.Problem_04X;

import java.math.BigInteger;

public class Problem_048 {
    public static long main() {
        BigInteger num = BigInteger.ZERO;
        for(int i = 1; i <= 1000; i++) num = num.add(new BigInteger(String.valueOf(i)).pow(i));
        return Long.parseLong(num.toString().substring(num.toString().length() - 10));
    }
}
