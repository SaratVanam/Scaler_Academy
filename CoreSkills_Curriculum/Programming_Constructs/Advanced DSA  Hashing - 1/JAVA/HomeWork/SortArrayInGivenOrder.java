// O(NLogN) TC

public class Solution {
    public int[] solve(int[] A, int[] B) {
        Arrays.sort(A);
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[A.length];
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }
            else{
                map.put(A[i],1);
            }
        }
        int checkans=0;
        for(int i=0;i<B.length;i++){
            if(map.containsKey(B[i])){
                while(map.containsKey(B[i])){
                    ans[checkans]=B[i];
                    checkans++;
                    map.put(B[i],map.get(B[i])-1);
                    if(map.get(B[i])==0){
                        map.remove(B[i]);
                    }
                }
            }
        }
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                while(map.containsKey(A[i])){
                    ans[checkans]=A[i];
                    checkans++;
                    map.put(A[i],map.get(A[i])-1);
                    if(map.get(A[i])==0){
                        map.remove(A[i]);
                    }
                }
            }
        }
        return ans;
    }
}
