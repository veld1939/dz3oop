import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat barsic = new Cat("barsic", LocalDate.of(2000,
                10,9),
                new ArrayList<>(),new ArrayList<>(),
                "Petrov",4);
        Animal dog = new Dog("lord", LocalDate.of(2006,
                1,19),
                new ArrayList<>(),new ArrayList<>(),
                "Petrov");
        Animal duck = new Duck("dag", LocalDate.of(2002,
                5,1),
                new ArrayList<>(),new ArrayList<>(),
                "Petrov");
        Animal fox = new Fox("alisa", LocalDate.of(2007,
                12,16),
                new ArrayList<>(),new ArrayList<>(),
                "Petrov");
        System.out.println(barsic);
        System.out.println(dog);
        System.out.println(duck);
        System.out.println(fox);
        System.out.println(barsic.getLegsCount());
        List<Animal> animals = new ArrayList<>();
        animals.add(barsic);
        animals.add(dog);
        //dog.wakeup();
        //dog.wakeup( 4);
        System.out.println("---------------------------");
        //barsic.lifeCycle();
        duck.fly();
        fox.fly();
    }
}