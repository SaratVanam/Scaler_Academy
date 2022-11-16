// O(NLogN) TC

public class Solution {
    public int threeSumClosest(int[] A, int B) {
        Arrays.sort(A);
        long minSum=Integer.MAX_VALUE;
        for(int i=0;i<=A.length-3;i++){
            int a=A[i];
            int s=i+1;
            int e=A.length-1;
            while(s<e){
                long sum=A[i]+A[s]+A[e];
                if(Math.abs(sum-B)<Math.abs(minSum-B)){
                    minSum=sum;
                }
                if(sum>B){
                    e--;
                }
                else{
                    s++;
                }
            }
        }
        return (int) minSum;
    }
}
