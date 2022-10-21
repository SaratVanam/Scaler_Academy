// O(2^N) TC

public class Solution {
    public int findAthFibonacci(int A) {
        if(A==1){
            return 1;
        }
        if(A==0){
            return 0;
        }
        return findAthFibonacci(A-1)+findAthFibonacci(A-2);
    }
}
