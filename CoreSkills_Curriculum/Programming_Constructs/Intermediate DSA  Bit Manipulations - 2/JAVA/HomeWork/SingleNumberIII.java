// O(N) TC

public class Solution {
    public int[] solve(int[] A) {
        int[] ans = new int[2];
        int xor=A[0];
        for(int i=1;i<A.length;i++){
            xor^=A[i];
        }
        int j=0;
        for(j=0;j<32;j++){
            if(((xor>>j)&1)==1){
                break;
            }
        }
        int set=0;
        int unset=0;

        for(int i=0;i<A.length;i++){
            if(((A[i]>>j)&1)==1){
                set^=A[i];
            }
            else{
                unset^=A[i];
            }
        }

        if(set<unset){
            ans[0]=set;
            ans[1]=unset;
        }
        else{
            ans[0]=unset;
            ans[1]=set;
        }
        return ans;
    }
}
