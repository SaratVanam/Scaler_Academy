// O(N) TC

public class Solution {
    public int[] solve(int[] A, int B) {
        int s=0,e=0;
        int sum=0;
        while(e<A.length){
            sum+=A[e];
            if(sum == B){
                break;
            }
            else if(sum>B){
                while(sum>B){
                    sum-=A[s];
                    s++;
                }
                if(sum==B){
                    break;
                }
            }
            e++;
        }
        if(e==A.length){
            return new int[]{-1};
        }
        int[] ans = new int[e-s+1];
        int counter=0;
        for(int i=s;i<=e;i++){
            ans[counter]=A[i];
            counter++;
        }
        return ans;
    }
}

