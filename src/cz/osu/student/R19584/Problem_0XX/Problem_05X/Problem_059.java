package cz.osu.student.R19584.Problem_0XX.Problem_05X;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem_059 {
    public static long main() {
        Scanner reader = null;
        try {
            reader = new Scanner(new File("data/059.txt"));
        } catch (Exception ignored) {
            System.exit(-1);
        }
        ArrayList<Integer> encrypted = new ArrayList<>();
        for (String code : reader.nextLine().split(",")) encrypted.add(Integer.parseInt(code));
        String sentence = "";
        long sum = 0;
        for(int k1 = 97; k1 < 123 && sentence.equals(""); k1++) {
            for(int k2 = 97; k2 < 123 && sentence.equals(""); k2++) {
                for(int k3 = 97; k3 < 123 && sentence.equals(""); k3++) {
                    StringBuilder text = new StringBuilder();
                    for (int s = 0; s < encrypted.size(); s++) {
                        if (s % 3 == 0) text.append((char)(encrypted.get(s) ^ k1));
                        else if (s % 3 == 1) text.append((char)(encrypted.get(s) ^ k2));
                        else text.append((char)(encrypted.get(s) ^ k3));
                    }
                    if(text.toString().contains(" the ")) sentence = text.toString();
                }
            }
        }
        for(char c : sentence.toCharArray()) sum += c;
        return sum;
    }
}
