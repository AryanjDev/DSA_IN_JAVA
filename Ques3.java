/* You are given an integer A. You have to tell whether it is a perfect number or not.

Perfect number is a positive integer which is equal to the sum of its proper positive divisors.

A proper divisor of a natural number is the divisor that is strictly less than the number. */
package DSA;
import java.util.*;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int sum = 0;

        for (int i = 1; i * i <= A; i++) {
            if (A % i == 0) {
                int div1 = i;
                int div2 = A / i;

                // only add if it's a *proper* divisor (strictly less than A)
                if (div1 != A) {
                    sum += div1;
                }
                if (div2 != div1 && div2 != A) {
                    sum += div2;
                }
            }
        }

        System.out.print(sum);
        if (sum == A) {
            System.out.print(" 1");
        } else {
            System.out.print(" 0");
        }
    }
}
