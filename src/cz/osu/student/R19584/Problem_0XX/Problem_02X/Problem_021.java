package cz.osu.student.R19584.Problem_0XX.Problem_02X;

/*

Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.

 */

public class Problem_021 {
    public static long main() {
        int sum = 0;
        for(int i = 1; i <= 10000; i++) {
            int num1 = 0, num2 = 0;
            for(int j = 1; j < i; j++) if(i % j == 0) num1 += j;
            for(int j = 1; j < num1; j++) if(num1 % j == 0) num2 += j;
            if(num1 == num2 || i != num2) continue;
            sum += num1 + num2;
        }
        return sum;
    }
}
