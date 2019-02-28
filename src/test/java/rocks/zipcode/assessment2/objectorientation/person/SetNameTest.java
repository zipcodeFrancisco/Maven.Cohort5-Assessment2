package rocks.zipcode.assessment2.objectorientation.person;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.objectorientation.Person;

/**
 * @author leon on 28/11/2018.
 */
public class SetNameTest {
    @Test
    public void test1() {
        // given
        Person person = new Person();
        String expected = "e4auher";

        // when
        person.setName(expected);
        String actual = person.getName();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        Person person = new Person();
        String expected = "huijoigrgae";

        // when
        person.setName(expected);
        String actual = person.getName();

        // then
        Assert.assertEquals(expected, actual);
    }
}