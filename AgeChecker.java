/*Ask User for a Him age.
If user don't have 18 years old.
Put information "You are too young for buy alkohol!"
If user have above 18 years old put out information "Thanks for your purchase." */
import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How are old you?:");
        int age = scanner.nextInt();

        if (age==0) {
            System.out.println("You are too young for buy alkohol!");
        } else if (age < 18) {
            System.out.println("You are too young for buy alkohol!");
        }else if (age >= 18) {
            System.out.println("Thanks for your purchase.");
        }
        else if (age > 18) {
            System.out.println("Thanks for your purchase.");
        }
    }
}
