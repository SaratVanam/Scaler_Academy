//O(N)

public class Solution {
    public int solve(int A) {
        if(A==0){
            return 1;
        }
        return solve(A-1)*A;
    }
}
