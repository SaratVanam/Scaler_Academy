//O(N) TC

public class Solution {
    public int[] lszero(int[] A) {
        long[] psum= new long[A.length];
        psum[0]=A[0];
        long sum=A[0];
        for(int i=1;i<A.length;i++){
            sum=A[i]+sum;
            psum[i]=sum;
        }
        HashMap<Long,Integer> map1= new HashMap<>();
        int l=0;
        int r=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<psum.length;i++){
            if(psum[i]==0){
                if(i+1>max){
                    max=i+1;
                    l=0;
                    r=i;
                }
            }
            if(map1.containsKey(psum[i]) && psum[i]!=0){
                int curr=i;
                int prev=map1.get(psum[i]);
                if(curr-prev>max){
                    max=curr-prev;
                    l=prev+1;
                    r=curr;
                }
            }
            else{
                map1.put(psum[i],i);
            }
        }
        if(max==Integer.MIN_VALUE){
            return new int[0];
        }
        int[] ans = new int[max];
        int x=0;
        for(int i=l;i<=r;i++){
            ans[x]=A[i];
            x++;
        }
        return ans;
    }
}
