package cz.osu.student.R19584.Problem_0XX.Problem_06X;

public class Problem_068 {

    public static long main() {
        String result = "";
        int[] p = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        while (GetNextPerm(p)) {
            if (p[1] != 10 && p[2] != 10 && p[4] != 10 && p[6] != 10 && p[8] != 10 && p[0] <= p[3] && p[0] <= p[5] && p[0] <= p[7] && p[0] <= p[9] && p[0] + p[1] + p[2] == p[3] + p[2] + p[4] && p[0] + p[1] + p[2] == p[5] + p[4] + p[6] && p[0] + p[1] + p[2] == p[7] + p[6] + p[8] && p[0] + p[1] + p[2] == p[9] + p[8] + p[1]) {
                String candidate = "" + p[0] + p[1] + p[2] + p[3] + p[2] + p[4] + p[5] + p[4] + p[6] + p[7] + p[6] + p[8] + p[9] + p[8] + p[1];
                if (candidate.compareTo(result) > 0) result = candidate;
            }
        }
        return Long.parseLong(result);
    }

    private static boolean GetNextPerm(int[] p) {
        int N = p.length;
        int i = N - 1;
        while (p[i - 1] >= p[i]) if (--i < 1) return false;
        int j = N;
        while (p[j - 1] <= p[i - 1]) j = j - 1;
        int k = p[i - 1];
        p[i - 1] = p[j - 1];
        p[j - 1] = k;
        i++;
        j = N;
        while (i < j) {
            k = p[i - 1];
            p[i - 1] = p[j - 1];
            p[j - 1] = k;
            i++;
            j--;
        }
        return true;
    }
}
