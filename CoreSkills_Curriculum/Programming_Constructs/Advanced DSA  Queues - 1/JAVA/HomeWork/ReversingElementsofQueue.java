// O(N) TC

public class Solution {
    public int[] solve(int[] A, int B) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<A.length;i++){
            q.add(A[i]);
        }
        Stack<Integer> s = new Stack<>();
        int c=0;
        while(c<B){
            s.push(q.remove());
            c++;
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        c=0;
        while(c<A.length-B){
            q.add(q.remove());
            c++;
        }
        for(int i=0;i<A.length;i++){
            A[i]=q.remove();
        }
        return A;
    }
}
