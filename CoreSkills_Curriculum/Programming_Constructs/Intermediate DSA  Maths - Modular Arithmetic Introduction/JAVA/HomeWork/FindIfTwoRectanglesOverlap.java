// O(1) TC

public class Solution {
    public int solve(int A, int B, int C, int D, int E, int F, int G, int H) {
        if(A>=G || B>=H || E>=C || F>=D){
            return 0;
        }
        return 1;
    }
}
