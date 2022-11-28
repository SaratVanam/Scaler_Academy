// O(NLogN) TC

public class Solution {
    public int[][] solve(int[][] A, int B) {
        int[][] res = new int[B][2];
        Arrays.sort(A,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                int squrA = a[0]*a[0]+a[1]*a[1];
                int squrB = b[0]*b[0]+b[1]*b[1];
                return squrA-squrB;
            }
        });
        for(int i = 0;i<B;i++){
            res[i] = new int[]{A[i][0],A[i][1]};
        }
        return res;
    }
    
}
