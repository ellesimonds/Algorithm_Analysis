import java.util.Scanner;
public class Question2 {

    public static String[] longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length(), len2 = text2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];

        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        int length = dp[len1][len2];
        StringBuilder commonSubsequence = new StringBuilder();

        //finds the subsequence
        int i = len1, j = len2;
        while (i > 0 && j > 0) {
            if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                commonSubsequence.insert(0, text1.charAt(i - 1));  //adds to front of the result
                i--;
                j--;
            } else if (dp[i - 1][j] >= dp[i][j - 1]) {
                i--;  //move up if the left cell has a larger value
            } else {
                j--;  //move left if the top cell has a larger value
            }
        }

        //converts to string array to return both length and subsequence
        return new String[]{String.valueOf(length), commonSubsequence.toString()};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prompts the user for input
        System.out.print("Enter the first string: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String text2 = scanner.nextLine();

        String[] result = longestCommonSubsequence(text1, text2);

        System.out.println("The longest common subsequence is: \"" + result[1] + "\"");
        System.out.println("The length of the longest common subsequence is: " + result[0]);
    }
}
