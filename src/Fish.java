import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Fish extends Animal  {
    public Fish(String name, LocalDate birthDate, List<String> vaccination, String illness, String ownerName) {
        super(name, birthDate, vaccination, Collections.singletonList(illness), ownerName);
    }
}
