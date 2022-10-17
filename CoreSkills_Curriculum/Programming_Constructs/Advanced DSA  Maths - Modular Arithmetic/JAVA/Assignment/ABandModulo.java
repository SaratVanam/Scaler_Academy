// O(sqrt(A-B)) TC

public class Solution {
    public int solve(int A, int B) {
        int max=Integer.MIN_VALUE;
        if(A<B){
            int temp=A;
            A=B;
            B=temp;
        }

        for(int i=1;i*i<=(A-B);i++){
            if((A-B)%i==0){
                if(i==(A-B)/i){
                    max=Math.max(max,i);
                }
                else {
                    max=Math.max(max,i);
                    max=Math.max((A-B)/i,max);
                }
            }
        }
        return max;
    }
}
