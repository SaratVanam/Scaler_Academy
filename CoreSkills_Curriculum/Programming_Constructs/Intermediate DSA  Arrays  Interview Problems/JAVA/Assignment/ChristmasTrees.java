// O(N^2) TC

public class Solution {
    public int solve(int[] A, int[] B) {
        int ans=Integer.MAX_VALUE;

        for(int j=1;j<=A.length-2;j++){
            int minLeft=Integer.MAX_VALUE;
            int minRight=Integer.MAX_VALUE;
            for(int i=0;i<j;i++){
                if(A[i]<A[j]){
                    minLeft=Math.min(minLeft,B[i]);
                }
            }
            for(int k=j+1;k<A.length;k++){
                if(A[k]>A[j]){
                    minRight=Math.min(minRight,B[k]);
                }
            }
            int check=minLeft+minRight+B[j];
            if(minLeft==Integer.MAX_VALUE || minRight==Integer.MAX_VALUE){
                check=Integer.MAX_VALUE;
            }
            ans=Math.min(ans,check);
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}
