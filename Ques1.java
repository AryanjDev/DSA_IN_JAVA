/* Given an integer A, you need to find the count of it's factors.

Factor of a number is the number which divides it perfectly leaving no remainder.

Example : 1, 2, 3, 6 are factors of 6 */
package DSA;
import java.util.*;
public class Ques1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int count = 0;
        for(int i = 1; i*i <= A; i++){
            if(i*i == A){
                count = count + 1;
            } else {
                count = count + 2;
            }
        }
        System.out.println(count);
    }
    
}
