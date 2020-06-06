package cz.osu.student.R19584.Problem_0XX.Problem_04X;

import SharedCodeBase.LongFunctions.PentagonalNumber;

import java.util.ArrayList;

public class Problem_044 {
    public static long main() {

        ArrayList<Long> pentagonalNumbers = new ArrayList<>();

        for(int n = 1000; n <= 3250; n++) pentagonalNumbers.add(PentagonalNumber.get(n));

        for(int j = 0; j < pentagonalNumbers.size() - 1; j++) {
            for (int k = j; k < pentagonalNumbers.size(); k++) {
                long a = pentagonalNumbers.get(j);
                long b = pentagonalNumbers.get(k);
                if (pentagonalNumbers.contains(a + b) && pentagonalNumbers.contains(b - a)) return Math.abs(b - a);
            }
        }
        return -1;
    }
}
