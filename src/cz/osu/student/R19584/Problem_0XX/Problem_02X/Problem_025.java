package cz.osu.student.R19584.Problem_0XX.Problem_02X;

import java.math.BigInteger;

public class Problem_025 {

    public static long main() {
        BigInteger first = BigInteger.ONE;
        BigInteger second = BigInteger.ONE;
        BigInteger fibonacci_number;
        for(long index = 3; ; index++) {
            fibonacci_number = first.add(second);
            if(String.valueOf(fibonacci_number).length() == 1000) return index;
            first = second;
            second = fibonacci_number;
        }
    }
}