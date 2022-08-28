//O(N) TC

public class Solution {
    public char[] to_upper(char[] A) {
        for(int i=0;i<A.length;i++){
            if(A[i]<=122 && A[i]>=97){
                A[i]=(char) (A[i]-32);
            }
        }
        return A;
    }
}
