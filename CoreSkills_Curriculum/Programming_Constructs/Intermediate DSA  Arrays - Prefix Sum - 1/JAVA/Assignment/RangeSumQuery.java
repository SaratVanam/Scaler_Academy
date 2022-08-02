//O(N+M) TC N for prefix sum and M for traversing L and R Queries, O(N) SC

public class Solution {
    public long[] rangeSum(int[] A, int[][] B) {
        long[] psum = new long[A.length];
        psum[0]=A[0];
        for(int i=1;i<A.length;i++){
            psum[i]=psum[i-1]+A[i];
        }
        long[] res = new long[B.length];
        int[] check = new int[2];
        for(int i=0;i<B.length;i++){
            check[0]=B[i][0];
            check[1]=B[i][1];
            res[i]=prefixsum(check,psum);
        }
        return res;
    }
    public long prefixsum(int[] check,long[] psum){
        long res=0;
        int a=check[0]-1;
        int b=check[1]-1;
        if(a==0){
            res=psum[b];
        }
        else{
            res=psum[b]-psum[a-1];
        }
        return res;
    }
}
