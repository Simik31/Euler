package cz.osu.student.R19584.Problem_0XX.Problem_06X;

/*

The cube, 41063625 (3453), can be permuted to produce two other cubes: 56623104 (3843) and 66430125 (4053). In fact, 41063625 is the smallest cube which has exactly three permutations of its digits which are also cube.

Find the smallest cube for which exactly five permutations of its digits are cube.

 */

import SharedCodeBase.CubeNumber;

import java.util.HashMap;

public class Problem_062 {

    public static long main() {
        HashMap<Long, Long[]> cubes = new HashMap<>();
        for(long n = 0; ; n++) {
            long k = CubeNumber.get(n);
            int[] digits = new int[10];
            long smallestPerm = 0;
            while (k > 0) {
                digits[(int)(k % 10)]++;
                k /= 10;
            }
            for (int i = 9; i >= 0; i--) for (int j = 0; j < digits[i]; j++) smallestPerm = smallestPerm * 10 + i;
            if (!cubes.containsKey(smallestPerm)) cubes.put(smallestPerm, new Long[]{n, 0L});
            if (++cubes.get(smallestPerm)[1] == 5) return CubeNumber.get(cubes.get(smallestPerm)[0]);
        }
    }
}