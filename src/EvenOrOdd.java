import java.util.Scanner;

public class EvenOrOdd {
        public static void evenOrOdd() {

            System.out.print("Enter a number");

            Scanner input = new Scanner(System.in);

            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is Odd");
            }
        }
}

