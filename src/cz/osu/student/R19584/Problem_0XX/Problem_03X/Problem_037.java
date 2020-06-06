package cz.osu.student.R19584.Problem_0XX.Problem_03X;

import SharedCodeBase.Prime;

public class Problem_037 {
    public static long main() {
        int sum = 0, counter = 0;
        for(int num = 10; counter < 11; num++) {
            String s_num = String.valueOf(num);
            boolean arePrime = true;
            for (int i = 0; i < s_num.length(); i++) {
                String left = s_num.substring(i);
                String right = s_num.substring(0, s_num.length() - i);
                if (left.equals("1") || right.equals("1") || !(Prime.check(left) && Prime.check(right))) {
                    arePrime = false;
                    break;
                }
            }
            if (arePrime) {
                sum += num;
                counter++;
            }
        }
        return sum;
    }
}
