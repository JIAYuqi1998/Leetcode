import java.util.Stack;

public class No907 {
    public int sumSubarrayMins(int[] A) {
        Stack<int[]> leftSmaller = new Stack<>();
        Stack<int[]> rightSmaller = new Stack<>();
        int[] leftDis = new int[A.length];
        int[] rightDis = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            while (!leftSmaller.isEmpty() && leftSmaller.peek()[0] >= A[i]) {
                leftSmaller.pop();
            }
            leftDis[i] = leftSmaller.isEmpty()? i + 1: i- leftSmaller.peek()[1];
            leftSmaller.push(new int[]{A[i], i});
        }
        for (int i = A.length - 1; i >= 0; i--) {
            while (!rightSmaller.isEmpty() && rightSmaller.peek()[0] > A[i]) {
                rightSmaller.pop();
            }
            rightDis[i] = rightSmaller.isEmpty()? A.length - i: rightSmaller.peek()[1] - i;
            rightSmaller.push(new int[]{A[i], i});
        }
        int ans = 0;
        int mod = 1000000007;
        for (int i = 0; i < A.length; i++) {
            ans += A[i] * leftDis[i] * rightDis[i];
        }
        return ans % mod;
    }
}
