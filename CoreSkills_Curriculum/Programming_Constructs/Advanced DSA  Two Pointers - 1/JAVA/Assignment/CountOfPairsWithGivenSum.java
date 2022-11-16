// O(N) TC

public class Solution {
    public int solve(int[] A, int B) {
        int i=0;
        int j=A.length-1;
        int count=0;
        while(i<j){
            if(A[i]+A[j]==B){
                count++;
                i++;
                j--;

            }
            else if(A[i]+A[j]<B){
                i++;
            }
            else{
                j--;
            }
        }
        return count;
    }
}
