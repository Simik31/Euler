package cz.osu.student.R19584.Problem_0XX.Problem_04X;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem_043 {
    public static long main() {
        int[] divisors = new int[]{2, 3, 5, 7, 11, 13, 17};
        long sum = 0;
        for(int a = 1; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                if (b != a) {
                    for (int c = 0; c <= 9; c++) {
                        if (c != a && c != b) {
                            for (int d = 0; d <= 9; d++) {
                                if (d != a && d != b && d != c) {
                                    for (int e = 0; e <= 9; e++) {
                                        if (e != a && e != b && e != c && e != d) {
                                            for (int f = 0; f <= 9; f++) {
                                                if (f != a && f != b && f != c && f != d && f != e) {
                                                    for (int g = 0; g <= 9; g++) {
                                                        if (g != a && g != b && g != c && g != d && g != e && g != f) {
                                                            for (int h = 0; h <= 9; h++) {
                                                                if (h != a && h != b && h != c && h != d && h != e && h != f && h != g) {
                                                                    for (int i = 0; i <= 9; i++) {
                                                                        if (i != a && i != b && i != c && i != d && i != e && i != f && i != g && i != h) {
                                                                            for (int j = 0; j <= 9; j++) {
                                                                                if (j != a && j != b && j != c && j != d && j != e && j != f && j != g && j != h && j != i) {
                                                                                    String num = "" + a + b + c + d + e + f + g + h + i + j;
                                                                                    boolean allDivs = true;
                                                                                    for (int k = 0; k < 7; k++) {
                                                                                        if (Long.parseLong(num.substring(k + 1, k + 4)) % divisors[k] != 0) {
                                                                                            allDivs = false;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (allDivs) sum += Long.parseLong(num);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return sum;
    }
}