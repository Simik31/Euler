package cz.osu.student.R19584.Problem_0XX.Problem_04X;

/*

The number, 1406357289, is a 0 to 9 pandigital number because it is made up of each of the digits 0 to 9 in some order, but it also has a rather interesting sub-string divisibility property.

Let d1 be the 1st digit, d2 be the 2nd digit, and so on. In this way, we note the following:

d2d3d4=406 is divisible by 2
d3d4d5=063 is divisible by 3
d4d5d6=635 is divisible by 5
d5d6d7=357 is divisible by 7
d6d7d8=572 is divisible by 11
d7d8d9=728 is divisible by 13
d8d9d10=289 is divisible by 17
Find the sum of all 0 to 9 pandigital numbers with this property.

 */

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