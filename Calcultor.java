import java.util.Scanner;

public class Calcultor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę, podaj pierwszą liczbę:");
        int firstNumber = scanner.nextInt();
        System.out.println("Proszę, podaj drugą liczbę:");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber/secondNumber;
        int mod = firstNumber%secondNumber;

        System.out.println("Wynik dodawania " + (firstNumber) +"+"+ (secondNumber) +"= "+ addition);
        System.out.println("Wynik odejmowania " + (firstNumber) +"-"+ (secondNumber) +"= " + subtraction) ;
        System.out.println("Wynik mnożenia " + (firstNumber) +"*"+ (secondNumber) +"= "  + multiplication) ;
        System.out.println("Wynik dzielenia " + (firstNumber) +"/"+ (secondNumber) +"= "  + division) ;
        System.out.println("Wynik modulo " + (firstNumber) + (secondNumber) +"= "  + mod) ;
    }
}