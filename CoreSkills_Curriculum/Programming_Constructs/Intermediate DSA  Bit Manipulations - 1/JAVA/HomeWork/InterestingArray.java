// O(N) TC

public class Solution {
    public String solve(int[] A) {
        if(A.length==1){
            if(A[0]==1){
                return "No";
            }
            return "Yes";
        }
        int ans=A[0];
        for(int i=1;i<A.length;i++){
            ans=ans^A[i];
        }
        if(ans%2==0){
            return "Yes";
        }
        
        return "No";
    }
}
