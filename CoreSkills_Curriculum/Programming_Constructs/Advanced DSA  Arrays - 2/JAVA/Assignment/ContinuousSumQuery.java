// O(N) TC

public class Solution {
    public int[] solve(int A, int[][] B) {
        int[] ans = new int[A];
        for(int i=0;i<B.length;i++){
            int s=B[i][0]-1;
            int e=B[i][1]-1;
            int val=B[i][2];
            ans[s]=ans[s]+val;
            if(e+1<A){
                ans[e+1]+=(val*-1);
            }
        }
        for(int i=1;i<ans.length;i++){
            ans[i]=ans[i]+ans[i-1];
        }
        return ans;
    }
}
