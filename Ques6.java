 /* Ques6- You are given an array A of integers of size N.

Your task is to find the equilibrium index of the given array

The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.

Note:

Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index. */ 
public class Ques6 {
    // Non optimized approach
    static int equilibrium(int[]arr){
    int n = arr.length;
    for(int i = 0; i < n; i++){
      long lsum = 0, rsum = 0;
      for(int j = 0; j < i; j++){
        lsum = lsum + arr[j];
      }
      for(int j = i+1; j < n; j++){
        rsum = rsum + arr[j];
      }
      if(lsum == rsum){
        return i;
      }
    }
    return -1;
  }
  // Optimized approach 
    static int equilibriumindex(int [] arr){
        int n = arr.length;
        long sum = 0;
        long [] pf = new long[n];
        for(int i = 0 ; i < n; i++ ){
            sum = sum + arr[i];
            pf[i] = sum;
        }
        for(int i = 0; i < n; i++){
            long lsum = 0, rsum = 0;
            if(i != 0){
                lsum = pf[i-1];
            }
            rsum = pf[n-1] - pf[i];
            if(lsum == rsum){
                return i;

            }
        }
        return -1;
    }
    
}
