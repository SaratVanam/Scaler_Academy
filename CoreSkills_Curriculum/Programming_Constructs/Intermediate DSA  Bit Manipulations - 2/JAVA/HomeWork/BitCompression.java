//O(N) TC

public class Solution {
    public int compressBits(int[] A) {
        int a=A[0];
        for(int i=1;i<A.length;i++){
            a=a^A[i];
        }
        return a;
    }
}
