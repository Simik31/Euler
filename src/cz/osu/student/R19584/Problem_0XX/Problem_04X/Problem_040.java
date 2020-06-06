package cz.osu.student.R19584.Problem_0XX.Problem_04X;

public class Problem_040 {
    public static long main() {
        StringBuilder number = new StringBuilder();
        for(int i = 1; number.length() < 1000000; i++) number.append(i);
        int mul = Integer.parseInt(number.substring(0, 1)) * Integer.parseInt(number.substring(9, 10));
        mul *= Integer.parseInt(number.substring(99, 100)) * Integer.parseInt(number.substring(999, 1000));
        mul *= Integer.parseInt(number.substring(9999, 10000)) * Integer.parseInt(number.substring(99999, 100000));
        mul *= Integer.parseInt((number.substring(999999, 1000000)));
        return mul;
    }
}
