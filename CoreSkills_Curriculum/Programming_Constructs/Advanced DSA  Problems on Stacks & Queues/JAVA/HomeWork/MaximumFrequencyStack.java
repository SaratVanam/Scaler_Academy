// O(N) TC

public class Solution {
    public int[] solve(int[][] A) {
        HashMap<Integer, Stack<Integer>> stackMap= new HashMap<>();
        HashMap<Integer,Integer> freqMap= new HashMap<>();
        int[] ans = new int[A.length];
        int maxFreq=0;
        for(int i=0;i<A.length;i++){
            int freq;
            if(A[i][0]==1){
                if(!freqMap.containsKey(A[i][1])){
                    freqMap.put(A[i][1],1);
                    freq=1;
                }
                else{
                    freqMap.put(A[i][1],freqMap.get(A[i][1])+1);
                    freq=freqMap.get(A[i][1]);
                }
                if(!stackMap.containsKey(freq)){
                    Stack<Integer> temp = new Stack<>();
                    temp.push(A[i][1]);
                    stackMap.put(freq,temp);
                }
                else{
                    stackMap.get(freq).push(A[i][1]);
                }
                if(freq>maxFreq){
                    maxFreq=freq;
                }
                ans[i]=-1;
            }
            else{
                int popElement = stackMap.get(maxFreq).pop();
                ans[i]=popElement;
                if(stackMap.get(maxFreq).isEmpty()){
                    stackMap.remove(maxFreq);
                    maxFreq--;
                }
                freqMap.put(popElement, freqMap.get(popElement)-1);
                if(freqMap.get(popElement)==0){
                    freqMap.remove(popElement);
                }
                ans[i]=popElement;
            }
        }
        return ans;
    }
}
