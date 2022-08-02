// O(N) TC and O(N) SC

public class Solution {
    public int solve(int[] A) {
        int [] psum= new int[A.length];
        psum[0]=A[0];
        for(int i=1;i<A.length;i++){
            psum[i]=A[i]+psum[i-1];
        }
        for(int i=0;i<A.length;i++){
            if(i==0){
                if(psum[A.length-1]-psum[i]==0){
                    return i;
                }
            }
            else{
                if(psum[i-1]==psum[A.length-1]-psum[i]){
                    return i;
                }
            }
        }
        return -1;
    }
}
