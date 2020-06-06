package cz.osu.student.R19584.Problem_0XX.Problem_03X;

import SharedCodeBase.Prime;

public class Problem_035 {
    public static long main() {
        int counter = 0;
        for(int num = 2; num < 1000001; num++) {
            String s_num = String.valueOf(num);
            boolean arePrime = true;
            for (int i = 0; i < s_num.length(); i++) {
                if(!Prime.check(Integer.parseInt(s_num.substring(i) + s_num.substring(0, i)))) {
                    arePrime = false;
                    break;
                }
            }
            if(arePrime) counter++;
        }
        return counter;
    }
}
