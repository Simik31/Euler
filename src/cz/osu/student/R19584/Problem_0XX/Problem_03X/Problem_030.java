package cz.osu.student.R19584.Problem_0XX.Problem_03X;

/*

Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

1634 = 1^4 + 6^4 + 3^4 + 4^4
8208 = 8^4 + 2^4 + 0^4 + 8^4
9474 = 9^4 + 4^4 + 7^4 + 4^4

As 1 = 1^4 is not a sum it is not included.

The sum of these numbers is 1634 + 8208 + 9474 = 19316.

Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.

 */

public class Problem_030 {
    public static long main() {
        int total = 0;
        for(int number = 2; number < 200000; number++) {
            String num = String.valueOf(number);
            int num_tot = 0;
            for(int i = 0; i < num.length(); i++) num_tot += Math.pow(Integer.parseInt(num.substring(i, i + 1)), 5);
            if(num_tot == number) total += number;
        }
        return total;
    }
}
