package cz.osu.student.R19584.Problem_0XX.Problem_03X;

import java.util.HashSet;

public class Problem_038 {
    public static long main() {
        long biggest = 0;
        for(int number = 1; number < 10000; number++) {
            String product = "";
            HashSet<Character> seen = new HashSet<>();
            for (int i = 1; product.length() < 9; i++) {
                String mul = String.valueOf(number * i);
                product = product.concat(mul);
                if(product.contains("0")) break;
                for (char c : mul.toCharArray()) seen.add(c);
            }
            if (seen.size() == 9 && product.length() == 9 && Long.parseLong(product) > biggest) biggest = Long.parseLong(product);
        }
        return biggest;
    }
}
