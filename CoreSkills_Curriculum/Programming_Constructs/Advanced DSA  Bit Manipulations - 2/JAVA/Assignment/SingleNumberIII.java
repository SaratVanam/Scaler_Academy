// O(N) TC

public class Solution {
    public int[] solve(int[] A) {
        int x= 0;
        for(int i=0;i<A.length;i++){
            x^=A[i];
        }
        int index=-1;
        for(int i=0;i<32;i++){
            if((x & (1<<i)) !=0){
                index=i;
                break;
            }
        }

        int set=0;
        int unset=0;
        for(int i=0;i<A.length;i++){
            if((A[i] & (1<<index))!=0){
                set^=A[i];
            }
            else{
                unset^=A[i];
            }
        }
        if(set>unset){
            return new int[]{unset,set};
        }
        return new int[]{set,unset};
    }
}
