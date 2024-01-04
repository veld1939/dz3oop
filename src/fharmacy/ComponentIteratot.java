package fharmacy;

import java.util.Iterator;

public class ComponentIteratot implements Iterator<Component> {

    private int index = 0;
    private IterobolMedicines medicines;

    public ComponentIteratot(IterobolMedicines medicines) {
        this.medicines = medicines;
    }

    @Override
    public boolean hasNext() {
        return index < medicines.getComponents().size();
    }


    @Override
    public Component next() {
        return medicines.getComponents().get(index++);
    }

}

