package cz.osu.student.R19584.Problem_0XX.Problem_02X;

public class Problem_023 {

    public static int main() {
        int sum = 0;
        boolean[] isAbundant = new boolean[28124];
        for (int i = 1; i < 28124; i++) isAbundant[i] = isAbundant(i);
        for (int i = 1; i < 28124; i++) if (!isSumOfTwoAbundants(i, isAbundant)) sum += i;
        return sum;
    }

    private static boolean isSumOfTwoAbundants(int number, boolean[] isAbundant) {
        for (int divisor = 0; divisor <= number; divisor++) if(isAbundant[divisor] && isAbundant[number - divisor]) return true;
        return false;
    }

    private static boolean isAbundant(int n) {
        int sum = 1;
        int end = (int)Math.sqrt(n);
        for (int i = 2; i <= end; i++) if (n % i == 0) sum += i + n / i;
        if (end * end == n) sum -= end;
        return sum > n;
    }
}