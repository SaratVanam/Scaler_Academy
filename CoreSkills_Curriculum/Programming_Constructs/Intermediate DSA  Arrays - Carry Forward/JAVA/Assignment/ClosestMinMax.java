//O(N) TC

public class Solution {
    public int solve(int[] A) {
        if(A.length==1){
            return 1;
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
            if(A[i]<min){
                min=A[i];
            }
        }
        if(min==max){
            return 1;
        }
        int len=A.length;
        int a=-1;
        int b=-1;
        for(int i=0;i<A.length;i++){
            if(A[i]==min){
                a=i;
                if(b!=-1){
                    len=Math.min(len,a-b+1);
                }
            }
            else if(A[i]==max){
                b=i;
                if(a!=-1){
                    len=Math.min(len,b-a+1);
                }
            }
        }
        return len;
    }
}
