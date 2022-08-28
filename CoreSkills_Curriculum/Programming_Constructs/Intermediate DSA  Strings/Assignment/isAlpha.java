//O(N) TC

public class Solution {
    public int solve(char[] A) {
        int x=0;
        for(int i=0;i<A.length;i++){
            if(A[i]<=122 && A[i]>=97 || A[i]<=90 && A[i]>=65 ){
                x=1;
            }
            else{
                return 0;
            }
        }
        return 1;
    }
}
