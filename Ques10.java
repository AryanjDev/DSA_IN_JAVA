// Special Index Question and the Approch to solve 
public class Ques10 {
    // Non Optimized Approach
    static int specialindex(int []arr){
        int n = arr.length,count = 0;
        for(int i = 0; i < n; i++){
            long leven = 0, lodd = 0, reven = 0,rodd = 0;
            for(int j = 0; j < i; j++){
                if(j%2==0){
                    leven = leven+arr[j];
                }
                else{
                    lodd = lodd+arr[j];
                }
            }
            for(int j = i+1;i<n;j++){
                if(j%2==0){
                    reven+=arr[j];
                }
                else{
                    rodd+=arr[j];
                }

            }
            if(leven+rodd == lodd+reven){
                count++;
            }
        }
        return count;
    }
    // Optimized Approach
    static int speciaindexopt(int[] arr){
        int n = arr.length,count = 0;
        long[] pf = new long[n];
        long[] pf1 = new long[n];
        long sum = 0,sum1 = 0;
        for(int i = 0; i < n; i++){
            if(i%2 == 0){
                sum += arr[i];
                pf[i] = sum;
            }
            else{
                sum1 += arr[i];
                pf1[i] = sum1;
            }
        }
        for(int i = 0; i < n; i++){
            long leven = 0, lodd = 0, reven = 0, rodd = 0;
            if(i != 0){
                leven = pf[i-1];
                lodd = pf1[i-1];
            }
            reven = pf[n-1] - pf[i];
            rodd = pf1[n-1] - pf1[i];
            if(leven + rodd == lodd + reven){
                count++;
            }
        }
        return count;
    }
    
}
