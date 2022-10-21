// O(N) TC

public class Solution {
    public int solve(int A) {
        if(A<2){
            return 1;
        }
        if(A==2){
            return 2;
        }

        int x=4;
        return x+solve(A-1)+1;
    }
}
