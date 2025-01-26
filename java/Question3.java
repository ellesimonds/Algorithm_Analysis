import java.math.BigInteger;
import java.util.Scanner;

public class Question3 {

    public static void notFibSequence(int terms) {
        BigInteger previous = BigInteger.valueOf(0);
        BigInteger current = BigInteger.valueOf(1);

        System.out.print(previous + ", " + current);

        for (int i = 2; i < terms; i++) {

            BigInteger nextTerm = current.multiply(BigInteger.valueOf(3)).add(previous.multiply(BigInteger.valueOf(2)));

            System.out.print(", " + nextTerm);

            previous = current;
            current = nextTerm;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();

        notFibSequence(terms);
    }
}



