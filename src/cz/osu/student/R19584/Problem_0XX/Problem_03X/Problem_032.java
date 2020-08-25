package cz.osu.student.R19584.Problem_0XX.Problem_03X;

import java.util.HashSet;

/*

We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once; for example, the 5-digit number, 15234, is 1 through 5 pandigital.

The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing multiplicand, multiplier, and product is 1 through 9 pandigital.

Find the sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital.

HINT: Some products can be obtained in more than one way so be sure to only include it once in your sum.

 */

public class Problem_032 {
    public static long main() {
        HashSet<Integer> all = new HashSet<>();
        int final_sum = 0;
        for(int a = 1; a < 10000 + 1; a++) {
            for(int b = 1; b < (10000 / a) + 1; b++) {
                int sum = a * b;
                if(all.contains(sum)) continue;
                String whole_number = "" + a + b + sum;
                if(whole_number.length() != 9) continue;
                if(whole_number.contains("0")) continue;
                HashSet<Character> seen = new HashSet<>();
                for(char c : whole_number.toCharArray()) seen.add(c);
                if (seen.size() == 9) {
                    all.add(sum);
                    final_sum += sum;
                }
            }
        }
        return final_sum;
    }
}
