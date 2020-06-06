package cz.osu.student.R19584.Problem_0XX.Problem_00X;

public class Problem_009 {
    public static int main() {
        for(int a = 1; a < 1000; a++) {
            for(int b = a + 1; b < 1000; b++) {
                for(int c = b + 1; c < 1000; c++) {
                    if(a + b + c == 1000 && Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) return  a * b * c;
                }
            }
        }
        return -1;
    }
}
