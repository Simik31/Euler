package cz.osu.student.R19584.Problem_0XX.Problem_03X;

public class Problem_039 {
    public static long main() {
        int max = 0, max_count = 0;
        for(int p = 1; p < 1001; p++) {
            int counter = 0;
            for (int a = 1; a < 400; a++) for(int b = 1; b < 400; b++) if (a + b + Math.sqrt(a * a + b * b) == p) counter++;
            if (counter > max_count) {
                max = p;
                max_count = counter;
            }
        }
        return max;
    }
}
