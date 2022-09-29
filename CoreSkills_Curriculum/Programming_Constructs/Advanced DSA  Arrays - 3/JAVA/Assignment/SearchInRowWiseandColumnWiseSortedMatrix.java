// O(N+M) TC

public class Solution {
    public int solve(int[][] A, int B) {
        int n=A.length;
        int m=A[0].length;
        int i=0;
        int j=m-1;
        int minans=Integer.MAX_VALUE;
        int flag=0;
        while(i<A.length && j>=0){
            if(A[i][j]==B){
                flag=1;
                int ans=(i+1) * 1009 + (j+1);
                if(ans<minans){
                    minans=ans;
                }
                j--;
            }
            else if(B<A[i][j]){
                j--;
            }
            else if(flag==0){
                i++;
            }
            else{
                j--;
            }
        }
        if(minans!=Integer.MAX_VALUE){
            return minans;
        }
        return -1;
    }
}
