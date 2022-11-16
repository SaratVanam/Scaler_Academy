// O(N) TC

public class Solution {
    public int[] solve(int[] A, int B) {
        long[] psum = new long[A.length];
        psum[0]=A[0];
        for(int i=1;i<A.length;i++){
            psum[i]=A[i]+psum[i-1];
        }
        int i=0,j=0;
        while(i<A.length && j<A.length){
            int sum=0;
            if(i==0){
                sum=(int)psum[j];
            }
            else{
                sum=(int)psum[j]-(int)psum[i-1];
            }
            if(sum==B){
                int len=j-i+1;
                int[] res = new int[len];
                int pos=0;
                for(int k=i;k<=j;k++){
                    res[pos++]=A[k];
                }
                return res;
            }
            else if( sum>B && i==j){
                i++;
                j++;
            }
            else if(sum<B){
                j++;
            }
            else{
                i++;
            }
        }
        return new int[]{-1};
    }
}
