/* Given a number A. Return 1 if A is prime and return 0 if not. 

Note : 
The value of A can cross the range of Integer. */
package DSA;
import java.util.*;
public class Ques2 {
  static int Prime(long A){
    int count = 0;
    for(int i = 1; i*i <= A; i++){
      if(A % i == 0){
        if(i == A / i ){
          count++;
        }
        else{
          count = count + 2;
        }
      }
    }
    return count;
  }
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt(); 
      int fun = Prime(num);
      System.out.println(fun);
      if(fun == 2){
        System.out.print(1);
      }
      else{
        System.out.print(0);
      }

  }
}
