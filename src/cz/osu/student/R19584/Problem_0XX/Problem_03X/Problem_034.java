package cz.osu.student.R19584.Problem_0XX.Problem_03X;

import SharedCodeBase.Factorial;

public class Problem_034{
    public static long main() {
        int total = 0;
        for(int num = 3; num < 41000; num++) {
            String s_num = String.valueOf(num);
            int f_sum = 0;
            for (int i = 0; i < s_num.length(); i++) {
                f_sum += Factorial.Integer(Integer.parseInt(s_num.substring(i, i + 1)));
                if(f_sum > num) break;
            }
            if(num == f_sum) total += num;
        }
        return total;
    }
}
