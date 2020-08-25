package cz.osu.student.R19584.Problem_0XX.Problem_04X;

import SharedCodeBase.Prime;

import java.util.HashSet;

/*

We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once. For example, 2143 is a 4-digit pandigital and is also prime.

What is the largest n-digit pandigital prime that exists?

 */

public class Problem_041 {
    public static long main() {
        for(long num = 7654321; ; num--) {
            String s_num = String.valueOf(num);
            if(!s_num.contains("0")) {
                if (Prime.check(s_num)) {
                    HashSet<Integer> seen = new HashSet<>();
                    for (int i = 0; i < s_num.length(); i++) {
                        int n = Integer.parseInt(s_num.substring(i, i + 1));
                        if(!(n > 0 && n <= s_num.length())) break;
                        seen.add(n);
                    }
                    if (seen.size() == s_num.length()) return num;
                }
            }
        }
    }
}
