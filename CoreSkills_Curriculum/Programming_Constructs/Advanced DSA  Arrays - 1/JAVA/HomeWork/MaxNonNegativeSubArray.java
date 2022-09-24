// TC O(N)

public class Solution {
    public int[] maxset(int[] A) {
        int index=-1;
        long sum=0;
        long maxSum=0;
        int l=0;
        int a=-1;
        int b=-1;
        int i;
        for(i=0;i<A.length;i++){
            if(A[i]>=0){
                if(index==-1){
                    index=i;
                }
                sum+=A[i];
            }
            else{
                if(sum>maxSum){
                    l=i-index;
                    maxSum=sum;
                    a=index;
                    b=i-1;
                }
                else if(sum==maxSum && index>=0){
                    if(i-index>l){
                        l=i-index;
                        a=index;
                        b=i-1;
                    }
                }
                sum=0;
            }
        }
        if(a==-1 && b==-1){
            return new int[0];
        }
        int[] ans = new int[b-a+1];
        int x=0;
        for(int c=a;c<=b;c++){
            ans[x]=A[c];
            x++;
        }
        return ans;
    }
}