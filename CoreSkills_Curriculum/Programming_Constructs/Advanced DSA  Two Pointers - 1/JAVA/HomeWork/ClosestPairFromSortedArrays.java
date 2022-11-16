// O(max(A,B)) TC

public class Solution {
    public int[] solve(int[] A, int[] B, int C) {
        int i=0;
        int j=B.length-1;
        int minDiff=Integer.MAX_VALUE;
        int first=A.length;
        int second=B.length;
        int[] ans = new int[2];
        while(i<A.length && j>=0){
            int diff=Math.abs(A[i]+B[j]-C);
            if(diff<=minDiff){
                if(i<first || diff<minDiff){
                    first=i;
                }
                if(j<second && first==i || diff<minDiff){
                    second=j;
                }
                minDiff=diff;
            }
            if(A[i]+B[j]<C){
                i++;
            }
            else if(A[i]+B[j]>C){
                j--;
            }
            else{
                i++;
                j--;
            }
        }
        ans[0]=A[first];
        ans[1]=B[second];
        return ans;
    }
}
