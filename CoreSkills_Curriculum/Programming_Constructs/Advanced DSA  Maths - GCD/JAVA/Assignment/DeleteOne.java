// O(N) TC

public class Solution {
    public int solve(int[] A){
        int[] pGcd =  new int[A.length];
        int[] sGcd = new int[A.length];
        pGcd[0]=A[0];
        for(int i=1;i<A.length;i++){
            pGcd[i]=gcd(pGcd[i-1],A[i]);
        }
        sGcd[A.length-1]=A[A.length-1];
        for(int i=A.length-2;i>=0;i--){
            sGcd[i]=gcd(sGcd[i+1],A[i]);
        }
        int ans=Integer.MIN_VALUE;
        int res=0;
        for(int i=0;i<A.length;i++){
            if(i==0){
                res=sGcd[i+1];
            }
            else if(i==A.length-1){
                res=pGcd[i-1];
            }
            else{
                res=gcd(pGcd[i-1],sGcd[i+1]);
            }
            ans=Math.max(ans,res);
        }
        return ans;

    }

    public int gcd(int A,int B){
        if(B==0){
            return A;
        }
        int ans=gcd(B,A%B);
        return ans;
    }
}
