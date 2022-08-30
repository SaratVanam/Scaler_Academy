// O(N) TC

public class Solution {
    public int solve(String A) {
        long ans=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='a'||A.charAt(i)=='e'||A.charAt(i)=='i'||A.charAt(i)=='o'||A.charAt(i)=='u'|| A.charAt(i)=='A'||A.charAt(i)=='E'||A.charAt(i)=='I'||A.charAt(i)=='O'||A.charAt(i)=='U'){
                ans+=A.length()-i;
                ans=ans%10003;
            }
        }
        int a=(int) ans%10003;
        return a;
    }
}
