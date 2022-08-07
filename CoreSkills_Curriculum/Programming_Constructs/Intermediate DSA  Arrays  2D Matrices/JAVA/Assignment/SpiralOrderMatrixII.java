// O(N^2) TC

public class Solution {
    public int[][] generateMatrix(int A) {
        int[][] ans = new int[A][A];
        int n = ans.length;
        int m = ans.length;
        int r=0;
        int c=0;
        int v=1;
        while(r<m && c<n){
            for(int j=c;j<m;j++){
                ans[r][j]=v++;
            }
            r++;
            for(int i=r;i<n;i++){
                ans[i][n-1]=v++;
            }
            n--;
            for(int j=n-1;j>=c;j--){
                ans[n][j]=v++;
            }
            m--;
            for(int i=m-1;i>=r;i--){
                ans[i][c]=v++;
            }
            c++;
        }
        return ans;
    }
}
