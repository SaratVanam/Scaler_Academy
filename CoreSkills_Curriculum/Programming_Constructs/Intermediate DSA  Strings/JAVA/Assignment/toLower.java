//O(N) TC

public class Solution {
    public char[] to_lower(char[] A) {
        for(int i=0;i<A.length;i++){
            if(A[i]<=90 && A[i]>=65){
                A[i]=(char) (A[i]+32);
            }
        }
        return A;
    }
}
