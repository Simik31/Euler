package cz.osu.student.R19584.Problem_0XX.Problem_07X;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Problem_079 {
    public static long main() {
        ArrayList<String> tries = new ArrayList<>();
        HashMap<Integer, HashSet<Integer>[]> map = new HashMap<>();
        try {
            Scanner reader = new Scanner(new File("data/079.txt"));
            while(reader.hasNextLine()) tries.add(reader.nextLine());
        } catch (Exception ignored) {
            System.exit(-1);
        }
        int ret = 0;
        int[] solution = new int[8];
        for(int i = 0; i < 8; i++) solution[i] = -1;
        for(String tri : tries) {
            for (int i = 0; i < tri.length(); i++) {
                HashSet<Integer> before = new HashSet<>();
                HashSet<Integer> after = new HashSet<>();
                int key = Integer.parseInt(tri.substring(i, i + 1));
                if(map.containsKey(key)) {
                    before = map.get(key)[0];
                    after = map.get(key)[1];
                }
                if (i != 0) for (int j = 0; j < i; j++) before.add(Integer.parseInt(tri.substring(j, j + 1)));
                if (i != tri.length() - 1) for (int j = i + 1; j < tri.length(); j++) after.add(Integer.parseInt(tri.substring(j, j + 1)));
                if(!map.containsKey(key)) map.put(key, new HashSet[]{before, after});
            }
        }
        while (map.size() > 0) {
            map.forEach((num, lists) -> {
                if (lists[0].size() == 0) for (int n = 0; n < 10; n++)
                    if (solution[n] == -1) {
                        solution[n] = num;
                        break;
                    }
                if (lists[1].size() == 0) for (int n = 7; n >= 0; n--)
                    if (solution[n] == -1) {
                        solution[n] = num;
                        break;
                    }
            });
            for (int i = 0; i < 8; i++) {
                int n = solution[i];
                if (n != -1) {
                    map.forEach((num, lists) -> {for(HashSet<Integer> list : lists) list.remove(n);});
                    map.remove(n);
                }
            }
        }
        for(int i = 0; i < 8; i++) ret = ret * 10 + solution[i];
        return ret;
    }
}
