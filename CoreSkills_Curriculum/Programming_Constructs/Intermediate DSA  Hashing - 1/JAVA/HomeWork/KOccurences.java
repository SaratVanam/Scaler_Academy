//O(N) TC

public class Solution {
    public int getSum(int A, int B, int[] C) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<C.length;i++){
            if(map.containsKey(C[i])){
                int val=map.get(C[i]);
                map.remove(C[i]);
                val++;
                map.put(C[i],val);
            }
            else{
                map.put(C[i],1);
            }
        }
        int sum=0;
        int flag=0;
        if(map.containsKey(0) && map.get(0)==B){
            flag=1;
        }
        for(int i=0;i<C.length;i++){
            int val=map.get(C[i]);
            if(val==B){
                sum+=C[i];
                sum%=1000000007;
                map.remove(C[i]);
                map.put(C[i],0);
            }
        }
        if(sum==0 && flag==0){
            return -1;
        }
        return sum;
    }
}
