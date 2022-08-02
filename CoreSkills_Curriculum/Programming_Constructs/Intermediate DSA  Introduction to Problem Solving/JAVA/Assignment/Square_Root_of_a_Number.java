import java.util.Scanner;
// O(logN) time complexity

public class Square_Root_of_a_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }

    public static int solve(int A) {
        if(A==1){
            return 1;
        }
        int s =2;
        int e =A;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid*mid==A){
                return mid;
            }
            else if(mid*mid>A){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
}
