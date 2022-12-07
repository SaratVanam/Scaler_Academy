// O(N) TC

public class Solution {
    public String solve(String A) {
        Queue<Character> q = new LinkedList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<A.length();i++){
            char c= A.charAt(i);
            q.add(c);
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                map.put(c,map.get(c)+1);
            }
            while(!q.isEmpty() && map.get(q.peek())>1){
                q.remove();
            }
            if(!q.isEmpty()){
                sb.append(q.peek());
            }
            else{
                sb.append('#');
            }
        }
        return sb.toString();
    }
}
