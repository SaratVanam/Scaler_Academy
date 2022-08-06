public class Solution {
    public void solve(int[][] A) {
        for(int i=0;i<A.length-1;i++){
            for(int j=i+1;j<A.length;j++){
                int temp= A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=temp;
            }
        }
        
        for(int i=0;i<A.length;i++){
            int a=0;
            int b=A.length-1;
            while(a<=b){
                int temp = A[i][a];
                A[i][a]=A[i][b];
                A[i][b]=temp;
                a++;
                b--;
            }
        }
    }
}
