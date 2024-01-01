import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class veterinaryClinic {

    private List<Animal> patients = new ArrayList<>();

    public void addPatient(Animal animal) {
        patients.add(animal);
    }

    public void addPatients(Animal... animals) {
        Collections.addAll(patients, animals);
    }

    public List<Goable> getGoables() {
        List<Goable> result = new ArrayList<>(patients.size());
        for (Animal animal : patients) {
            if (animal instanceof Goable)
                result.add((Goable) animal);
        }
        return result;
    }

    private List<Animal> staff = new ArrayList<>();

    public void addStaff(Animal animal) {
        staff.add(animal);
    }

    public void addStaff(Animal... animals) {
        Collections.addAll(staff, animals);
    }

    public List<Goable> getGstaff() {
        List<Goable> result = new ArrayList<>(staff.size());
        for (Animal animal : staff) {
            if (animal instanceof Goable)
                result.add((Goable) animal);
        }
        return result;
    }

    public List<Goable> getFlybles() {
        List<Goable> result = new ArrayList<>(patients.size());
        for (Animal animal : patients) {
            if (animal instanceof Flyble)
                result.add((Goable) animal);
        }
        return result;
    }

    public List<Swimble> getSwimbles() {
        List<Swimble> result = new ArrayList<>(patients.size());
        for (Animal animal : patients) {
            if (animal instanceof Swimble)
                result.add((Swimble) animal);
        }
        return result;
    }


    public boolean getstaff() {
        return false;
    }
}