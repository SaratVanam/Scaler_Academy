// O(NLogN) TC

public class Solution {
    public int solve(int[] A) {
        Arrays.sort(A);
        int steps=0;
        for(int i=1;i<A.length;i++){
            if(A[i]<=A[i-1]){
                steps+=A[i-1]-A[i]+1;
                A[i]+=A[i-1]-A[i]+1;
            }
        }
        return steps;
    }
}
