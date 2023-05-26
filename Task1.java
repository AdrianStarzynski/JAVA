/*
1. Wypisz liczby z zakresu 1-100 podzielne przez 3
2. Oswroc elementy tablicy  [1,3,5,7,0] -> [0,7,5,3,1]
 */
public class Task1 {
    public static void main(String[] args) {
        /*for (int i = 0; i <= 100; i++)
            if (i % 3 == 0) {
                System.out.println("Jestem podzielna przez 3 : " + i);
`````````*/
        int[] numbers = new int[] {1,3,5,7,0};

        for (int i=0;i<numbers.length/2;i++) {
        int temp = numbers[i];
        numbers[i] = numbers[numbers.length-1-i];
        numbers[numbers.length-1-i] = temp;
            System.out.println("Inerakcja numer" + i);
        }
        for (int i=0;i<numbers.length;i++)
        {
            System.out.println(numbers[i]);
    }
    }}