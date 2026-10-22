/*  Ques 5 -You are given an array A of length N and Q queries given by the 2D array B of size Q×2.

Each query consists of two integers B[i][0] and B[i][1].

For every query, your task is to find the prefix sum of even index in the range from A[B[i][0]] to A[B[i][1]]. */
import java.util.*;
public class Ques5 {
    static long[] evencount(int [] A, int [][] B){
        int n = A.length; int m = B.length;
        long sum = 0;
        long [] prefix = new long[n];
        for(int i = 0; i <= n; i++){
            if(i%2==0){
                sum = sum +A[i];
                prefix[i] = sum;
            }
        }
        long [] ans = new long[m];
        for(int j = 0; j <= m ; j++){
            int L = B[j][0]; int R = B[j][1];
            if(j == 0){
                ans[j] = prefix[R];
                
            }else{
                ans[j] =prefix[R] - prefix[L-1];

            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    }
    
}
