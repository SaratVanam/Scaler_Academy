//O(N) TC

public class Solution {
    public int[] sortColors(int[] A) {
        int n = A.length;
        int l=0;
        int r = n-1;
        for(int i=0;i<n;){
            if(A[i]==0){
                int temp =A[i];
                A[i]=A[l];
                A[l]=temp;
                ++l;
                ++i;
            }
            else if(A[i]==2 && i<r){
                int temp = A[i];
                A[i]=A[r];
                A[r]=temp;
                --r;
            }
            else{
                ++i;
            }
        }
        return A;
    }
}
