//O(1) TC

public class Solution {
    public String solve(int[] A) {
        if(A.length%2!=0){
            return "NO";
        }
        if(A[0]%2==0 && A[A.length-1]%2==0){
            return "YES";
        }
        else
            return "NO";
    }
}
