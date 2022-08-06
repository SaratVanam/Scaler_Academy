public class Solution {
    public int[][] diagonal(int[][] A) {
        int[][] ans = new int[2*A.length-1][A.length];
        int x=0,y=0;
        for(int j=0;j<A.length;j++){
            int a=0,b=j;
            x=j;
            y=a;
            while(a<A.length && b>=0){
                ans[x][y]=A[a][b];
                a++;
                b--;
                y++;
            }
        }

        for(int i= 1;i<A.length;i++){
            int a =i,b=A.length-1;
            x++;
            y=0;
            while(a<A.length && b>=0){
                ans[x][y]=A[a][b];
                a++;
                b--;
                y++;
            }
        }
        return ans;
    }
}
