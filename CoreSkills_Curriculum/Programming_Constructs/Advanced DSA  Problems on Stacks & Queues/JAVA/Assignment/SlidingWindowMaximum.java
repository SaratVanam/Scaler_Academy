// O(N) TC

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] slidingMaximum(final int[] A, int B) {
        if(B>A.length){
            return new int[]{Arrays.stream(A).max().getAsInt()};
        }
        int[] ans = new int[A.length-B+1];
        Deque<Integer> dq = new ArrayDeque<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<B;i++){

            if(!dq.isEmpty()){
                while(!dq.isEmpty() && A[i]>dq.getLast()){
                    dq.removeLast();
                }
                dq.add(A[i]);
                max=Math.max(max,dq.getLast());
            }
            else{
                dq.add(A[i]);
                max=Math.max(max,dq.getLast());
            }
        }
        ans[0]=max;
        int index=1;
        for(int i=B;i<A.length;i++){
            if(!dq.isEmpty()){
                while(!dq.isEmpty() && A[i]>dq.getLast()){
                    dq.removeLast();
                }
                dq.add(A[i]);

            }
            else{
                dq.add(A[i]);
            }
            if(A[i-B]==dq.getFirst()){
                dq.removeFirst();
            }
            max=dq.getFirst();
            ans[index]=max;
            index++;
        }
        return ans;
    }
}
