// O(N) TC

public class Solution {
    public int solve(int[] A) {
        if(A.length==1){
            return A[0];
        }
        if(A.length==2){
            return gcd(A[0],A[1]);
        }
        int ans=gcd(A[0],A[1]);
        for(int i=2;i<A.length;i++){
            ans=gcd(ans,A[i]);
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
