//O(N) TC

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int diffPossible(final int[] A, int B) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<A.length;i++){
            if(set.contains(B+A[i])){
                return 1;
            }
            if(!set.contains(A[i])){
                set.add(A[i]);
            }
        }
        return 0;
    }
}
