// O(LogN) TC

public class Solution {
    public int solve(int A) {
        int count=1;
        int ans=0;
        while(A>0){
            if((A&1)==1){
                ans+=Math.pow(5,count);
            }
            A=A>>1;
            count++;
        }
        return ans;
    }
}
