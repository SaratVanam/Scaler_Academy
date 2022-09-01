// O(N) TC

public class Solution {
    public int solve(String A) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<A.length();i++){
            if(map.containsKey(A.charAt(i))){
                map.put(A.charAt(i),map.get(A.charAt(i))+1);
            }
            else{
                map.put(A.charAt(i),1);
            }
        }
        if(A.length()%2==0){
            for(int i=0;i<A.length();i++){
                int check=map.get(A.charAt(i));
                if(check%2!=0){
                    return 0;
                }
            }
        }
        else{
            int checkodd=0;
            char a='A';
            for(int i=0;i<A.length();i++){
                int check=map.get(A.charAt(i));
                if(check%2!=0){
                    if(checkodd==1 && a!=A.charAt(i)){
                        return 0;
                    }
                    if(checkodd==0){
                        checkodd=1;
                        a=A.charAt(i);
                    }
                }
            }
        }

        return 1;
    }
}
