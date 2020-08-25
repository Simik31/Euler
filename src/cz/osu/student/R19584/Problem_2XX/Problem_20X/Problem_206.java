package cz.osu.student.R19584.Problem_2XX.Problem_20X;

import SharedCodeBase.Pow;

/*

Find the unique positive integer whose square has the form 1_2_3_4_5_6_7_8_9_0,
where each “_” is a single digit.

 */

public class Problem_206 {
    public static long main() {
        long start = (long) Math.sqrt(1020304050607080900L);
        long end = (long) Math.sqrt(1929394959697989990L);
        String[] pattern = {"1", "", "2", "", "3", "", "4", "", "5", "", "6", "", "7", "", "8", "", "9", "", "0"};
        for(long num = start; num < end + 1; num++) {
            String s_num = String.valueOf(Pow.Long(num, 2));
            boolean allOk = true;
            for(int i = 0; i < s_num.length(); i += 2) {
                if(!s_num.substring(i, i + 1).equals(pattern[i])) {
                    allOk = false;
                    break;
                }
            }
            if(allOk) return num;
        }
        return -1;
    }
}
