package cz.osu.student.R19584.Problem_0XX.Problem_06X;

import java.math.BigInteger;

public class Problem_066 {

    public static long main() {
        int result = 0;
        BigInteger pmax = BigInteger.ZERO;
        for(int D = 2; D <= 1000; D++) {
            BigInteger limit = BigInteger.valueOf((int) Math.sqrt(D));
            if (limit.multiply(limit).equals(BigInteger.valueOf(D))) continue;
            BigInteger m = BigInteger.ZERO, d = BigInteger.ONE, a = limit, numm1 = BigInteger.ONE, num = a, denm1 = BigInteger.ZERO, den = BigInteger.ONE;
            while (!num.multiply(num).subtract(den.multiply(den).multiply(BigInteger.valueOf(D))).equals(BigInteger.ONE)) {
                m = d.multiply(a).subtract(m);
                d = BigInteger.valueOf(D - m.multiply(m).intValueExact()).divide(d);
                a = limit.add(m).divide(d);
                BigInteger numm2 = numm1;
                numm1 = num;
                BigInteger denm2 = denm1;
                denm1 = den;
                num = a.multiply(num).add(numm2);
                den = a.multiply(denm1).add(denm2);
            }
            if (num.compareTo(pmax) > 0) {
                pmax = num;
                result = D;
            }
        }
        return result;
    }

}
