// O(N) TC

public class Solution {
    public int[] solve(int[] A) {
        int count=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i]>0){
                int l=1;
                for(int j=i+1;j<A.length;j++){
                    if(A[j]>0){
                        l++;
                        count=Math.max(count,l);
                    }
                    else{
                        break;
                    }
                }
            }
        }
        if(count==Integer.MIN_VALUE){
            count=1;
        }
        int[] ans= new int[count];
        boolean flag=false;
        for(int i=0;i<A.length;i++){
            if(flag){
                return ans;
            }
            int k=0;
            if(A[i]>0){
                ans[k]=A[i];
                if(ans.length==1){
                    return ans;
                }
                k++;
                for(int j=i+1;j<A.length;j++){
                    if(A[j]>0){
                        ans[k]=A[j];
                        k++;
                        if(k==ans.length){
                            flag=true;
                        }
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return ans;
    }
}
