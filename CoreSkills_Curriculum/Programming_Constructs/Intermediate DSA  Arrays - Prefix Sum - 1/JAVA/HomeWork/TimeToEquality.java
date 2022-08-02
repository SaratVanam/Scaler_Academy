//O(N) TC

public class Solution {
    public int solve(int[] A) {
        int max=Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        for(int i=0;i<A.length;i++){
            c+=max-A[i];
        }
        return c;
    }
}
