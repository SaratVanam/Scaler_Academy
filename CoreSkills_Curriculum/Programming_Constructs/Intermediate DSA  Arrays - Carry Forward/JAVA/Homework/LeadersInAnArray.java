//O(N) TC 

public class Solution {
    public int[] solve(int[] A) {
        if(A.length==1){
            return A;
        }
        int max=A[A.length-1];
        int leaders=1;
        for(int i=A.length-2;i>=0;i--){
            if(A[i]>max){
                max=A[i];
                leaders++;
            }
        }
        int[] arr =new int[leaders];
        arr[arr.length-1]=A[A.length-1];
        int a=arr.length-2;
        max=A[A.length-1];
        for(int i=A.length-2;i>=0;i--){
            if(A[i]>max){
                max=A[i];
                arr[a]=A[i];
                a--;
            }
        }
        return arr;
    }
}
