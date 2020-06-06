package cz.osu.student.R19584.Problem_0XX.Problem_04X;

import SharedCodeBase.LongFunctions.TriangleNumber;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

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
