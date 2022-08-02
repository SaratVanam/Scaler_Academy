//O(N) TC

public class Solution {
    public int solve(int[] A, int B) {
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                if(i!=j && A[i]+A[j]==B){
                    return 1;
                }
            }
        }
        return 0;
    }
}
