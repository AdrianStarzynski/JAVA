import java.util.Scanner;

// porownuje elementy rownania i zwraca logiczną wartosc (true/false)
public class operatoryPorownania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę, podaj liczbę a :");
        int firstNumber = scanner.nextInt();
        System.out.println("Proszę, podaj liczbę b:");
        int secondNumber = scanner.nextInt();

        boolean result = secondNumber > firstNumber;

        System.out.println(result);
        System.out.println("a > b : " +  (firstNumber > secondNumber));
        System.out.println("a < b : " +  (firstNumber < secondNumber));
        System.out.println("a >= b : " +  (firstNumber >= secondNumber));
        System.out.println("a <= b : " +  (firstNumber <= secondNumber));
        System.out.println("a = b : " +  (firstNumber == secondNumber));
        System.out.println("a != b : " +  (firstNumber != secondNumber));
    }
}
