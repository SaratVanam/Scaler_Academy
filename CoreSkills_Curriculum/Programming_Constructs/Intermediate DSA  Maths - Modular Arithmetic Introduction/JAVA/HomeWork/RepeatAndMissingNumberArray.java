// O(N) TC

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int[] ans = new int[2];
        long n = A.length;
        long firstsum=0;
        long firstsquaresum=0;
        for(int i=0;i<A.length;i++){
            firstsquaresum+=(long)A[i]*A[i];
            firstsum+=A[i];
        }
        long linearsum=n*(n+1)/2;
        long squaresum=n*(n+1)*(2*n+1)/6;

        long y=(((firstsquaresum-squaresum)/(firstsum-linearsum))-(firstsum-linearsum))/2;
        long x=(firstsum-linearsum)+y;
        ans[0]=(int) x;
        ans[1]=(int) y;
        return ans;
    }
}
