package cz.osu.student.R19584.Problem_0XX.Problem_04X;

import SharedCodeBase.LongFunctions.*;

import java.util.HashSet;

public class Problem_045 {
    public static long main() {
        HashSet<Long> P = new HashSet<>();
        HashSet<Long> H = new HashSet<>();
        for(long add = 1; ; add++) {
            long check = TriangleNumber.get(285 + add);
            P.add(PentagonalNumber.get(165 + add));
            H.add(HexagonalNumber.get(143 + add));
            if (P.contains(check) && H.contains(check)) return check;
        }
    }
}
