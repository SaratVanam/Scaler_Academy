//O(N) TC

public class Solution {
    public long solve(int A, int[] B) {
        long ans=0;
        long last=-1;
        for(int i=0;i<A;i++){
            if(B[i]==1){
                last=i;
            }
            ans+=last+1;
        }
        return ans;
    }
}
