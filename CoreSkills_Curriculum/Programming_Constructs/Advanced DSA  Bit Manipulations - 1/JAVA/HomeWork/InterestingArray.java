// O(N) TC

public class Solution {
    public String solve(int[] A) {
        if(A.length==1){
            if(A[0]==1){
                return "No";
            }
            return "Yes";
        }
        int oddCount=0;
        for(int i=0;i<A.length;i++){
            if((A[i]&1)==1){
                oddCount++;
            }
        }
        if((oddCount&1)==0){
            return "Yes";
        }
        
        return "No";
    }
}
