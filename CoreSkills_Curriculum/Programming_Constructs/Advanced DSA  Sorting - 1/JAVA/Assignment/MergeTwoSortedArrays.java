// O(A+B)TC O(A+B) SC

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A, final int[] B) {
        int p1=0,p2=0,p3=0;
        int[] C = new int[A.length+B.length];
        while(p1<A.length && p2<B.length){
            if(A[p1]<B[p2]){
                C[p3]=A[p1];
                p3++;
                p1++;
            }
            else{
                C[p3]=B[p2];
                p3++;
                p2++;
            }
        }

        while(p1<A.length){
            C[p3]=A[p1];
            p3++;
            p1++;
        }
        while(p2<B.length){
            C[p3]=B[p2];
            p3++;
            p2++;
        }
        return C;
    }
}
