// O(N+B) TC and O(N) SC, Sc can be reduced to O(1) using sliding window approach

public class Solution {
    public int solve(int[] A, int B) {
        int[] psum = new int[A.length];
        int max=Integer.MIN_VALUE;
        psum[0]=A[0];
        for(int i=1;i<A.length;i++){
            psum[i]=psum[i-1]+A[i];
        }
        if(B==A.length){
            return psum[A.length-1];
        }
        for(int i=0;i<=B;i++){
            if(i==0){
                max=psum[B-1];
            }else if(i==B){
                max=Math.max(max,psum[A.length-1]-psum[A.length-1-i]);
            }
            else{
                max=Math.max(max,psum[B-i-1]+psum[A.length-1]-psum[A.length-1-i]);
            }
        }
        return max;
    }
}
