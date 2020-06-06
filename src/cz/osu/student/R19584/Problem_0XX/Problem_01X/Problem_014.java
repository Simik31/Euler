package cz.osu.student.R19584.Problem_0XX.Problem_01X;

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
