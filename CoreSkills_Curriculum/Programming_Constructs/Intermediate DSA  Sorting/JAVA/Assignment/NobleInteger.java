//O(NlogN) TC

public class Solution {
    public int solve(int[] A) {
        Arrays.sort(A);
        int count=0;
        if(A[A.length-1]==0){
            return 1;
        }
        for(int i=0;i<A.length-1;i++){
            if(A[i]!=A[i+1]){
                count=A.length-i-1;
                if(count==A[i]){
                    return 1;
                }
            }
        }
        return -1;
    }
}
