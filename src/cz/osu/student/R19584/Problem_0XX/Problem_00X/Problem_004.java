package cz.osu.student.R19584.Problem_0XX.Problem_00X;

/*

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.

 */

public class Problem_004 {
    public static int main() {
        int multiple, highest_palindrome = -1;
        boolean isPalindrome;
        for(int number_1 = 100; number_1 < 1000; number_1++) {
            for(int number_2 = 100; number_2 < 1000; number_2++) {
                isPalindrome = true;
                multiple = number_1 * number_2;
                String temp = String.valueOf(multiple);
                for(int i = 0; i < temp.length(); i++)
                    if (temp.charAt(i) != temp.charAt(temp.length() - i - 1)) {
                        isPalindrome = false;
                        break;
                    }
                if(isPalindrome && multiple > highest_palindrome) highest_palindrome = multiple;
            }
        }
        return highest_palindrome;
    }
}
