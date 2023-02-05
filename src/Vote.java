import java.util.Scanner;

public class Vote {

public static void vote () {
    int ageToVote = 18;

    Scanner canVote = new Scanner(System.in);

    System.out.println("Please enter your age");

    int canIVote = canVote.nextInt();

    if (canIVote >= ageToVote) {
        System.out.println("You're eligible to vote");
    } else {
        System.out.println("You're not eligible to vote");
    }
}

}
