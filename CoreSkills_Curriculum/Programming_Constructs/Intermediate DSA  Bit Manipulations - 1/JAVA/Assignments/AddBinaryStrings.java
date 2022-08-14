//O(N) TC

public class Solution {
    public String addBinary(String A, String B) {
        String ans="";
        if(A.length()!=B.length()){
            if(A.length()>B.length()){
                int a =A.length()-B.length();
                for(int i=0;i<a;i++){
                    B='0'+B;
                }
            }
            else{
                int b=B.length()-A.length();
                for(int i=0;i<b;i++){
                    A='0'+A;
                }
            }
        }
        int c=0;
        int res=0;
        int p=1;
        for(int i=A.length()-1;i>=0;i--){
            int val=(A.charAt(i)+B.charAt(i))-96+c;
            res=(val%2);
            c=(val)/2;
            ans=res+ans;
        }
        if(c>0){
            ans='1'+ans;
        }
        return ans;
    }
}
