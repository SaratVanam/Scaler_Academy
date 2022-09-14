//O(N) TC

public class Solution {
    public int solve(int A) {
        if(A/10==0){
            if(A==1){
                return 1;
            }
            else {
                return 0;
            }
        }
        return solve(sum(A));
    }

    public int sum(int B){
        if(B==0){
            return 0;
        }
        return sum(B/10)+B%10;
    }
}
