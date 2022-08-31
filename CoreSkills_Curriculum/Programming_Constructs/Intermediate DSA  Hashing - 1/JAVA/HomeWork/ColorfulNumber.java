//O(N) TC

public class Solution {
    public int colorful(int A) {
        HashSet<Integer> set = new HashSet<>();
        String s="";
        while(A>0){
            s=A%10+s;
            A=A/10;
        }

        for(int i=0;i<s.length();i++){
            int currentprod=1;
            for(int j=i;j<s.length();j++){
                if(set.contains((s.charAt(j)-'0')*currentprod)){
                    return 0;
                }
                else{
                    set.add((s.charAt(j)-'0')*currentprod);
                }
                currentprod=(s.charAt(j)-'0')*currentprod;
            }
        }
        return 1;
    }
}
