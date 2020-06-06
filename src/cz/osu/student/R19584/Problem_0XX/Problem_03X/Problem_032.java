package cz.osu.student.R19584.Problem_0XX.Problem_03X;

import java.util.HashSet;

public class Problem_032 {
    public static long main() {
        HashSet<Integer> all = new HashSet<>();
        int final_sum = 0;
        for(int a = 1; a < 10000 + 1; a++) {
            for(int b = 1; b < (10000 / a) + 1; b++) {
                int sum = a * b;
                if(all.contains(sum)) continue;
                String whole_number = "" + a + b + sum;
                if(whole_number.length() != 9) continue;
                if(whole_number.contains("0")) continue;
                HashSet<Character> seen = new HashSet<>();
                for(char c : whole_number.toCharArray()) seen.add(c);
                if (seen.size() == 9) {
                    all.add(sum);
                    final_sum += sum;
                }
            }
        }
        return final_sum;
    }
}
