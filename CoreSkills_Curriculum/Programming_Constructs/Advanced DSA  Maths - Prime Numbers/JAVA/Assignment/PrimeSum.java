// O(NLogLogN) TC

public class Solution {
    public int[] primesum(int A) {
        boolean[] isPrime= new boolean[A+1];
        Arrays.fill(isPrime,true);
        isPrime[1]=false;
        for(int i=2;i*i<=A;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=A;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        int[] ans = new int[2];
        for(int i=0;i<=A;i++){
            int x;
            if(isPrime[i]){
                x=A-i;
                if(isPrime[x]){
                    ans[0]=i;
                    ans[1]=x;
                    break;
                }
            }
        }
        return ans;
    }
}
