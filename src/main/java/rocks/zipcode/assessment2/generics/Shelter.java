package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.ArrayList;
import java.util.List;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<_> extends Ageable{

    List<Object> list;

    public Shelter() {
        list = new ArrayList<>();
//        throw new NullPointerException();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return list.size();
//        return -1;
    }

    public void add(Object object) {
        this.list.add(object);
    }

    public Boolean contains(Object object) {
        // TODO Check is (shelter instanceof Iterable) - test2 ShelterPolymorphismTest.java
        // System.out.println(list instanceof Iterable );
        return list.contains(object);
    }

    public void remove(Object object) {
        list.remove(object);
    }

    public Object get(Integer index) {
        return list.get(index);
    }

    // TODO Ask about this method
    public Integer getIndexOf(Object ageable) {
        return list.indexOf(ageable);
    }

}