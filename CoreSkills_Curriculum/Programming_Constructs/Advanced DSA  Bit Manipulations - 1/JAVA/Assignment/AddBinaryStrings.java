// O(N) TC

public class Solution {
    public String addBinary(String A, String B) {
        if(A.length()!=B.length()){
            if(A.length()>B.length()){
                int x=A.length()-B.length();
                while(x>0){
                    B='0'+B;
                    x--;
                }
            }
            else{
                int x=B.length()-A.length();
                while(x>0){
                    A='0'+A;
                    x--;
                }
            }
        }
        
        String ans="";
        int carry=0;
        for(int i=A.length()-1;i>=0;i--){
            int bitsum=A.charAt(i)-'0'+B.charAt(i)-'0'+carry;
            carry=bitsum/2;
            bitsum=bitsum%2;
            ans=bitsum+ans;
        }
        if(carry>0){
            ans=carry+ans;
        }
        return ans;
    }
}
