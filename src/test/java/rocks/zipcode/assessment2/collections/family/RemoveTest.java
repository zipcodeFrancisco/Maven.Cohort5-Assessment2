package rocks.zipcode.assessment2.collections.family;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.collections.Family;
import rocks.zipcode.assessment2.objectorientation.Person;

/**
 * @author leon on 28/11/2018.
 */
public class RemoveTest {
    @Test
    public void test() {
        // Given
        Family family = new Family();
        Person newFamilyMember = new Person();
        family.add(newFamilyMember);

        // when
        family.remove(newFamilyMember);
        Boolean outcome = family.contains(newFamilyMember);

        // then
        Assert.assertFalse(outcome);
    }
}
