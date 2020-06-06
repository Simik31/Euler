package cz.osu.student.R19584.Problem_0XX.Problem_01X;

public class Problem_015 {
    public static long main() {
        long paths = 1, i = 0;
        for ( ; i < 20; i++) {
            paths *= 40 - i;
            paths /= i + 1;
        }
        return paths;
    }
}
