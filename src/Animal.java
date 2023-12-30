import java.time.LocalDate;
import java.util.List;

public class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List<String> illness;
    protected List<String> vaccinations;
    protected String owner;

    public Animal(String name, LocalDate birthDate, List<String> vaccinations, List<String> illness, String owner) {
        this.name = name;
        this.birthDate = birthDate;
        this.vaccinations = vaccinations;
        this.illness = illness;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public List<String> getIllness() {
        return illness;
    }

    public String getOwner() {
        return owner;
    }

    private void wakeup() {
        System.out.println("Animal is wake");
    }
    private void wakeup(int time) {
        System.out.println("Animal is wake in "  + time);
    }
    private void eat() {
        System.out.println("Animal ate ");
    }
    private void play() {
        System.out.println("Animal played");
    }
    private void sleep(){
        System.out.println("Animal sleeping");
    }
    protected void toGo(){
        System.out.println("Animal toGo");
    }
    protected void fly(){
        System.out.println("Animal fly");
    }
    protected void swim(){
        System.out.println("Animal swim");
    }
    public void skills(){
    }



    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", illness=" + illness +
                ", vaccinations=" + vaccinations +
                ", owner='" + owner + '\'' +
                '}';
    }
}
