import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;

public class climbStairs {
    // maximum profit
    public int solver(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = 1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                dp[i][j] = grid[i][j];
                if (i > 0 && j > 0) {
                    if (dp[i - 1][j] > dp[i][j-1]) {
                        dp[i][j] += dp[i-1][j];
                    } else {
                        dp[i][j] += dp[i][j-1];
                    }
                } else if (i > 0) {
                    dp[i][j] += dp[i - 1][j];
                } else {
                    dp[i][j] += dp[i][j - 1];
                }
            }
        }
        return dp[grid.length -1][grid[0].length -1];
    }
    // unique paths with obstacles;
//    public int solver(int[][] grid) {
//        int[][] dp = new int[grid.length][grid[0].length];
//        dp[0][0] = 1;
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                if (grid[i][j] == 1){
//                    grid[i][j] = 0;
//                    continue;
//                }
//                if (i > 0 && j > 0) {
//                    dp[i][j] += dp[i - 1][j] + dp[i][j - 1];
//                } else if (i > 0) {
//                    dp[i][j] += dp[i - 1][j];
//                } else {
//                    dp[i][j] += dp[i][j - 1];
//                }
//            }
//        }
//        return dp[grid.length-1][grid[0].length-1];
//    }
/*    public int  solver (int m, int n) {
        //unique paths
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0 && j > 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                } else if (i > 0) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }*/
        // int[] m represents the cost of each stair.
/*        int[] dp = new int[k];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < k; j++) {
                if (i - j < 0) {
                    continue;
                }
                dp[i % k] = Math.min(dp[i % k], dp[(i - j) % k]);
            }
            dp[i % k] += + m[i - 1];
        }
        return dp[n % k];*/
        // int[] m to represent the stairs that can not be stepped.
/*        int[] dp = new int[k];
        dp[0] = 1;
        ArrayList m_copy = new ArrayList();
        for (int i : m) {
            m_copy.add(i);
        }
        for (int i = 1; i <= n; i++) {
            if (m_copy.contains(i)) {
                dp[i % k] = 0;
                continue;
            }
            for (int j = 1; j < k; j++) {
                if (i - j < 0) {
                    continue;
                }
                dp[i % k] += dp[(i - j) % k];
            }
        }
        return dp[n % k];*/
/*        int[] dp = new int[k+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n; i++) {
            if (i < k) {
                for (int j = 0; j < i; j++) {
                    dp[i] += dp[j];
                }
            } else {
                for (int j = 0; j<k;j++) {
                    dp[k] += dp[j];
                }
                for (int m = 0; m < k; m++) {
                    dp[m] = dp[m+1];
                }
            }
        }
        return dp[k];*/
// Use mod to do this
/*        int dp[] = new int[k];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < k; j++) {
                if (i - j <0) {
                    continue;
                }
                dp[i%k] += dp[(i - j)%k];
            }
        }
        return dp[n % k];*/
}
