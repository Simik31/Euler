package cz.osu.student.R19584.Problem_0XX.Problem_03X;

import SharedCodeBase.BooleanFunctions.Palindromic;

public class Problem_036 {
    public static long main() {
        int sum = 0;
        for(int num = 1; num < 1000001; num++) {
            if(Palindromic.check(num) && Palindromic.check(Integer.toBinaryString(num))) sum += num;
        }
        return sum;
    }
}
