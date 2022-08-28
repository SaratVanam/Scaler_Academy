//O(N) TC

public class Solution {
    public String solve(String A) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)<123 && A.charAt(i)>96){
                if(A.charAt(i)=='a'||A.charAt(i)=='e'||A.charAt(i)=='i'||A.charAt(i)=='o'||A.charAt(i)=='u'){
                    sb.append('#');
                }else{
                    sb.append(A.charAt(i));
                }
            }
        }
        sb.append(sb);
        return sb.toString();
    }
}
