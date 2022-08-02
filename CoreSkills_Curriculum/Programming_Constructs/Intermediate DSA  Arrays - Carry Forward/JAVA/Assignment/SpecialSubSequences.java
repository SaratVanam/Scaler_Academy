//O(N) TC

public class Solution {
    public int solve(String A) {
        int countG=0;
        int ans=0;
        for(int i=A.length()-1;i>=0;i--){
            if(A.charAt(i)=='G'){
                countG++;
            }
            else if(A.charAt(i)=='A'){
                ans+=countG;
                ans=ans%(1000000007);
            }
        }
        return ans;
    }
}
