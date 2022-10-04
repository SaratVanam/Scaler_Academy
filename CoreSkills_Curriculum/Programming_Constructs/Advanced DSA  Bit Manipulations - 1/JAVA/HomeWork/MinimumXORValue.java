// O(NlogN) TC

public class Solution {
    public int findMinXor(int[] A) {
        Arrays.sort(A);
        int x=A[0]^A[1];
        for(int i=2;i<A.length;i++){
            x=Math.min(x,A[i]^A[i-1]);
        }
        return x;
    }
}
