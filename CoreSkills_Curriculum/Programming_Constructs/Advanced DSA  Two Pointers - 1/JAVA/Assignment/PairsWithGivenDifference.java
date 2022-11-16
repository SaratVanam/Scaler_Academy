// O(NLogN) TC

public class Solution {
    public int solve(int[] A, int B) {
        Arrays.sort(A);
        int i=0;
        int j=1;
        int count=0;
        while(j<A.length){
            if(i==j){
                j++;
                continue;
            }
            if(A[j]-A[i]==B){
                count++;
                int x=A[i];
                while(i<A.length && A[i]==x){
                    i++;
                }
                x=A[j];
                while(j<A.length && A[j]==x){
                    j++;
                }
            }
            else if(A[j]-A[i]>B){
                i++;
            }
            else{
                j++;
            }
        }
        return count;
    }
}
