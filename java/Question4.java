import java.math.BigInteger;
import java.util.Scanner;
public class Question4 {



        public static int findNotFibPosition(int number) {
            long prev = 0;
            long curr = 1;

            if (number == 0) return 1;
            if (number == 1) return 2;

            int position = 2;

            while (curr < number) {
                long nextTerm = (3 * curr) + (2 * prev);

                prev = curr;
                curr = nextTerm;
                position++;   //update position
            }

            //if the number is found, return its exact position
            if (curr == number) {
                return position;
            } else {
                //if not found, return the closest smaller number's position
                return position - 1;
            }
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int position = findNotFibPosition(number);

        System.out.println("The position of " + number + " in the NotFibonacci sequence is: " + position);
    }
}


