// O(NLogN) TC

public class Solution {
    public int mod=1000000007;
    public int solve(int[] A) {
        return mergeCount(A,0,A.length-1)%mod;
    }
    public int mergeCount(int[] A, int l, int r) {
        if(l==r){
            return 0;
        }
        int mid=l+(r-l)/2;
        int a=mergeCount(A,l,mid)%mod;
        int b=mergeCount(A,mid+1,r)%mod;
        int c=merge(A,l,mid,r)%mod;
        return (a+b+c)%mod;
    }

    public int merge(int[] a, int l, int mid, int r) {
        int count=0;
        int p1=l;
        int p2=mid+1;
        int k=0;
        int[] C = new int[r-l+1];
        while(p1<=mid && p2<=r){
            if(a[p1]<=a[p2]){
                C[k]=a[p1];
                k++;
                p1++;
            }
            else{
                C[k]=a[p2];
                k++;
                p2++;
                count+=(mid-p1+1)%mod;
            }
        }
        while(p1<=mid){
            C[k]=a[p1];
            p1++;
            k++;
        }
        while(p2<=r){
            C[k]=a[p2];
            k++;
            p2++;
        }
        k=0;
        for(int z=l;z<=r;z++){
            a[z]=C[k];
            k++;
        }
        return count%mod;
    }
}
