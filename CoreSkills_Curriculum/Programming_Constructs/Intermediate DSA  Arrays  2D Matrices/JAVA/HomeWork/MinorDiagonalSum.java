public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {
        int sum=0;
        int i=0;
        int j=A.length-1;
        while(i<A.length && j>=0){
            sum+=A[i][j];
            i++;
            j--;
        }
        return sum;
    }
}
