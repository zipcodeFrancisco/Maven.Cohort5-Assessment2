package rocks.zipcode.assessment2.arrays.integerarrayutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.arrays.IntegerArrayUtils;

/**
 * @author leon on 28/11/2018.
 */
public class IncrementEvenDecrementOddTest {
    @Test
    public void testOneEvenElement() {
        //for one even element
        Integer[] input3 = {36};
        Integer[] expectedOutput3 = {37};

        Integer[] actual3 = IntegerArrayUtils.incrementEvenDecrementOdd(input3);

        Assert.assertArrayEquals(expectedOutput3, actual3);
    }

    @Test
    public void testOneOddElement() {
        //for one odd element
        Integer[] input4 = {97};
        Integer[] expectedOutput4 = {96};

        Integer[] actual4 = IntegerArrayUtils.incrementEvenDecrementOdd(input4);

        Assert.assertArrayEquals(expectedOutput4, actual4);
    }


    @Test
    public void testOdd() {
        //for odd numbers
        Integer[] input1 = {111, 125, 9};
        Integer[] expectedOutput1 = {110, 124, 8};

        Integer[] actual1 = IntegerArrayUtils.incrementEvenDecrementOdd(input1);

        Assert.assertArrayEquals(expectedOutput1, actual1);
    }

    @Test
    public void testEven() {
        //for even numbers
        Integer[] input2 = {134, 118, 1700, 1128, 1110};
        Integer[] expectedOutput2 = {135, 119, 1701, 1129, 1111};

        Integer[] actual2 = IntegerArrayUtils.incrementEvenDecrementOdd(input2);

        Assert.assertArrayEquals(expectedOutput2, actual2);
    }

}
