// O(NLog(LogN)) TC

public class Solution {
    public int solve(int[] A) {
        int max=A[0];
        for(int i=0;i<A.length;i++){
            max=Math.max(max,A[i]);
        }
        boolean[] isPrime = new boolean[max+1];
        Arrays.fill(isPrime,true);
        isPrime[1]=false;
        int[] ans = new int[max+1];
        for(int i=2;i*i<=max;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=max;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        for(int i=0;i<A.length;i++){
            int x=A[i];
            for(int j=2;j*j<=x;j++){
                if(isPrime[j]){
                    while(x%j==0){
                        ans[j]++;
                        x=x/j;
                    }
                }
            }
            if(isPrime[x]){
                ans[x]++;
            }
        }
        int c=0;
        for(int i=2;i<=max;i++){
            if(ans[i]>0){
                c++;
            }
        }
        return c;
    }
}
