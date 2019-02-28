package rocks.zipcode.assessment2.arrays.integerarrayutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.arrays.IntegerArrayUtils;

import java.util.Arrays;

/**
 * @author leon on 28/11/2018.
 */
public class IncrementEvenTest {
    @Test
    public void test1() {
        // given
        Integer[] input =    {1,12,3,14,5,16,7,18};
        Integer[] expected = {1,13,3,15,5,17,7,19};


        // when
        Integer[] actual = IntegerArrayUtils.incrementEven(input);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        Integer[] input =    {110,120,130,1,3,5};
        Integer[] expected = {111,121,131,1,3,5};

        // when
        Integer[] actual = IntegerArrayUtils.incrementEven(input);

        // then
        Assert.assertArrayEquals(expected, actual);
        Assert.assertArrayEquals(IntegerArrayUtils.incrementEven(actual), actual);
    }
}
