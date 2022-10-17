// O(N) TC

public class Solution {
    public int[] solve(int[] A) {
        int n=(int) Math.sqrt(A.length);
        int[] ans = new int[n];
        int max=A[0];
        int j=0;
        for(int i=1;i<=A.length;i++){
            max=Math.max(max,A[i-1]);

            if(i%n==0){
                ans[j]=max;
                max=0;
                j++;
            }
        }
        return ans;
    }
}
