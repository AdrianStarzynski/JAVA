import java.util.Scanner;
public class Quest3 {

        public static void main(String[] args) {
            Metody metody = new Metody();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Proszę, podaj pierwszą liczbę:");
            int firstNumber = scanner.nextInt();
            System.out.println("Proszę, podaj drugą liczbę:");
            int secondNumber = scanner.nextInt();

            qest3Metod qest3Metod = new qest3Metod();

            int addition = qest3Metod.add(firstNumber,secondNumber);
            int subtraction = qest3Metod.sub(firstNumber,secondNumber);
            int multiplication = qest3Metod.mult(firstNumber,secondNumber);
            int division = qest3Metod.div(firstNumber,secondNumber);
            int mod = qest3Metod.mod(firstNumber,secondNumber);

            System.out.println("Wynik dodawania " + (firstNumber) +"+"+ (secondNumber) +"= "+ addition);
            System.out.println("Wynik odejmowania " + (firstNumber) +"-"+ (secondNumber) +"= " + subtraction) ;
            System.out.println("Wynik mnożenia " + (firstNumber) +"*"+ (secondNumber) +"= "  + multiplication) ;
            System.out.println("Wynik dzielenia " + (firstNumber) +"/"+ (secondNumber) +"= "  + division) ;
            System.out.println("Wynik modulo " + (firstNumber) + (secondNumber) +"= "  + mod) ;
        }

}
