// O(N) TC

public class Solution {
    public String solve(int[] A) {
        int root=A[0];
        int l =Integer.MIN_VALUE;
        int r= Integer.MAX_VALUE;
        for(int i=1;i<A.length;i++){
            if(A[i]>root){
                l=root;
            }
            else{
                r=root;
            }
            if(A[i]<l || A[i]>r){
                return "NO";
            }
            root=A[i];
        }
        return "YES";
    }
}
