import java.util.Scanner;

public class CustomScaner {
    public static void main(String[] args) {
        System.out.println("Proszę, podaj swoje imie :");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Cześć " + name + "!");
    }
}
