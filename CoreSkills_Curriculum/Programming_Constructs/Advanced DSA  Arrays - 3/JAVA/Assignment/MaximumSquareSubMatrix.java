// O(N*M) TC

public class Solution {
    public int solve(int[][] A, int B) {
        int[][] psum= new int[A.length][A.length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                if(j==0){
                    psum[i][j]+=A[i][j];
                }
                else {
                    psum[i][j]+=A[i][j]+psum[i][j-1];
                }
            }
        }

        for(int j=0;j<A.length;j++){
            for(int i=0;i<A.length;i++){
                if(i>0){
                    psum[i][j]+=psum[i-1][j];
                }
            }
        }
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<=A.length-B;i++){
            for(int j=0;j<=A.length-B;j++){
                int sum=0;
                int TL[]={i,j};
                int BR[]={i+B-1,j+B-1};
                int a1=TL[0];
                int b1=TL[1];
                int a2=BR[0];
                int b2=BR[1];
                sum+=psum[a2][b2];
                if(a1>0){
                    sum=sum-psum[a1-1][b2];
                }
                if(b1>0){
                    sum=sum-psum[a2][b1-1];
                }
                if(a1>0 && b1>0){
                    sum=sum+psum[a1-1][b1-1];
                }
                maxSum=Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }
}
