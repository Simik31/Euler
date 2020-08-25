package cz.osu.student.R19584.Problem_0XX.Problem_02X;

/*

Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:

21 22 23 24 25
20  7  8  9 10
19  6  1  2 11
18  5  4  3 12
17 16 15 14 13

It can be verified that the sum of the numbers on the diagonals is 101.

What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?

 */

public class Problem_028 {

    public static long main() {
        int size = 1001, total = 0, layer = 0, counter = 3;
        for(int number = 1; number <= size * size; number += 2 * layer) {
            total += number;
            if(++counter == 4) {
                counter = 0;
                layer++;
            }
        }
        return total;
    }
}