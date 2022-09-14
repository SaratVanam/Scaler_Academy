//O(NlogN) TC

public class Solution {
    public int solve(int A, int B) {
        if(A==1){
            return 0;
        }
        int mid =(int) Math.pow(2,A-1)/2;
        if(B<=mid){
            return solve(A-1,B);
        }
        else{
            return solve(A-1,B-mid)==0 ? 1 : 0;
        }
    }
}
