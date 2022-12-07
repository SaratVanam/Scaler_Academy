// O(N) TC

public class Solution {
    public int solve(int[] A, int B) {
        int[] max=slidingMax(A,B);
        int[] min = slidingMin(A,B);
        long sum =0;
        int mod=1000000007;
        for(int i=0;i<max.length;i++){
            long temp=(max[i]+min[i])%mod;
            sum=(sum+temp)%mod;
            sum%=mod;
        }
        return (int) ((sum+mod)%mod);
    }

    public int[] slidingMax(int[] A, int B){
        int[] ans = new int[A.length-B+1];
        Deque<Integer> dq =  new ArrayDeque<>();
        for(int i=0;i<B;i++){
            while(!dq.isEmpty() && A[i]>A[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        int index=0;
        ans[index++]=A[dq.peekFirst()];
        for(int i=B;i<A.length;i++){
            while(!dq.isEmpty() && A[i]>A[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
            if(A[i-B]==A[dq.peekFirst()]){
                dq.removeFirst();
            }
            ans[index++]=A[dq.peekFirst()];
        }
        return ans;
    }

    public int[] slidingMin(int[] A, int B){
        int[] ans = new int[A.length-B+1];
        Deque<Integer> dq =  new ArrayDeque<>();
        for(int i=0;i<B;i++){
            while(!dq.isEmpty() && A[i]<A[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        int index=0;
        ans[index++]=A[dq.peekFirst()];
        for(int i=B;i<A.length;i++){
            while(!dq.isEmpty() && A[i]<A[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
            if(A[i-B]==A[dq.peekFirst()]){
                dq.removeFirst();
            }
            ans[index++]=A[dq.peekFirst()];
        }
        return ans;
    }
}
