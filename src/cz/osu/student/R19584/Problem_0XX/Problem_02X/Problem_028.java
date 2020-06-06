package cz.osu.student.R19584.Problem_0XX.Problem_02X;

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