package cz.osu.student.R19584.Problem_0XX.Problem_01X;

/*

The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.

 */

public class Problem_014 {
    public static long main() {
        long chain_length, longest_chain = -1, longest_chain_starting_number = -1;
        for(long starting_number = 1; starting_number < 1000000; starting_number++) {
            chain_length = 0;
            for(long number = starting_number; number != 1; chain_length++) {
                if (number % 2 == 0) number /= 2;
                else number = 3 * number + 1;
            }
            if(chain_length > longest_chain) {
                longest_chain = chain_length;
                longest_chain_starting_number = starting_number;
            }
        }
        return longest_chain_starting_number;
    }
}
