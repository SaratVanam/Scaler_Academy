// O(N^2) TC

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int kthsmallest(final int[] A, int B) {
        for(int i=0;i<A.length;i++){
            int min=A[i], ind=i;
            for(int j=i;j<A.length;j++){
                if(A[j]<min){
                    min=A[j];
                    ind=j;
                }
            }
            swap(i,ind,A);
        }
        
        return A[B-1];
    }
    public void swap(int i, int i1, int[] a) {
        int temp=a[i];
        a[i]=a[i1];
        a[i1]=temp;
    }
}
