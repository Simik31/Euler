package cz.osu.student.R19584.Problem_0XX.Problem_05X;

/*

By replacing the 1st digit of the 2-digit number *3, it turns out that six of the nine possible values: 13, 23, 43, 53, 73, and 83, are all prime.

By replacing the 3rd and 4th digits of 56**3 with the same digit, this 5-digit number is the first example having seven primes among the ten generated numbers, yielding the family: 56003, 56113, 56333, 56443, 56663, 56773, and 56993. Consequently 56003, being the first member of this family, is the smallest prime with this property.

Find the smallest prime which, by replacing part of the number (not necessarily adjacent digits) with the same digit, is part of an eight prime value family.

 */

import SharedCodeBase.Prime;

public class Problem_051 {
    public static long main() {

        int result = Integer.MAX_VALUE;

        for (int i = 11; i < 1000; i += 2) {
            if (i % 5 == 0) continue;
            int[][] patterns;
            if(i < 100) {
                patterns = new int[4][];
                patterns[0] = new int[]{1,0,0,0,1};
                patterns[1] = new int[]{0,1,0,0,1};
                patterns[2] = new int[]{0,0,1,0,1};
                patterns[3] = new int[]{0,0,0,1,1};
            } else {
                patterns = new int[10][];
                patterns[0] = new int[] { 1, 1, 0, 0, 0, 1 };
                patterns[1] = new int[] { 1, 0, 1, 0, 0, 1 };
                patterns[2] = new int[] { 1, 0, 0, 1, 0, 1 };
                patterns[3] = new int[] { 1, 0, 0, 0, 1, 1 };
                patterns[4] = new int[] { 0, 1, 1, 0, 0, 1 };
                patterns[5] = new int[] { 0, 1, 0, 1, 0, 1 };
                patterns[6] = new int[] { 0, 1, 0, 0, 1, 1 };
                patterns[7] = new int[] { 0, 0, 1, 1, 0, 1 };
                patterns[8] = new int[] { 0, 0, 1, 0, 1, 1 };
                patterns[9] = new int[] { 0, 0, 0, 1, 1, 1 };;
            }

            for (int[] ints : patterns) {
                for (int k = 0; k <= 2; k++) {
                    if (ints[0] == 0 && k == 0) continue;
                    int[] pattern = new int[ints.length];
                    int temp = i;
                    for (int l = pattern.length - 1; l >= 0; l--) {
                        if (ints[l] == 1) {
                            pattern[l] = temp % 10;
                            temp /= 10;
                        } else pattern[l] = -1;
                    }
                    int candidate = 0;
                    for (int value : pattern) {
                        if(value == -1) candidate = candidate * 10 + k;
                        else candidate = candidate * 10 + value;
                    }
                    if (candidate < result && Prime.check(candidate)) {
                        int familySize = 1;
                        for (int l = k + 1; l < 10; l++) {
                            temp = 0;
                            for (int value : pattern) {
                                if(value == -1) temp = temp * 10 + l;
                                else temp = temp * 10 + value;
                            }
                            if (Prime.check(temp)) familySize++;
                        }
                        if (familySize == 8) result = candidate;
                        break;
                    }
                }
            }
        }
        return result;
    }
}


