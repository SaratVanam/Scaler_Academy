//O(N) TC
public class Solution {
    public int solve(int[] A, int B) {
        int count=0;
        boolean flag=false;
        for(int i=0;i<A.length;i++){
            if(A[i]>B){
                A[i]=-1;
                count++;
            }
            if(A[i]==B){
                flag=true;
            }
        }
        if(flag){
            return count;
        }
        return -1;
    }
}
