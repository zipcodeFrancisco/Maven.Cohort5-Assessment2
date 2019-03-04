package rocks.zipcode.assessment2.objectorientation;

import rocks.zipcode.assessment2.arrays.StringArrayUtils;
import rocks.zipcode.assessment2.objectorientation.animals.Animal;


public class myTests {


    public static void main(String[] args) {


        Person expectedOwner = new Person();
        Address expectedAddress = expectedOwner.getAddress();
        Long expectedId = null;

        // when
        Animal animal = new Animal();
//            Person actualOwner = animal.getOwner();

        System.out.println(expectedOwner);
        System.out.println(expectedAddress);
        System.out.println("Animal: " + animal);

        System.out.println("Animal.getOwner: " + animal.getOwner());
        System.out.println("Animal.getId: " + animal.getId());

        System.out.println("Animal.getAddress: " + animal.getAddress() );



    }

}
