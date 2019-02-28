package rocks.zipcode.assessment2.objectorientation.person;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.objectorientation.Address;
import rocks.zipcode.assessment2.objectorientation.Person;

/**
 * @author leon on 29/11/2018.
 */
public class PersonConstructorTest {
    @Test
    public void testNullaryConstructor() {
        // given
        Person person = new Person();
        Long expectedId = Long.MIN_VALUE;
        String expectedName = "";
        Address expectedAddress = new Address();

        // when
        Long actualId = person.getId();
        String actualName = person.getName();
        Address actualAddress = person.getAddress();

        // then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAddress, actualAddress);
    }


    @Test
    public void testConstructor() {
        // given
        Long expectedId = 12367L;
        String expectedName = "FEHasuifaf";
        Address expectedAddress = new Address("faevafe","13e2er132", "dsafdsa","g34qrewqfg","vfeaghtrsf");
        Person person = new Person(expectedId, expectedName, expectedAddress);

        // when
        Long actualId = person.getId();
        String actualName = person.getName();
        Address actualAddress = person.getAddress();

        // then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAddress, actualAddress);
    }
}
