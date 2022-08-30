//O(N) TC

public class Solution {
    public int solve(String A) {
        int count=0;
        for(int i=0;i<A.length()-2;i++){
            if(A.charAt(i)=='b'){
                if(A.charAt(i+1)=='o'){
                    if (A.charAt(i+2)=='b'){
                        count++;
                    }
                }
            }

        }
        return count;
    }
}
