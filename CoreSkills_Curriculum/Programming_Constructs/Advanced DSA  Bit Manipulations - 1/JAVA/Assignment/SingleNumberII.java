// O(N) TC

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        int ans=0;
        for(int i=0;i<32;i++){
            int set=0;
            int unset=0;
            for(int j=0;j<A.length;j++){
                if((A[j]&(1<<i))==0){
                    unset++;
                }
                else{
                    set++;
                }
            }

            if(set%3!=0){
                ans+=1<<i;
            }
        }
        return ans;
    }
}
