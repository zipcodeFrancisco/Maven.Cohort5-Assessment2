package rocks.zipcode.assessment2.arrays.stringarrayutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.arrays.StringArrayUtils;

/**
 * @author leon on 28/11/2018.
 */
public class GetSubArrayTest {
    @Test
    public void testGetSubArrayFrom0To2() {
        // given
        String[] input = {"She", "sells", "sea", "shells", "by", "the", "sea", "shore"};
        String[] expected = {"sells", "sea"};
        int startIndex = 1;
        int endIndex = 3;

        // when
        String[] actual = StringArrayUtils.getSubArray(input, startIndex, endIndex);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetSubArrayFrom1To3() {
        // given
        String[] input = {"She", "sells", "sea", "shells", "by", "the", "sea", "shore"};
        String[] expected = {"shells", "by", "the"};
        int startIndex = 3;
        int endIndex = 6;

        // when
        String[] actual = StringArrayUtils.getSubArray(input, startIndex, endIndex);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetSubArrayOutOfBounds1() {
        // given
        String[] input = {"She", "sells", "sea", "shells", "by", "the", "sea", "shore"};
        int startIndex = 74;
        int endIndex = 76;

        // when
        StringArrayUtils.getSubArray(input, startIndex, endIndex);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSubArrayOutOfBounds2() {
        // given
        String[] input = {"She", "sells", "sea", "shells", "by", "the", "sea", "shore"};
        int startIndex = -150;
        int endIndex = -273;

        // when
        StringArrayUtils.getSubArray(input, startIndex, endIndex);
    }
}
