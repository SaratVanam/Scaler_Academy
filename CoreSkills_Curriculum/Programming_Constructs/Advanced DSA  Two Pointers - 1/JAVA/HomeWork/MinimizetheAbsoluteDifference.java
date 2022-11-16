// O(N) TC

public class Solution {
    public int solve(int[] A, int[] B, int[] C) {
        int ans = Integer.MAX_VALUE;
        int i=A.length-1,j=B.length-1,k=C.length-1;
        while(i>=0 && j>=0 && k>=0)
        {
            int maxe = Math.max(A[i], Math.max(B[j],C[k]));
            int mine = Math.min(A[i], Math.min(B[j],C[k]));
            ans = Math.min(ans, maxe - mine);
            if(A[i]==maxe) i--;
            else if(B[j]==maxe) j--;
            else if(C[k]==maxe) k--;
        }
        return ans;
    }
}
