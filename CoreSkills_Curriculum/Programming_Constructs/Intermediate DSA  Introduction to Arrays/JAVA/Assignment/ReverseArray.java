//O(N) TC

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A) {
        int s=0;
        int e=A.length-1;
        while(s<=e){
            int temp = A[s];
            A[s]=A[e];
            A[e]=temp;
            s++;
            e--;
        }
        return A;
    }
}
