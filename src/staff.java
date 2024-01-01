import java.time.LocalDate;

public class staff {
    protected String name;
    protected String specialty;

    protected LocalDate birthDate;

    public staff(String name, String specialty, LocalDate birthDate) {

    }
    private void wakeup() {
        System.out.println("treats");
    }
    private void wakeup(int time) {
        System.out.println("help " );
    }

}








