package cz.osu.student.R19584.Problem_0XX.Problem_02X;

import java.util.ArrayList;
import java.util.Collections;

/*

A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4. If all of the permutations are listed numerically or alphabetically, we call it lexicographic order. The lexicographic permutations of 0, 1 and 2 are:

012   021   102   120   201   210

What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?

 */

public class Problem_024 {

    public static long main() {
        ArrayList<Integer> digits_1 = new ArrayList<>();
        Collections.addAll(digits_1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        int counter = 0;
        for(int index_1 = 0; index_1 < digits_1.size(); index_1++) {
            ArrayList<Integer> digits_2 = new ArrayList<>(digits_1);
            digits_2.remove(index_1);
            for(int index_2 = 0; index_2 < digits_2.size(); index_2++) {
                ArrayList<Integer> digits_3 = new ArrayList<>(digits_2);
                digits_3.remove(index_2);
                for(int index_3 = 0; index_3 < digits_3.size(); index_3++) {
                    ArrayList<Integer> digits_4 = new ArrayList<>(digits_3);
                    digits_4.remove(index_3);
                    for(int index_4 = 0; index_4 < digits_4.size(); index_4++) {
                        ArrayList<Integer> digits_5 = new ArrayList<>(digits_4);
                        digits_5.remove(index_4);
                        for (int index_5 = 0; index_5 < digits_5.size(); index_5++) {
                            ArrayList<Integer> digits_6 = new ArrayList<>(digits_5);
                            digits_6.remove(index_5);
                            for (int index_6 = 0; index_6 < digits_6.size(); index_6++) {
                                ArrayList<Integer> digits_7 = new ArrayList<>(digits_6);
                                digits_7.remove(index_6);
                                for (int index_7 = 0; index_7 < digits_7.size(); index_7++) {
                                    ArrayList<Integer> digits_8 = new ArrayList<>(digits_7);
                                    digits_8.remove(index_7);
                                    for (int index_8 = 0; index_8 < digits_8.size(); index_8++) {
                                        ArrayList<Integer> digits_9 = new ArrayList<>(digits_8);
                                        digits_9.remove(index_8);
                                        if(++counter == 1000000) return Long.parseLong("" + digits_1.get(index_1) + digits_2.get(index_2) + digits_3.get(index_3) + digits_4.get(index_4) + digits_5.get(index_5) + digits_6.get(index_6) + digits_7.get(index_7) + digits_8.get(index_8) + digits_9.get(0) + digits_9.get(0));
                                        if(++counter == 1000000) return Long.parseLong("" + digits_1.get(index_1) + digits_2.get(index_2) + digits_3.get(index_3) + digits_4.get(index_4) + digits_5.get(index_5) + digits_6.get(index_6) + digits_7.get(index_7) + digits_8.get(index_8) + digits_9.get(1) + digits_9.get(0));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }
}