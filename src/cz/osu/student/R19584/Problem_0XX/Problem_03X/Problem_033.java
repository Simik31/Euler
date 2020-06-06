package cz.osu.student.R19584.Problem_0XX.Problem_03X;

public class Problem_033 {
    public static long main() {
        int dp = 1;
        int np = 1;
        int gcd = 1;
        for (int c = 1; c <= 9; c++) {
            for (int d = 1; d < c; d++) {
                for (int n = 1; n < d; n++) {
                    if ((n * 10 + c) * d == (c * 10 + d) * n) {
                        np *= n;
                        dp *= d;
                    }
                }
            }
        }
        for(int i = 1; i <= np; i++) if(np % i == 0 && dp % i == 0) gcd = i;
        return dp / gcd;
    }
}
