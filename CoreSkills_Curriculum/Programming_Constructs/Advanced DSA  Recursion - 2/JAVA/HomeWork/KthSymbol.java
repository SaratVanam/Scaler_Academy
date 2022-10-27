// O(N) TC

public class Solution {
    public int solve(int n, int k) {
        if(n==1 )
            return 0;
        int mid=(int)Math.pow(2,n-1)/2;
        if(k<=mid)
        {
            return solve(n-1,k);  // 1st  half
        }
        else
        {
            return  1-solve(n-1,k-mid);   //2nd half
        }
    }
}
