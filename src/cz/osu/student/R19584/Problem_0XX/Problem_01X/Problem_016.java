package cz.osu.student.R19584.Problem_0XX.Problem_01X;

import java.math.BigInteger;

public class Problem_016 {
    public static long main() {
        long sum = 0;
        for(char ch : new BigInteger(String.valueOf(2)).pow(1000).toString().toCharArray()) sum += (ch - '0');
        return sum;
    }
}
