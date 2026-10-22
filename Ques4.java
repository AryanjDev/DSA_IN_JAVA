/* Ques 4 - You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query. */
import java.util.*;
public class Ques4 {
    // Brute force approach
   static long [] suminrange(int [] A, int [][] B){
        int m = B.length;
        long [] ans = new long[m];
        for(int i = 0 ; i < m ; i++){
            int L = B[i][0];int R = B[i][1];
            long sum =0 ;
            for(int j = L; j <= R; j++){
                sum = sum + A[j];
            }
            ans [i] = sum;

        }
        return ans;
    }
    // Prefix Sum Approach
    static long prefixsum(int[] A , int [] [] B){
        int n = A.length; int m = B.length;
        long sum = 0;
        long [] prefix = new long[n];
        for(int i = 0; i <n ; i ++){
            sum = sum + A[i];
            prefix[i] = sum;
        }
        long [] ans = new long[m];
        for(int j = 0; j < m; j++){
            int L = B[j][0]; int R = B[j][1];
            if(L==0){
                ans[j] = prefix[R];
            } else {
                ans[j] = prefix[R] - prefix[L-1];
            }
        }
        return ans;
    }
    public static void main(String[] args){

    }
    
}
