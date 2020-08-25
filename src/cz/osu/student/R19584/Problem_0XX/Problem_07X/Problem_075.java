package cz.osu.student.R19584.Problem_0XX.Problem_07X;

/*

It turns out that 12 cm is the smallest length of wire that can be bent to form an integer sided right angle triangle in exactly one way, but there are many more examples.

12 cm: (3,4,5)
24 cm: (6,8,10)
30 cm: (5,12,13)
36 cm: (9,12,15)
40 cm: (8,15,17)
48 cm: (12,16,20)

In contrast, some lengths of wire, like 20 cm, cannot be bent to form an integer sided right angle triangle, and other lengths allow more than one solution to be found; for example, using 120 cm it is possible to form exactly three different integer sided right angle triangles.

120 cm: (30,40,50), (20,48,52), (24,45,51)

Given that L is the length of the wire, for how many values of L ≤ 1,500,000 can exactly one integer sided right angle triangle be formed?

 */

import SharedCodeBase.PythagoreanTheorem;

import java.util.HashSet;

public class Problem_075 {
    public static long main() {
        HashSet<Integer> seen = new HashSet<>();
        for(int number = 12; number <= 1500000; number += 2) {
            boolean fail = false;
            for (int a = 3; a <= (number - 3) / 3 && !fail; a++) {
                for (int b = a + 1; b <= (number - 1 - a) / 2 && !fail; b++) {
                    for (int c = b + 1; c <= number - a - b && !fail; c++) {
                        if (a + b + c == number && PythagoreanTheorem.isValid(a, b, c)) {
                            if(!seen.contains(number)) seen.add(number);
                            else {
                                seen.remove(number);
                                fail = true;
                            }
                        }
                    }
                }
            }
            if(seen.contains(number)) System.out.println(number + " OK");
        }
        return seen.size();
    }
}
