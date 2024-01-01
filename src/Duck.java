import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal implements Swimble {
    public Duck(String name, LocalDate birthDate, List<String> vaccinations, List<String> illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }

    @Override
    public double swim() {
        return 0;
    }
}