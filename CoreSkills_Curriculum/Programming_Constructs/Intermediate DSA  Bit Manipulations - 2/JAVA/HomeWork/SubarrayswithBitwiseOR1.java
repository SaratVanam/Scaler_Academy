// O(N) TC

public class Solution {
    public long solve(int A, int[] B) {
        long zeroCount=0L;
        long ans =(1L*A*(A+1))/2L;
        for(int i=0;i<A;i++){
            if(B[i]==0){
                zeroCount++;
            }
            else{
                ans-=((1L*zeroCount)*(zeroCount+1))/2L;
                zeroCount=0;
            }
        }
        if(zeroCount>0){
            ans-=(1L*(zeroCount)*(zeroCount+1))/2L;
        }
        return ans;
    }
}
