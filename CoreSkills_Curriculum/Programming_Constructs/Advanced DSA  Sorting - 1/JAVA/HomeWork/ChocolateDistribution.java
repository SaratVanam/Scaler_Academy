// O(NLogN) TC

public class Solution {
    public int solve(int[] A, int B) {
        if(B==0 || A.length==0){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        Arrays.sort(A);
        for(int i=0;i<=A.length-B;i++){
            if(A[i+B-1]-A[i]<ans){
                ans=A[i+B-1]-A[i];
            }
        }
        return ans;
    }
}
