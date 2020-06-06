package cz.osu.student.R19584.Problem_0XX.Problem_00X;

public class Problem_001 {
    public static int main() {
        int sum = 0;
        for(int number = 1; number < 1000; number++) if(number % 3 == 0 || number % 5 == 0) sum += number;
       return sum;
    }
}
