// O(N) TC

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int majorityElement(final int[] A) {
        int majorE=A[0];
        int count=1;
        int freq=0;
        for(int i=1;i<A.length;i++){
            if(count==0){
                majorE=A[i];
                count=1;
            }
            else if(majorE!=A[i]){
                count--;
            }
            else{
                count++;
            }
        }

        for(int i=0;i<A.length;i++){
            if(majorE==A[i]){
                freq++;
            }
        }
        if(freq>A.length/2){
            return majorE;
        }
        return -1;
    }
}
