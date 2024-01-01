import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal implements Goable{
    public Dog(String name, LocalDate birthDate, List<String> vaccinations, List<String> illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }

    @Override
    public double run() {
        return 0;
    }
}
