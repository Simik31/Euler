package cz.osu.student.R19584.Problem_0XX.Problem_00X;

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
