package cz.osu.student.R19584.Problem_0XX.Problem_06X;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem_067 {
    public static long main() {
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
        Scanner reader = null;
        try {
            reader = new Scanner(new File("data/067.txt"));
        } catch (Exception ignored) {
            System.exit(-1);
        }
        while(reader.hasNextLine()) {
            ArrayList<Integer> line = new ArrayList<>();
            for (String number : reader.nextLine().split(" ")) line.add(Integer.parseInt(number));
            triangle.add(line);
        }
        for (int row = triangle.size() - 2; row >= 0; row--)
            for (int column = 0; column <= row; column++)
                triangle.get(row).set(column, triangle.get(row).get(column) + Math.max(triangle.get(row + 1).get(column), triangle.get(row + 1).get(column + 1)));
        return triangle.get(0).get(0);
    }
}