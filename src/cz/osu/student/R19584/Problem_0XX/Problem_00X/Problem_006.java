package cz.osu.student.R19584.Problem_0XX.Problem_00X;

/*

The sum of the squares of the first ten natural numbers is,

1^2+2^2+...+10^2=385
The square of the sum of the first ten natural numbers is,

(1+2+...+10)^2=55^2=3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025−385=2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

 */

public class Problem_006 {
    public static int main() {
        long sum_of_squares = 0L, square_of_sums = 0L;
        for(int number = 1; number <= 100; number++) {
            sum_of_squares += Math.pow(number, 2);
            square_of_sums += number;
        }
        return (int)(Math.pow(square_of_sums, 2) - sum_of_squares);
    }
}
