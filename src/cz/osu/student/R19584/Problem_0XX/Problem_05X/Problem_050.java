package cz.osu.student.R19584.Problem_0XX.Problem_05X;

import SharedCodeBase.Prime;

import java.util.ArrayList;

/*

The prime 41, can be written as the sum of six consecutive primes:

41 = 2 + 3 + 5 + 7 + 11 + 13
This is the longest sum of consecutive primes that adds to a prime below one-hundred.

The longest sum of consecutive primes below one-thousand that adds to a prime, contains 21 terms, and is equal to 953.

Which prime, below one-million, can be written as the sum of the most consecutive primes?

 */

public class Problem_050 {
    public static long main() {
        ArrayList<Long> primes = Prime.get_bellow(1000000);
        for(int prime_id = 3; ; prime_id++) {
            for(int len = 540; len < primes.size() - prime_id; len++) {
                long sum = 0;
                for(int adder = 0; adder < len; adder++) sum += primes.get(prime_id + adder);
                if(sum < 1000000 && Prime.check(sum)) return sum;
            }
        }
    }
}
