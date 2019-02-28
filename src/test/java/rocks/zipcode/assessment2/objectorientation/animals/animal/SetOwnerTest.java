package rocks.zipcode.assessment2.objectorientation.animals.animal;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.objectorientation.Address;
import rocks.zipcode.assessment2.objectorientation.Person;
import rocks.zipcode.assessment2.objectorientation.animals.Animal;

/**
 * @author leon on 29/11/2018.
 */
public class SetOwnerTest {
    @Test
    public void setOwnerTest1() {
        // given
        Animal animal = new Animal();
        Address expectedAddress = new Address("yh54gres", "h54hreafe", "nrywre2e", "8948fweaeaw", "aw3rt32fev");
        Person expectedOwner = new Person(12L, "gvfdsagfds", expectedAddress);

        // when
        animal.setOwner(expectedOwner);
        Person actualOwner = animal.getOwner();
        Address actualAddress = animal.getAddress();

        // then
        Assert.assertEquals(expectedAddress, actualAddress);
        Assert.assertEquals(expectedOwner, actualOwner);
    }

    @Test
    public void setOwnerTest2() {
        // given
        Animal animal = new Animal();
        Address expectedAddress = new Address("hrsger", "fdsaf43wfea", "uhgiuw3ijfga", "faiuhfew", "fraheainu");
        Person expectedOwner = new Person(127L, "jfaoidsaf", expectedAddress);

        // when
        animal.setOwner(expectedOwner);
        Person actualOwner = animal.getOwner();
        Address actualAddress = animal.getAddress();

        // then
        Assert.assertEquals(expectedAddress, actualAddress);
        Assert.assertEquals(expectedOwner, actualOwner);
    }
}
