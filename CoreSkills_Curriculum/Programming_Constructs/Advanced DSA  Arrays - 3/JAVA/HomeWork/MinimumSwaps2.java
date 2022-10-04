// O(N) TC

public class Solution {
    public int solve(int[] A) {
        int i=0;
        int count=0;
        while(i<A.length){
            if(A[i]!=i){
                swap(i,A[i], A);
                count++;
            }else{
                i++;
            }
        }
        return count;
    }

    public void swap(int a, int b, int[] A){
        int temp=A[a];
        A[a]=A[b];
        A[b]=temp;
    }
}
