// O(1) TC

public class Solution {
    public int solve(int A) {
        if(A%400 == 0){
            return 1;
        }
        if(A%100 == 0){
            return 0;
        }
        if(A%4 == 0){
            return 1;
        }
        return 0;
    }
}
