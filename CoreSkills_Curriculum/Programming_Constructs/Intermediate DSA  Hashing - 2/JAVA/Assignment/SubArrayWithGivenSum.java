// O(N) TC

public class Solution {
    public int[] solve(int[] A, int B) {
        HashMap<Long,Integer> map = new HashMap<>();
        long[] psum=new long[A.length];
        long Z= (long) B;
        psum[0]=A[0];
        map.put(psum[0],0);
        for(int i=1;i<A.length;i++){
            psum[i]=psum[i-1]+A[i];
            if(!map.containsKey(psum[i])){
                map.put(psum[i],i);
            }
        }
        int l=-1;
        int r=-1;
        for(int i=0;i<psum.length;i++){
            long a =psum[i];
            long b=a-Z;
            if(psum[i]==Z){
                l=0;
                r=i;
                break;
            }
            if(map.containsKey(b)){
                l=map.get(b)+1;
                r=i;
                break;
            }
        }
        if(l==-1){
            return new int[]{-1};
        }
        int len=r-l+1;
        int[] ans= new int[len];
        int x=0;
        for(int i=l;i<=r;i++){
            ans[x]=A[i];
            x++;
        }
        return ans;
    }
}
