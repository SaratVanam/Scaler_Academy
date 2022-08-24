//O(1) TC

public class Solution {
    public int solve(int A, int B, int C) {
        int min=Math.min(A,Math.min(B,C));
        int max=Math.max(A,Math.max(B,C));
        int mid=(A+B+C)-(min+max);
        int ans=min*10000+mid*100+max;
        return ans;
    }
}
