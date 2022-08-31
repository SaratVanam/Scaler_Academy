//O(A+B) TC

public class Solution {
    public int[] solve(int[] A, int[] B) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<A.length;i++){
            if(map1.containsKey(A[i])){
                map1.put(A[i],map1.get(A[i])+1);
            }
            else{
                map1.put(A[i],1);
            }
        }
        for(int i=0;i<B.length;i++){
            if(map2.containsKey(B[i])){
                map2.put(B[i],map2.get(B[i])+1);
            }
            else{
                map2.put(B[i],1);
            }
        }
        for(int i=0;i<A.length;i++){
            if(map1.containsKey(A[i]) && map2.containsKey(A[i])){
                if(map1.get(A[i])>0 && map2.get(A[i])>0){
                    ans.add(A[i]);
                    map1.put(A[i], map1.get(A[i])-1);
                    map2.put(A[i], map2.get(A[i])-1);
                }
            }
        }
        int[] arr= new int[ans.size()];
        for(int i=0;i< ans.size();i++){
            arr[i]=ans.get(i);
        }
        return arr;
    }
}
