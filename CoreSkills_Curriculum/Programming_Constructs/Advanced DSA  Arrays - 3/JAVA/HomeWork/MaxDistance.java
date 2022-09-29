// O(NlogN) TC

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maximumGap(final int[] A) {
        int[][] B = new int[A.length][2];
        for(int i=0;i<A.length;i++){
            B[i][0]=A[i];
            B[i][1]=i;
        }

        Arrays.sort(B, (a,b) -> {
            return a[0]==b[0]? a[1]-b[1]:a[0]-b[0];
        });
        int ans=0;
        int minl=A.length;
        for(int i=0;i<A.length;i++){
            minl=Math.min(minl,B[i][1]);
            ans=Math.max(ans,B[i][1]-minl);
        }
        return ans;
    }
}
