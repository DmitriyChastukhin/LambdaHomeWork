import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> listPeople = new ArrayList<>();
        listPeople.add(new Person("Шарлъ-Мари", "Рене Леконт де Лиль", 56));
        listPeople.add(new Person("Жан-Клод", "Ван Дамм", 59));
        listPeople.add(new Person("Джованни", "Джакомо Казанова", 51));
        listPeople.add(new Person("Жан-Жак", "Руссо", 62));
        listPeople.add(new Person("Жозе", "Фарейра ди Каштру", 48));
        listPeople.add(new Person("Рикардо", "Изексон дос Сантос-Лейте", 42));

        Comparator<Person> comparator = (o1, o2) -> {
            int wordsSurname1 = o1.getSurname().split("(?U)\\W").length;
            int wordsSurname2 = o2.getSurname().split("(?U)\\W").length;
            if (wordsSurname1 > 4 && wordsSurname2 > 4 || wordsSurname1 == wordsSurname2) {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
            return Integer.compare(wordsSurname2, wordsSurname1);
        };
        Collections.sort(listPeople, comparator);
        for (Person p : listPeople) {
            System.out.println(p);
        }
    }
}

