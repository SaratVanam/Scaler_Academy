// O(N) TC

public class Solution {
    public int repeatedNumber(int[] A) {
        int element1=0;
        int count1=0;
        int element2=0;
        int count2=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==element1){
                count1++;
            }
            else if(A[i]==element2){
                count2++;
            }
            else if(count1==0){
                element1=A[i];
                count1=1;
            }
            else if(count2==0){
                element2=A[i];
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        int freq1=0;
        int freq2=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==element1){
                freq1++;
                if(freq1>(A.length/3)){
                    return element1;
                }
            }
            if(A[i]==element2){
                freq2++;
                if(freq2>(A.length/3)){
                    return element2;
                }
            }
        }
        return -1;
    }
}
