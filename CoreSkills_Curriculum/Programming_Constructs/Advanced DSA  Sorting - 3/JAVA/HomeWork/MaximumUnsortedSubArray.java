// O(N) TC

public class Solution {
    public int[] subUnsort(int[] A) {
        int[] ans = new int[2];
        int s=0;
        int e=A.length-1;
        int max, min;
        for(int i=0;i<A.length-1;i++){
            if(A[i]>A[i+1]){
                s=i;
                break;
            }
        }
        
        for(int i=A.length-1;i>0;i--){
            if(A[i]<A[i-1]){
                e=i;
                break;
            }
        }
        if(s==0 && e==A.length-1){
            return new int[]{-1};
        }
        max=A[s];
        min=A[s];
        for(int i=s+1;i<=e;i++){
            if(A[i]>max){
                max=A[i];
            }
            if(A[i]<min){
                min=A[i];
            }
        }
        for(int i=0;i<s;i++){
            if(A[i]>min){
                s=i;
                break;
            }
        }
        for(int i=A.length-1;i>=e+1;i--){
            if(A[i]<max){
                e=i;
                break;
            }
        }
        ans[0]=s;
        ans[1]=e;
        return ans;
    }
}
