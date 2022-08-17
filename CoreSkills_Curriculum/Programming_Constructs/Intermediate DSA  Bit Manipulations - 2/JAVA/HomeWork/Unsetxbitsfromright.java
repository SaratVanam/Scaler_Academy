//O(B) TC

public class Solution {
    public long solve(long A, int B) {
        long ans=A;
        for(int i=0;i<B;i++){
            if((A&(1L<<i))!=0){
                ans-=(1L<<i);
            }
        }
        return ans;
    }
}
