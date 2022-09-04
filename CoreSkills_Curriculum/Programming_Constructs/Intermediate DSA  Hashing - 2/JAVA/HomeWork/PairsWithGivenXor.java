// O(N) TC

public class Solution {
    public int solve(int[] A, int B) {
        HashSet<Integer> set = new HashSet<>();
        int count=0;
        for(int i=0;i<A.length;i++){
            int a = A[i];
            int b=B^a;
            if(set.contains(b)){
                count++;
            }
            set.add(A[i]);
        }
        return count;
    }
}
