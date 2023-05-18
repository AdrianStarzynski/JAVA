import java.util.Scanner;
import static java.lang.Math.*;


// prosty kalkulator na podstawie dwoch liczb (typu double, ze wzgledu na dziwne liczby przy pierwiastku)

class Kalkulator {
	public static void main(String[] args) {
		double x,y;
		Scanner odczyt = new Scanner(System.in);
		
		System.out.print("Podaj pierwsza liczbe: ");
		x = odczyt.nextDouble();
		
		System.out.print("Podaj druga liczbe: ");
		y = odczyt.nextDouble();
		
		
		
		System.out.print(x+"+"+y+"=");
		System.out.println(x+y);
		
		System.out.print(x+"-"+y+"=");
		System.out.println(x-y);
		
		System.out.print(x+"*"+y+"=");
		System.out.println(x*y);
		
		System.out.print("sqrt("+x+")=");
		System.out.println(sqrt(x));
		
		System.out.print("sqrt("+y+")=");
		System.out.println(sqrt(y));
		
	}
}








