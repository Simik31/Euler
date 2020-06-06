package cz.osu.student.R19584.Problem_0XX.Problem_01X;

public class Problem_012 {
    public static long main() {
        long sum = 0, divisor_count = 0;
        for(long number = 1; divisor_count < 500; number++) {
            divisor_count = 0;
            sum += number;
            for (long i = 2; i <= Math.sqrt(sum); i++) if (sum % i == 0) divisor_count += 2;
        }
        return sum;
    }
}
