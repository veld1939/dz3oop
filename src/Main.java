import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <VeterinaryClinic> void main(String[] args) {
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

        System.out.println(barsic.getLegsCount());
        List<Animal> animals = new ArrayList<>();
        animals.add(barsic);
        animals.add(dog);
        duck.fly();
        fox.fly();

        veterinaryClinic clinic = new veterinaryClinic();
        clinic.addPatients(barsic, dog, fox, duck, new Fish("Pepe", LocalDate.of(1997, 2, 6),
                new ArrayList<>(), "Flu", "Harry"));
        System.out.println(clinic.getstaff());


    }
}