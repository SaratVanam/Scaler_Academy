// O(Logmin(a,b)) TC

public class Solution {
    public int gcd(int A,int B){
        if(B==0){
            return A;
        }
        int ans=gcd(B,A%B);
        return ans;
    }
}
