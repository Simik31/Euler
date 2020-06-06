package cz.osu.student.R19584.Problem_0XX.Problem_02X;

public class Problem_026 {

    public static long main() {
        int result = 0, longest = 0;
        for (int i = 2; i < 1000; i++) {
            int[] arr = new int[i + 1];
            int index = 1, mod = 1;
            while(mod != 0 && arr[mod] == 0){
                arr[mod] = index++;
                mod = mod * 10 % i;
            }
            if (index - arr[mod] > longest) {
                longest = index - arr[mod];
                result = i;
            }
        }
        return result;
    }
}