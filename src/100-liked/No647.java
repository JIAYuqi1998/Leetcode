public class No647 {
    //dynamic programming
    public int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (i == j || i + 1 == j || i + 2 ==j || dp[i+1][j-1]) {
                        dp[i][j] = true;
                        count++;
                    }
                }
            }
        }
        return count;
    }



    //extend
//    public int countSubstrings(String s) {
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            count = count + extend(s, i, i) + extend(s, i , i + 1);
//        }
//        return count;
//    }
//    private int extend(String s, int leftIndex, int rightIndex) {
//        int count = 0;
//        while (leftIndex >= 0 && rightIndex <= s.length() - 1 && s.charAt(leftIndex) == s.charAt(rightIndex)) {
//            count++;
//            leftIndex--;
//            rightIndex++;
//        }
//        return count;
//    }
}
