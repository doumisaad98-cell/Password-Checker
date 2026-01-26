import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = "Saad";
        boolean unlocked = false;

        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Enter the password (attempt " + attempt + " of 3): ");
            String input = sc.nextLine();

            if (input.equals(password)) {
                System.out.println("Correct password");
                unlocked = true;
                break;
            } else {
                System.out.println("Wrong password. Try again.");
            }
        }

        if (!unlocked) {
            System.out.println("You are locked out.");
        }

        sc.close();
    }
}
