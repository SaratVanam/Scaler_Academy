// O(1) TC

public class Solution {
    public int solve(int A, int B) {
        if(A>B){
            return A-B;
        }
        return B-A;
    }
}
