// O(NLogN) TC
public class Solution {
    public int solve(ArrayList<Integer> A) {
         int N=A.size();

        int k=mergesort(A,0,N-1);

        return k;
    }
    public int merge(ArrayList<Integer>A,int s,int m,int e){

        int p1=s,p2=m+1,p3=0,c=0;
        int q1=s,q2=m+1;
        ArrayList <Integer> temp=new ArrayList<>();

        while (p1<=m && p2<=e){      // we using this while loop for sorting the Array.
            if (A.get(p1)<=A.get(p2)){  // if we put the condition A[p1]<= 2*A[p2] resultant sorted array shall be wrong.
                temp.add(p3,A.get(p1)); // thus we have not counted no. of pairs in this while loop.

                p1++;p3++; // we shall use seperate while loop for counting the pairs.
            } // logic for counting remains similar.
            else{
               
                temp.add(p3,A.get(p2));
                p2++;p3++;
            }
        }
        while (q1<=m && q2<=e){
            if ((long)A.get(q1)>2*((long)A.get(q2))){
                c+=m-q1+1;
                q2++;
            }
            else q1++;
        }
       
        //adding remiaing elements.
        while (p1<=m){
            temp.add(p3,A.get(p1));
            p3++;p1++;
        }
        while (p2<=e){
            temp.add(p3,A.get(p2));
            p3++;p2++;
        }
        //adding elements back to A.
        for (int i=s;i<=e;i++){
            A.set(i,temp.get(i-s));
        }
       return c;
    }

    public int mergesort(ArrayList<Integer>A,int s,int e){
        if (s==e) return 0;

        int m=(s+e)/2;

        int l=mergesort(A,s,m);
        int r=mergesort(A,m+1,e);
        int c=merge(A,s,m,e);

        return l+r+c;
    }
}

