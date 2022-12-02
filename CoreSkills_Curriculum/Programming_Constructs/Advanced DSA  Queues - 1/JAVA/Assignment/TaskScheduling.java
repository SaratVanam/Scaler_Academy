// O(N) TC

public class Solution {
    public int solve(int[] A, int[] B) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<A.length;i++){
            q.add(A[i]);
        }
        int c=0;
        int index=0;
        while(!q.isEmpty()){
            if(q.peek()!=B[index]){
                q.add(q.remove());
            }
            else{
                q.remove();
                index++;
            }
            c++;
        }
        return c;
    }
}
