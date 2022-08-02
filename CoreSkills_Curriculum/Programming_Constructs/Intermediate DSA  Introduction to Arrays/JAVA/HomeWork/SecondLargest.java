//O(N) TC
public class Solution {
    public int solve(int[] A) {
        if(A.length<=1){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int p=-1;
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
                p=i;
            }
        }
        A[p]=-1;
        max=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        return max;
    }
}