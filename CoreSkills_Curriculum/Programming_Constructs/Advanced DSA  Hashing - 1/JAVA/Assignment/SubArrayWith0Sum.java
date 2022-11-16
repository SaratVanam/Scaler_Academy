// O(N) TC

public class Solution {
    public int solve(int[] A) {
        long[] psum= new long[A.length];
        HashSet<Long> set = new HashSet<>();
        set.add((long)A[0]);
        psum[0]=A[0];
        for(int i=1;i<A.length;i++){
            psum[i]=A[i]+psum[i-1];
            set.add(psum[i]);
        }
        if(set.size()<A.length || set.contains((long)0)){
            return 1;
        }
        return 0;
    }
}
