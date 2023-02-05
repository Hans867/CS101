import java.util.Scanner;

public class NameInitials {
    public static void nameInitials() {

        Scanner inputFullName = new Scanner(System.in);

        System.out.println("Enter your full name");

        String fullName = inputFullName.nextLine();

        String[] names = fullName.split(" ");

        String firstNameInitial = names[0].substring(0,1).toUpperCase() + ".";
        String middleNameInitial = "";

        if (names.length >= 3) {
            middleNameInitial = names[1].substring(0,1).toUpperCase() + ".";
        }
        String lastName = names[names.length - 1];

        System.out.println(firstNameInitial + "" + middleNameInitial + "" + lastName);

    }
}
