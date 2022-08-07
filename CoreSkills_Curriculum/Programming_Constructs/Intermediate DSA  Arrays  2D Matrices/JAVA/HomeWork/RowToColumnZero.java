//O(N*M) TC and O(N+M) SC

public class Solution {
    public int[][] solve(int[][] A) {
        boolean[] row = new boolean[A.length];
        boolean[] col = new boolean[A[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(A[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }

        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(row[i]==true || col[j]==true){
                    A[i][j]=0;
                }
            }
        }
        return A;
    }
}
