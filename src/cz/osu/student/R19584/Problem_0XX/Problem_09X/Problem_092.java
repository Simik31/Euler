package cz.osu.student.R19584.Problem_0XX.Problem_09X;

import SharedCodeBase.Pow;

/*

A number chain is created by continuously adding the square of the digits in a number to form a new number until it has been seen before.

For example,

44 → 32 → 13 → 10 → 1 → 1
85 → 89 → 145 → 42 → 20 → 4 → 16 → 37 → 58 → 89

Therefore any chain that arrives at 1 or 89 will become stuck in an endless loop. What is most amazing is that EVERY starting number will eventually arrive at 1 or 89.

How many starting numbers below ten million will arrive at 89?

 */

public class Problem_092 {
    public static long main() {
        int counter = 0;
        for(long num = 1, tmp = 1; num < 10000000; num++, tmp = num) {
            long num_squared = 0;
            while (num_squared != 1 && num_squared != 89) {
                num_squared = 0;
                String s_num = String.valueOf(tmp);
                for (int i = 0; i < s_num.length(); i++) num_squared += Pow.Long(s_num.charAt(i) - '0', 2);
                tmp = num_squared;
            }
            if(num_squared == 89) counter++;
        }
        return counter;
    }
}
