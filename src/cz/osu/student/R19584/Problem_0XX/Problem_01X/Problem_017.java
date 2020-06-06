package cz.osu.student.R19584.Problem_0XX.Problem_01X;

public class Problem_017 {
    public static long main() {

        StringBuilder out = new StringBuilder();
        String[] words = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred", "thousand", "and"};
        for(int number = 1; number <= 1000; number++) {
            int i = number, hundreds = 0, ten = 0;
            if(i == 1000) {
                out.append(words[0]).append(words[28]);
                i -= 1000;
            }
            if(i > 99 && i < 1000) {
                while (i > 99 && i < 1000) {
                    hundreds++;
                    i -= 100;
                }
                out.append(words[hundreds - 1]).append(words[27]);
                if(i > 0) out.append(words[29]);
            }
            if(i > 19 && i < 100) {
                while (i > 19 && i < 100) {
                    ten++;
                    i -= 10;
                }
                out.append(words[ten + 18]);
                i -= 10;
            }
            if(i > 10 && i < 20) out.append(words[i - 1]);
            if(i == 10) out.append(words[9]);
            if(i > 0 && i < 10) out.append(words[i - 1]);
        }
        return out.length();
    }
}
