// O(N) TC

public class Solution {
    public int cntBits(int[] A) {
        long sum=0;
        int k=0;
        long count=0;
        for(int j=0;j<=31;j++){
            count=0;
            for(int i=0;i<A.length;i++)
            {
                if((A[i]&(1<<j))==0)
                    count=(count+1)%1000000007;
            }
            sum=(sum+count*1l*(A.length-count)*2)%1000000007;
        }
        return (int)sum;
    }
}
