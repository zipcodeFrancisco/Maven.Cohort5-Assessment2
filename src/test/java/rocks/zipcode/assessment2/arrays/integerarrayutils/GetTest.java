package rocks.zipcode.assessment2.arrays.integerarrayutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.arrays.IntegerArrayUtils;

/**
 * @author leon on 28/11/2018.
 */
public class GetTest {
    @Test
    public void testGet1() {
        // Given
        Integer indexToFetch = 2;
        Integer[] input = {1,2,5,178931798};
        Integer expected = 5;

        // when
        Integer actual = IntegerArrayUtils.get(input, indexToFetch);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGet2() {
        // Given
        Integer indexToFetch = 0;
        Integer[] input = {12345,2,5,8};
        Integer expected = 12345;

        // when
        Integer actual = IntegerArrayUtils.get(input, indexToFetch);

        // then
        Assert.assertEquals(expected, actual);
    }
}
