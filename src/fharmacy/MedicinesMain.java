package fharmacy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MedicinesMain {
    public static void main(String[] args) {
        Component penicillin = new Component("Penicillin", "10 mg", 100);
        Component salt = new Component("Salt", "2 mg", 50);
        Component sugar = new Component("Sugar", " 5 mg", 30);

        Medicines medicines1 = new Medicines();
        medicines1.addComponents(salt,penicillin);

        IterobolMedicines medicines2 = new IterobolMedicines();
        medicines2.addComponents(sugar,penicillin);

        //Iterator<Component> iterator = medicines2;

        //while (iterator.hasNext()){
        //    System.out.println(iterator.next());
       //}
        for (Component c : medicines2){
            System.out.println(c);
        }
        List<Component> list = new ArrayList<>();
        list.add(salt);
        list.add(sugar);
        list.add(penicillin);
        Collections.sort(list);
        System.out.println(list);

        // @Override
        //public boolean equals(Object o) {
        //    if (this == o) return true;
        //    if (o == null || getClass() != o.getClass()) return false;
        //    Man man = (Man) o;
        //    return dnaCode == man.dnaCode;
        //}
    }
}
