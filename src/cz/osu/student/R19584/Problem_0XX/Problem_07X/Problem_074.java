package cz.osu.student.R19584.Problem_0XX.Problem_07X;

/*

The number 145 is well known for the property that the sum of the factorial of its digits is equal to 145:

1! + 4! + 5! = 1 + 24 + 120 = 145

Perhaps less well known is 169, in that it produces the longest chain of numbers that link back to 169; it turns out that there are only three such loops that exist:

169 → 363601 → 1454 → 169
871 → 45361 → 871
872 → 45362 → 872

It is not difficult to prove that EVERY starting number will eventually get stuck in a loop. For example,

69 → 363600 → 1454 → 169 → 363601 (→ 1454)
78 → 45360 → 871 → 45361 (→ 871)
540 → 145 (→ 145)

Starting with 69 produces a chain of five non-repeating terms, but the longest non-repeating chain with a starting number below one million is sixty terms.

How many chains, with a starting number below one million, contain exactly sixty non-repeating terms?

 */

import SharedCodeBase.Factorial;

import java.util.HashSet;

public class Problem_074 {

    public static long main() {
        int count = 0;
        for(long input = 1479; input < 974323; input++) {
            long out = input, counter = 0;
            HashSet<Long> seen = new HashSet<>();
            do {
                char[] x1 = String.valueOf(out).toCharArray();
                out = 0;
                for (char c : x1) out += Factorial.Long(c - '0');
                counter++;
                if (seen.contains(out)) break;
                seen.add(out);
            } while (out != input && counter <= 60);
            if(counter == 60) count++;
        }
        return count;
    }
}
