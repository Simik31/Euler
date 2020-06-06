package cz.osu.student.R19584.Problem_0XX.Problem_00X;

public class Problem_002 {
    public static int main() {
        int first = 0, second = 1, sum = 0, fibonacci_number;
        while(true) {
            fibonacci_number = first + second;
            if(fibonacci_number > 4000000) break;
            first = second;
            second = fibonacci_number;
            if(second % 2 == 0) sum += second;
        }
        return sum;
    }
}
