/* Ques 7- Given an array A of N integers. Construct prefix sum of the array in the given array itself. */
import java.util.*;
// Using other variable to store prefix sum
public class Ques7 { 
    static long[] prefixsum(int [] A){
    int n = A.length;
    long[] ans = new long[n];
    int sum = 0 ; 
    for(int i = 0; i < n;i++){
        sum = sum+A[i];
        ans[i] = sum;
    }
    return ans;
}
// Using same array to store prefix sum
   static int[] prefixofsum(int[] A) {
        int n = A.length;

        for (int i = 1; i < n; i++) {
            A[i] = A[i] + A[i - 1];
        }

        return A;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    }
    
}
