import java.util.Scanner;
public class Question1 {
        public static int longestCommonSubsequence(String text1, String text2) {
            int len1 = text1.length(), len2 = text2.length();
            int[][] array = new int[len1 + 1][len2 + 1];

            for (int i = 1; i <= len1; i++) {
                for (int j = 1; j <= len2; j++) {
                    if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                        array[i][j] = array[i - 1][j - 1] + 1;
                    } else {
                        array[i][j] = Math.max(array[i - 1][j], array[i][j - 1]);
                    }
                }
            }

            return array[len1][len2];
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the first string: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String text2 = scanner.nextLine();

        int result = longestCommonSubsequence(text1, text2);
        System.out.println("The length of the longest common subsequence is: " + result);
    }
}

