import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int ageToVote = 18;

        Scanner canVote = new Scanner(System.in);

        System.out.println("Please enter your age");

        int canIVote = canVote.nextInt();

        if (canIVote >= ageToVote) {
            System.out.println("You're eligible to vote");
        } else {
            System.out.println("You're not eligible to vote");
        }
        System.out.println("Methods 2");
        System.out.println(MinMax.getMax(1,18,18));
        System.out.println(MinMax.getMin(1,18,-8));

        System.out.println("Methods 3");
        EvenOrOdd.evenOrOdd();

        System.out.println("Methods 4");

        System.out.println("Claases & Objects");
        System.out.println("Car & Driver");
    }
}