// O(N) TC

public class Solution {
    public int[] solve(int A) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        int[] ans = new int[A];
        if(A==1){
            ans[0]=1;
            return ans;
        }
        if(A==2){
            ans[0]=1;
            ans[1]=2;
            return ans;
        }
        if(A==3){
            ans[0]=1;
            ans[1]=2;
            ans[2]=3;
            return ans;
        }
        ans[0]=1;
        ans[1]=2;
        ans[2]=3;
        int c=3;
        int index=3;
        while(c<A){
            int calculate=q.remove();
            q.add(calculate*10+1);
            ans[index]=calculate*10+1;
            c++;
            index++;
            if(c<A){
                q.add(calculate*10+2);
                ans[index]=calculate*10+2;
                c++;
                index++;
            }
            if(c<A){
                q.add(calculate*10+3);
                ans[index]=calculate*10+3;
                c++;
                index++;
            }
        }
        return ans;
    }
}
