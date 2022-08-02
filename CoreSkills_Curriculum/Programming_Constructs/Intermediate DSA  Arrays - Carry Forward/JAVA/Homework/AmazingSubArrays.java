// O(N) TC

public class Solution {
    public int solve(String A) {
        int count=0;
        int n=A.length()-1;
        for(int i=n;i>=0;i--){
            if(A.charAt(i)=='A'||A.charAt(i)=='E'||A.charAt(i)=='I'||A.charAt(i)=='O'||A.charAt(i)=='U'||A.charAt(i)=='a'||A.charAt(i)=='e'||A.charAt(i)=='i'||A.charAt(i)=='o'||A.charAt(i)=='u'){
                if(i==n){
                    count++;
                }
                else{
                    count+=(n-i)+1;
                    count=count%10003;
                }
            }
        }
        return count;
    }
}
