package cz.osu.student.R19584.Problem_0XX.Problem_05X;

import SharedCodeBase.BooleanFunctions.Palindromic;

import java.math.BigInteger;

public class Problem_055 {
    public static long main() {
        int counter = 0;
        for(int num = 1; num < 10000; num++) {
            boolean palindromic = false;
            BigInteger in_num = BigInteger.valueOf(num);
            for (int round = 1; round <= 50 && !palindromic; round++) {
                StringBuilder reversed = new StringBuilder();
                for (int i = in_num.toString().length() - 1; i >= 0; i--) reversed.append(in_num.toString().charAt(i));
                in_num = in_num.add(new BigInteger(reversed.toString()));
                if (Palindromic.check(in_num)) palindromic = true;
            }
            if(!palindromic) counter++;
        }
        return counter;
    }
}
