package cz.osu.student.R19584.Problem_0XX.Problem_04X;

import SharedCodeBase.Prime;

import java.util.HashSet;

public class Problem_049 {
    public static long main() {

        for(int num_1 = 1488; ; num_1++) {
            HashSet<String> seen = new HashSet<>();
            String s_num_1 = String.valueOf(num_1);
            for (int i = 0; i < s_num_1.length(); i++) seen.add(s_num_1.substring(i, i + 1));
            if (Prime.check(num_1)) {
                int num_2 = num_1 + 3330;
                if (Prime.check(num_2)) {
                    boolean allOK_2 = true;
                    String s_num_2 = String.valueOf(num_2);
                    for (int i = 0; i < s_num_2.length(); i++) if (!seen.contains(s_num_2.substring(i, i + 1))) allOK_2 = false;
                    if (allOK_2) {
                        int num_3 = num_2 + 3330;
                        if (Prime.check(num_3)) {
                            boolean allOK_3 = true;
                            String s_num_3 = String.valueOf(num_3);
                            for (int i = 0; i < s_num_3.length(); i++) if (!seen.contains(s_num_2.substring(i, i + 1))) allOK_3 = false;
                            if (allOK_3) {
                                return Long.parseLong("" + num_1 + num_2 + num_3);
                            }
                        }
                    }
                }
            }
        }
    }
}
