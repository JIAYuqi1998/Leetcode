public class No5 {
    public String longestPalindrome(String s) {
        // dynamic programming
        if (s.length() < 2) {
            return s;
        }
        int n = s.length();
        int maxLen = 1;
        int start = 0;
        boolean dp[][] = new boolean[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i < 2 || dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                        if (j - i + 1 > maxLen) {
                            maxLen = j - i + 1;
                            start = i;
                        }
                    }
                }
            }
        }
        return s.substring(start, maxLen + start);
    }
    //extending
/*    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        int maxLen = 0;
        String ans = s.substring(0,1);
        for (int i = 0; i < s.length(); i++) {
            int len1 = entendPalindrome(i, i, s);
            int len2;
            len2 = (i + 1 >= s.length()) ? len1 : entendPalindrome(i, i + 1, s);
            int len = Math.max(len1, len2);
            if (len > maxLen) {
                if (len1 > len2) ans = s.substring(i - len / 2, i + len / 2 + 1);
                if (len2 > len1) ans = s.substring(i - len/2 + 1, i + len/2 + 1);
                maxLen = len;
            }
        }
        return ans;
    }
    private int entendPalindrome(int a, int b, String s) {
        if (s.charAt(a) != s.charAt(b)) {
            return 1;
        }
        int leftPtr = a;
        int rightPtr = b;
        while (leftPtr >= 0 && rightPtr < s.length() && s.charAt(leftPtr) == s.charAt(rightPtr)) {
            leftPtr -=1;
            rightPtr +=1;
        }
        return rightPtr - leftPtr - 1;
    }*/
    //brutal
/*    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        String ans = s.substring(0,1);
        int maxLen = 1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                String now = s.substring(i, j);
                boolean flag = true;
                for (int m = 0; m < now.length()/2;m++) {
                    if (now.charAt(m) != now.charAt(now.length() - m - 1)) {
                        flag = false;
                    }
                }
                if (flag) {
                    if (now.length() > maxLen) {
                        ans = now;
                        maxLen = now.length();
                    }
                }
            }
        }
        return ans;
    }*/
}
