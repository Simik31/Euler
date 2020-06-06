package cz.osu.student.R19584.Problem_0XX.Problem_02X;

public class Problem_021 {
    public static long main() {
        int sum = 0;
        for(int i = 1; i <= 10000; i++) {
            int num1 = 0, num2 = 0;
            for(int j = 1; j < i; j++) if(i % j == 0) num1 += j;
            for(int j = 1; j < num1; j++) if(num1 % j == 0) num2 += j;
            if(num1 == num2 || i != num2) continue;
            sum += num1 + num2;
        }
        return sum;
    }
}
