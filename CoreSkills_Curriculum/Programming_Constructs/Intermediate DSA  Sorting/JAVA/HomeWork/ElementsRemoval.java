//O(NlogN) TC

public class Solution {
    public int solve(int[] A) {
        if(A.length==0){
            return 0;
        }
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
        }
        Arrays.sort(A);
        int ans=0;
        int diff=0;
        for(int i=A.length-1;i>=0;i--){
            ans+=(sum-diff);
            diff+=A[i];
        }
        return ans;
    }
}
