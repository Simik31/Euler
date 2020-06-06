package cz.osu.student.R19584.Problem_0XX.Problem_02X;

import java.util.HashSet;

public class Problem_029 {

    public static long main() {
        HashSet<Double> results = new HashSet<>();
        for(int a = 2; a <= 100; a++) {
            for(int b = 2; b <= 100; b++) {
                results.add(Math.pow(a, b));
            }
        }
        return results.size();
    }
}