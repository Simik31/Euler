package cz.osu.student.R19584.Problem_0XX.Problem_02X;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/*

DATA: https://projecteuler.net/project/resources/p022_names.txt

Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

What is the total of all the name scores in the file?

 */

public class Problem_022 {
    public static long main() {
        ArrayList<String> names = new ArrayList<>();
        Scanner reader = null;
        try {
            reader = new Scanner(new File("data/022.txt"));
        } catch (Exception ignored) {
            System.exit(-1);
        }
        long value = 0;
        for (String name : reader.nextLine().split(",")) names.add(name.replace("\"", ""));
        names.sort(String::compareTo);
        for (int i = 0; i < names.size(); i++) value += getValue(names.get(i), i + 1);
        return value;
    }

    public static long getValue(String name, long position) {
        long value = 0;
        for(int i = 0; i < name.length(); i++) value += name.charAt(i) - '@';
        return value * position;
    }
}
