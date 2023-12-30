import java.time.LocalDate;
import java.util.List;

public class Fox extends Animal{
    public Fox(String name, LocalDate birthDate, List<String> vaccinations, List<String> illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }
    @Override
    public void fly(){
        System.out.println("fox no fly ");
    }

}
