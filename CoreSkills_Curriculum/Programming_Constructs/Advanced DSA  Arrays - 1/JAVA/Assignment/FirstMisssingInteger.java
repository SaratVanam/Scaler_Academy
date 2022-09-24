// O(N) TC

public class Solution {
    public int firstMissingPositive(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if (A[i] > 0 && A[i] <= n) {
                int pos = A[i] - 1;
                if (A[pos] != A[i]) {
                    swap(pos, i, A);
                    i--;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (A[i] != i + 1)
                return (i + 1);
        }
        return n + 1;
    }

    public static void swap(int a, int b, int[] A){
        int temp=A[a];
        A[a]=A[b];
        A[b]=temp;
    }
}
