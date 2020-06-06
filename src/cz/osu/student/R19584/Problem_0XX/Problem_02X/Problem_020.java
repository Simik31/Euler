package cz.osu.student.R19584.Problem_0XX.Problem_02X;

import SharedCodeBase.Factorial;

public class Problem_020 {
    public static long main() {
        long sum = 0;
        for (char c : Factorial.String(100).toCharArray()) sum += c - '0';
        return sum;
    }
}
