import java.util.SortedMap;

public class instukcjaWarunkowaElseif {
    public static void main(String[] args) {
        int number =-4;

        if (number==0) {
            System.out.println("Liczba równa zero");
        } else if (number > 0) {
            System.out.println("Liczba dodatnia");
        } else if (number < -5) {
            System.out.println("Liczba mniejszza od -5");
        } else {
            System.out.println("Żaden warunerk nie został spełniowny");
        }
    }
}
