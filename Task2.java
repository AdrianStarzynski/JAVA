/* Stworz 3 obiekty klasy student. Przypisz wartosci do pol.
Stworz tablice i dodaj studentow do tablicy.
Przejdz przez Studentów w tablicy  i wywolaj wszystkie 4 metody.
 */
public class Task2 {
    public static void main(String[] args) {

        Student first = new Student();
        first.imie = "Krystyna";
        first.nazwisko = "Nowak";
        first.nick = "KrysiaN95";
        first.email = "KrysiaN95@gmail.com";
        first.numerIndeksu = 9521;

        Student second = new Student();
        second.imie = "Beata";
        second.nazwisko = "Jura";
        second.nick = "Jura992";
        second.email = "jura922b@gmail.com";
        second.numerIndeksu = 9431;

        Student third = new Student();
        third.imie = "Beata";
        third.nazwisko = "Jura";
        third.nick = "Jura992";
        third.email = "jura922b@gmail.com";
        third.numerIndeksu = 9497;

        Student[] students = new Student[3];
        students[0] = first;
        students[1] = second;
        students[2] = third;

        for (int i = 0; i < students.length; i++) {
            students[i].przedstawSie();
            students[i].podajEmail();
            students[i].podajNrIndeksu();
            students[i].zalogujSie();
        }

    }
}
