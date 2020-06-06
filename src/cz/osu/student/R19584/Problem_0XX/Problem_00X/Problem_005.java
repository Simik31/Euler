package cz.osu.student.R19584.Problem_0XX.Problem_00X;

public class Problem_005 {
    public static long main() {
        for(long number = 20; ; number += 20)
            if(number % 7 == 0 && number % 8 == 0 && number % 9 == 0 &&  number % 11 == 0 && number % 13 == 0 &&
               number % 15 == 0 && number % 16 == 0 && number % 17 == 0 && number % 18 == 0 && number % 19 == 0 &&
               number % 20 == 0) return number;
    }
}