//O(N) TC
public class Solution {
    public int solve(int[] A) {
        int mino=Integer.MAX_VALUE;
        int maxe=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                if(A[i]>maxe){
                    maxe=A[i];
                }
            }
            else{
                if(A[i]<mino){
                    mino=A[i];
                }
            }
        }
        return maxe-mino;
    }
}
