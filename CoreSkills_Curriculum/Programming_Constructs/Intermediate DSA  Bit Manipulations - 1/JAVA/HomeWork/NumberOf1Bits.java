// O(logN) TC

public class Solution {
    public int numSetBits(int A) {
        int count=0;
        while(A>0){
            if(A%2!=0){
                count++;
            }
            A=A/2;
        }

        return count;
    }
}
