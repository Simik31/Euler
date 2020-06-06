package cz.osu.student.R19584.Problem_0XX.Problem_03X;

public class Problem_030 {
    public static long main() {
        int total = 0;
        for(int number = 2; number < 200000; number++) {
            String num = String.valueOf(number);
            int num_tot = 0;
            for(int i = 0; i < num.length(); i++) num_tot += Math.pow(Integer.parseInt(num.substring(i, i + 1)), 5);
            if(num_tot == number) total += number;
        }
        return total;
    }
}
