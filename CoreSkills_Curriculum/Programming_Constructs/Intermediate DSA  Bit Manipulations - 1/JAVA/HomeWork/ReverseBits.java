// O(logN) TC

public class Solution {
	public long reverse(long A) {
        long ans=0;
        int shift=31;
        while(A>0){
            if((A&1)==1){
                ans+=(1L<<shift);
            }
            shift--;
            A=A>>1;
        }
        return ans;
	}
}
