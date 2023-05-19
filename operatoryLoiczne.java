public class operatoryLoiczne {
    public static void main(String[] args) {

        boolean firstValue = 2>1;
        boolean secondValue = 2<1;
        boolean thirdValue = false;
        boolean fourValue = true;

        //&& i -> zwraca true wtedy gdy wyrazenia skladowe sa rowne true
        System.out.println(firstValue && secondValue); //false
        System.out.println(firstValue && fourValue); // true
        System.out.println(secondValue && thirdValue); // false

        // || lub -> true gdy jedno wyrażenie składowe jest równe true

        System.out.println(firstValue || secondValue); //true
        System.out.println(firstValue || fourValue); // true
        System.out.println(secondValue || thirdValue); // false

        // ! negacja  -  zwraca wartosc przecina do wyrazenie przed ktorym sie znajduje

        System.out.println(!firstValue); //false
        System.out.println(!thirdValue); // true
        System.out.println(!(firstValue&&secondValue)); //true



    }
}
