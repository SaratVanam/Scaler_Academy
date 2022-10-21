// O(Log N)

public class Solution {
    public int pow(int A, int B, int C) {
        long a = find(A,B,C);
        if(a<0){
            while(a<0){
                a+=C;
            }
        }
        return (int) a%C;
    }

    public long find(int A, int B, int C){
        if(B==0){
            return 1;
        }
        long x=find(A,B/2,C);
        if(B%2==0){
            return x%C*x%C;
        }
        return x%C*x%C*A%C;
    }
}
