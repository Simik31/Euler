package cz.osu.student.R19584.Problem_0XX.Problem_02X;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

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
