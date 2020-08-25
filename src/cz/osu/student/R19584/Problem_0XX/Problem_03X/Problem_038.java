package cz.osu.student.R19584.Problem_0XX.Problem_03X;

import java.util.HashSet;

/*

Take the number 192 and multiply it by each of 1, 2, and 3:

192 × 1 = 192
192 × 2 = 384
192 × 3 = 576
By concatenating each product we get the 1 to 9 pandigital, 192384576. We will call 192384576 the concatenated product of 192 and (1,2,3)

The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5, giving the pandigital, 918273645, which is the concatenated product of 9 and (1,2,3,4,5).

What is the largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated product of an integer with (1,2, ... , n) where n > 1?

 */

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
