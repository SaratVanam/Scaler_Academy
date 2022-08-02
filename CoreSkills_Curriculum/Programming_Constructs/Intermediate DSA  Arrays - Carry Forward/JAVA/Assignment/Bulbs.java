// O(N) TC

public class Solution {
    public int bulbs(int[] A) {
        int flip=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==1 && flip%2!=0){
                flip++;
            }
            else if(A[i]==0 && flip%2==0){
                flip++;
            }
        }
        return flip;
    }
}
