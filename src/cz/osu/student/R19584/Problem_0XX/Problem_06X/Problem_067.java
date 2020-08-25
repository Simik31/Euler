package cz.osu.student.R19584.Problem_0XX.Problem_06X;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/*

DATA: https://projecteuler.net/project/resources/p067_triangle.txt

By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.

   3
  7 4
 2 4 6
8 5 9 3

That is, 3 + 7 + 4 + 9 = 23.

Find the maximum total from top to bottom in triangle.txt (right click and 'Save Link/Target As...'), a 15K text file containing a triangle with one-hundred rows.

NOTE: This is a much more difficult version of Problem 18. It is not possible to try every route to solve this problem, as there are 299 altogether! If you could check one trillion (10^12) routes every second it would take over twenty billion years to check them all. There is an efficient algorithm to solve it. ;o)

 */

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