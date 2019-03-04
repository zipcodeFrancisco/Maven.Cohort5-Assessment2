package rocks.zipcode.assessment2.objectorientation.animals;

import rocks.zipcode.assessment2.objectorientation.Address;
import rocks.zipcode.assessment2.objectorientation.Person;

/**
 * @author leon on 29/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Person` class before attempting this class.
 */
public class Animal{
    public Animal() {
    }

    /**
     * @param id - id of animal
     * @param owner - owner of animal
     */

    private Long id;
    private Person owner;

    public Animal(Long id, Person owner) {
        this.id = id;
        this.owner = owner;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getOwner() {
        return this.owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    // TODO Review IMPORTANT
    public Address getAddress() {
//        System.out.println("xxxx");
//        System.out.println( getOwner() );
//        System.out.println( owner );

//        return owner.getAddress();


//        System.out.println("Dentro de getAddress");
//        System.out.println("1.- " + this.getOwner().getAddress() );
//        System.out.println("Fin pruebas");
        return this.getOwner().getAddress();
    }
}
