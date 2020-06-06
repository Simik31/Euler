package cz.osu.student.R19584.Problem_0XX.Problem_05X;

import java.util.HashSet;

public class Problem_052 {
    public static long main() {
        for(int x = 1; ; x++) {
            int[] nums = new int[5];
            String[] s_nums = new String[5];
            HashSet[] seens = new HashSet[5];
            for(int n = 2;  n <= 6; n++) {
                nums[n - 2] = n * x;
                String s_num = String.valueOf(n * x);
                s_nums[n - 2] = s_num;
                seens[n - 2] = new HashSet<>();
                for (int i = 0; i < s_num.length(); i++) seens[n - 2].add(s_num.substring(i, i + 1));
            }
            if (seens[0].equals(seens[1]) && seens[0].equals(seens[2]) && seens[0].equals(seens[3]) && seens[0].equals(seens[4])) return x;
        }
    }
}
