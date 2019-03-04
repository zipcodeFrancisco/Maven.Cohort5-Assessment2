package rocks.zipcode.assessment2.objectorientation;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */

     private Long id = Long.MIN_VALUE;
     private String name = "";
     private Address address = new Address();

    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Person p = (Person) o;
        Boolean name = this.name.equals(p.name);
        Boolean id = (this.id == null) ? this.id == (p.id) : this.id.equals(p.id);
        Boolean address = (this.address == null) ? this.address == (p.address) : this.address.equals(p.address);

        return name && id && address;
    }
}