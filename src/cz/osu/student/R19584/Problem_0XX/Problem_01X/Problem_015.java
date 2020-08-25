package cz.osu.student.R19584.Problem_0XX.Problem_01X;

/*

Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.

How many such routes are there through a 20×20 grid?

 */

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
