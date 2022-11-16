// O(N) TC

public class Solution {
    public int maxArea(int[] A) {
        int i=0;
        int j=A.length-1;
        int ans=0;
        while(i<j){
            if(A[i]<A[j]){
                int l=j-i;
                int b=Math.min(A[i],A[j]);
                ans=Math.max(ans,l*b);
                i++;
            }
            else{
                int l=j-i;
                int b=Math.min(A[i],A[j]);
                ans=Math.max(ans,l*b);
                j--;
            }
        }
        return ans;
    }
}
