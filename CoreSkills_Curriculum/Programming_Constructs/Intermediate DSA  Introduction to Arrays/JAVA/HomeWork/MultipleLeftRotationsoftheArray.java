//O(N*M) TC
public class Solution {
    public int[][] solve(int[] A, int[] B) {
        int res[][] = new int[B.length][A.length];
        for(int i=0;i<B.length;i++){
            int n=B[i];
            if(n>=A.length){
                n=n%A.length;
            }
            int[] temp = new int[A.length];
            for(int k=0;k<A.length;k++){
                temp[k]=A[k];
            }
            rotate(temp,n);
            for(int j=0;j<A.length;j++){
                res[i][j]=temp[j];
            }
        }
        return res;
    }
    public void rotate(int[] arr, int n){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        s=0;
        e=arr.length-n-1;
        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        s=arr.length-n;
        e=arr.length-1;
        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
