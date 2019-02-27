package rocks.zipcode.assessment2.collections.family;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.collections.Family;

import java.util.Collection;

/**
 * @author leon on 28/11/2018.
 */
public class FamilyInheritanceTest {
    @Test
    public void ensureFamilyIsNotCollectionObject() {
        // Given
        Family family = new Family();

        //when
        //then
        Assert.assertFalse(family instanceof Collection);
    }

    @Test
    public void ensureFamilyIsIterable() {
        // given
        Family family = new Family();

        // when
        // then
        Assert.assertTrue(family instanceof Iterable);
    }
}