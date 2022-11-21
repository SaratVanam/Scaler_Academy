// O(NlogN) TC

public class Solution {
    public int[] solve(int[] A) {
        quickSort(A,0,A.length-1);
        return A;
    }

    public int rearrange(int[] A, int l, int r){
        int p1=l+1;
        int p2=r;
        while(p1<=p2){
            if(A[p1]<=A[l]){
                p1++;
            }
            else if(A[p2]>A[l]){
                p2--;
            }
            else{
                swap(A, p1,p2);
                p1++;
                p2--;
            }
        }
        swap(A,l,p2);
        return p2;
    }
    public void swap(int[] A, int a, int b){
        int temp=A[a];
        A[a]=A[b];
        A[b]=temp;
    }
    public void quickSort(int[] A, int l , int r){
        if(l>=r){
            return;
        }
        int idx=rearrange(A,l,r);
        quickSort(A,l,idx-1);
        quickSort(A,idx+1,r);
    }
    
}
