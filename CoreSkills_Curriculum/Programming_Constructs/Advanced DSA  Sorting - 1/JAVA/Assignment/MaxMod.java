// O(NlogN) TC

public class Solution {
    public int solve(int[] A) {
        Arrays.sort(A);
        if(A[0]==A[A.length-1]){
            return 0;
        }
        int i=A.length-2;
        while(A[i]==A[i+1]){
            i--;
        }
        return A[i];
    }
}
