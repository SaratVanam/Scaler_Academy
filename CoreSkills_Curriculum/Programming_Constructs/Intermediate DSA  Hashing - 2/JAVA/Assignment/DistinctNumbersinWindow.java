//O(N) TC

public class Solution {
    public int[] dNums(int[] A, int B) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans= new int[A.length-B+1];
        if(B>A.length){
            return ans;
        }
        for(int i=0;i<B;i++){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }
            else{
                map.put(A[i],1);
            }
        }
        ans[0]=map.size();
        for(int i=1;i<=A.length-B;i++){
            map.put(A[i-1],map.get(A[i-1])-1);
            if(map.get(A[i-1])==0){
                map.remove(A[i-1]);
            }
            if(map.containsKey(A[i+B-1])){
                map.put(A[i+B-1],map.get(A[i+B-1])+1);
            }
            else{
                map.put(A[i+B-1],1);
            }
            ans[i]=map.size();
        }
        return ans;
    }
}
