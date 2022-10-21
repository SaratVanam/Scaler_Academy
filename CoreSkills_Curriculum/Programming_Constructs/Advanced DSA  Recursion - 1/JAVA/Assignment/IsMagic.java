// O(LogN) TC

public class Solution {
    public int solve(int A) {

        int val=sum(A);
        if(val>=1 && val<=9){
            if(val==1){
                return 1;
            }
            return 0;
        }
        return solve(val);
    }

    public int sum(int A){
        if(A==0){
            return 0;
        }

        return A%10+sum(A/10);
    }
}
