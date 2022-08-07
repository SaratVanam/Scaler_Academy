//O(N) TC and O(N) SC, Can also be solved with constant space complexity.

public class Solution {
    public int solve(int[] A) {
        int[] psume = new int[A.length];
        int[] psumo = new int[A.length];
        psumo[0]=0;
        psume[0]=A[0];
        for(int i=1;i<A.length;i++){
            if(i%2==0){
                psume[i]=psume[i-1]+A[i];
                psumo[i]=psumo[i-1];
            }
            else{
                psume[i]=psume[i-1];
                psumo[i]=psumo[i-1]+A[i];
            }
        }

        int count=0;
        for(int i=0;i<A.length;i++){
            int sume=0;
            int sumo=0;
            if(i==0){
                sume=psumo[A.length-1];
                sumo=psume[A.length-1]-psume[0];
                if(sume==sumo){
                    count++;
                }
            }
            else{
                sume=psume[i-1]+psumo[A.length-1]-psumo[i];
                sumo=psumo[i-1]+psume[A.length-1]-psume[i];
                if(sume==sumo){
                    count++;
                }
            }
        }
        return count;
    }
}
