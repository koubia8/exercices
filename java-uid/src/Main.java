import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people= getPeople();
        //Imperative approche
        List<Person> females= new ArrayList<>();
        for (Person person : people){
            if (person.getGender().equals(Gender.FEMALE)){
                females.add(person);
            }
        }
        females.forEach(System.out::println);
        // declarative approch
        // Filtrage
        System.out.println("******Declarative approch api stream******");
        System.out.println("------- Filter------");
       List<Person> femalesdata= people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
        females.forEach(System.out::println);
        // sort
         System.out.println("------- SORT------");
         List<Person> sorted=people.stream()
                 .sorted(Comparator.comparing(Person::getAge)
                         .thenComparing(Person::getGender))
                 .collect(Collectors.toList());
        sorted.forEach(System.out::println);
        // All match
        System.out.println("------- All match------");
       boolean allMatch= people.stream()
               .anyMatch(person -> person.getAge() > 20);
       System.out.println(allMatch);
    }



    private static List<Person> getPeople(){
        return List.of(
                new Person("Oumar Diallo",30, Gender.MALE),
                new Person("Kaba bale",27, Gender.MALE),
                new Person("Lamine Ndiaye",29, Gender.MALE),
                new Person("Serge",28, Gender.MALE),
                new Person("Abdourahmane Ndiaye",20, Gender.MALE),
                new Person("Fatou Dioum",26, Gender.FEMALE),
                new Person("Ndeya Diop",26, Gender.FEMALE)
        );
    }
}
