// O(N sqrtN) TC

public class Solution {
    public int solve(int[] A) {
        long count=1;
        for(int i=0;i<A.length;i++){
            if(checkPrime(A[i])){
                count=(count<<1)%1000000007;
            }
        }
        return (int) count-1;
    }

    private boolean checkPrime(int A) {
        int c=0;
        if(A==1) return false;
        for(int i=2;i*i<=A;i++){
            if(A%i==0){
                c++;
            }
        }
        if(c==0){
            return true;
        }
        else{
            return false;
        }
    }
}
