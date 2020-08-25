package cz.osu.student.R19584.Problem_0XX.Problem_04X;

import SharedCodeBase.TriangleNumber;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/*

DATA: https://projecteuler.net/project/resources/p042_words.txt

The nth term of the sequence of triangle numbers is given by, tn = 1/2n(n+1); so the first ten triangle numbers are:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

By converting each letter in a word to a number corresponding to its alphabetical position and adding these values we form a word value. For example, the word value for SKY is 19 + 11 + 25 = 55 = t10. If the word value is a triangle number then we shall call the word a triangle word.

Using words.txt (right click and 'Save Link/Target As...'), a 16K text file containing nearly two-thousand common English words, how many are triangle words?

 */

public class Problem_042 {
    public static long main() {
        ArrayList<Long> triangle_numbers = new ArrayList<>();
        for(int n = 1; n <= 26; n++) triangle_numbers.add(TriangleNumber.get(n));
        int counter = 0;
        Scanner reader = null;
        try {
            reader = new Scanner(new File("data/042.txt"));
        } catch (Exception ignored) {
            System.exit(-1);
        }
        for (String word : reader.nextLine().split(",")) {
            word = word.replace("\"", "");
            long word_sum = 0;
            for(int i = 0; i < word.length(); i++) word_sum += (word.charAt(i) - '@');
            if(triangle_numbers.contains(word_sum)) counter++;
        }
        return counter;
    }
}
