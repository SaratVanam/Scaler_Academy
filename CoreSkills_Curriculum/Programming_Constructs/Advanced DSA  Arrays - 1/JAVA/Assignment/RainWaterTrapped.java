// O(N) TC

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {
        int lmax=0;
        int sum=0;
        int rmax=0;
        int l=0;
        int r=A.length-1;
        while(l<=r){
            if(A[l]<=A[r]){
                if(A[l]>=lmax){
                    lmax=A[l];
                }
                else{
                    sum+=(lmax-A[l]);
                }
                l++;
            }
            else{
                if(A[r]>=rmax){
                    rmax=A[r];
                }
                else{
                    sum+=(rmax-A[r]);
                }
                r--;
            }
        }
        return sum;
    }
}
