// O(N) TC

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        int ans=A[0];
        for(int i=1;i<A.length;i++){
            ans=ans^A[i];
        }

        return ans;
    }
}
