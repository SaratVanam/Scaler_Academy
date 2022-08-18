// O(logN) TC

public class Solution {
    public int solve(int A) {
        if(A==0){
            return 0;
        }
        if((A&(A-1))==0){
            return 1;
        }
        int ans=0;
        while(A>0){
            if((A&1)==1){
                ans++;
            }
            A=A>>1;
        }
        return ans;
    }
}
