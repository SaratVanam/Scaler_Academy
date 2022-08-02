//O(N) TC and O(N) SC

public class Solution {
    public int[] solve(int[] A) {
        int[] p=new int[A.length];
        p[0]=A[0];
        for(int i=1;i<A.length;i++){
            p[i]=p[i-1]*A[i];
        }
        int product=1;
        for(int i=A.length-1;i>=0;i--){
            if(i==A.length-1){
                p[i]=p[A.length-2];
                product=product*A[i];
            }
            else if(i==0){
                p[i]=product;
            }
            else{
                p[i]=p[i-1]*product;
                product=product*A[i];
            }
        }
        return p;
    }
}
