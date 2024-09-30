package JavaStringHandling.AdditionalPrograms;
public class StringInterleaving {
    public static boolean isInterleaving(String A, String B, String C) {
        int M = A.length(), N = B.length();
        if (M + N != C.length()) return false;
        boolean[][] dp = new boolean[M + 1][N + 1];

        for (int i = 0; i <= M; i++) {
            for (int j = 0; j <= N; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = dp[i][j - 1] && B.charAt(j - 1) == C.charAt(i + j - 1);
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] && A.charAt(i - 1) == C.charAt(i + j - 1);
                } else {
                    dp[i][j] = (dp[i - 1][j] && A.charAt(i - 1) == C.charAt(i + j - 1)) || 
                               (dp[i][j - 1] && B.charAt(j - 1) == C.charAt(i + j - 1));
                }
            }
        }
        return dp[M][N];
    }

    public static void main(String[] args) {
        String A = "abc";
        String B = "def";
        String C = "adefbc";
	        System.out.println("A:"+A); // true
	        System.out.println("B:"+B); // true
        System.out.println("C:"+C); // true

        System.out.println("String Interleaving is :"+isInterleaving(A, B, C)); // true
    }
}

