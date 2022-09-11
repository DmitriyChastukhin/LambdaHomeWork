import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> listPeople = new ArrayList<>();
        listPeople.add(new Person("Шарлъ-Мари", "Рене Леконт де Лиль", 56));
        listPeople.add(new Person("Жан-Клод", "Ван Дамм", 59));
        listPeople.add(new Person("Джованни", "Джакомо Казанова", 51));
        listPeople.add(new Person("Жан-Жак", "Руссо", 62));
        listPeople.add(new Person("Жозе", "Фарейра ди Каштру", 48));
        listPeople.add(new Person("Рикардо", "Изексон дос Сантос-Лейте", 42));
        listPeople.add(new Person("Иван", "Овчина-Телепнев-Одоевский", 17));
        listPeople.add(new Person("Михаил","Шаховский-Глебов-Стрешнев", 16));
        Predicate<Person> personPredicate = person -> person.getAge() < 18;
        listPeople.removeIf(personPredicate);
        Collections.sort(listPeople, new NotableSurnameComparator(3));
        for (Person p : listPeople) {
            System.out.println(p);
        }
    }
}

