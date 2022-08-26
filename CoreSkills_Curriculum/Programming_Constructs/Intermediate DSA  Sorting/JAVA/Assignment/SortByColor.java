//O(N) TC

public class Solution {
    public int[] sortColors(int[] A) {
        int[] ans= new int[A.length];
        int a=0,b=0,c=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==0){
                a++;
            }
            else if(A[i]==1){
                b++;
            }
            else
                c++;
        }
        int x=0;
        while(a>0){
            ans[x]=0;
            x++;
            a--;
        }
        while(b>0){
            ans[x]=1;
            x++;
            b--;
        }
        while(c>0){
            ans[x]=2;
            x++;
            c--;
        }
        return ans;
    }
}
