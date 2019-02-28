package rocks.zipcode.assessment2.arrays.integerarrayutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.arrays.IntegerArrayUtils;

/**
 * @author leon on 28/11/2018.
 */
public class ReplaceTest {
    @Test
    public void testInsert1() {
        // Given
        Integer indexToInsertAt = 2;
        Integer valueToBeInserted = 17;
        Integer[] input = {1,2,5,8};
        Integer[] expected = {1,2,valueToBeInserted, 8};

        // when
        Integer[] actual = IntegerArrayUtils.replace(input, indexToInsertAt, valueToBeInserted);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsert2() {
        // Given
        Integer valueToBeInserted = 76;
        Integer indexToInsertAt = 1;
        Integer[] input = {1,2,5,8};
        Integer[] expected = {1,valueToBeInserted,5,8};

        // when
        Integer[] actual = IntegerArrayUtils.replace(input, indexToInsertAt, valueToBeInserted);

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}
