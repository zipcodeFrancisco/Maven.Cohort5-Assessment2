package rocks.zipcode.assessment2.arrays.stringarrayutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.arrays.StringArrayUtils;

/**
 * @author leon on 29/11/2018.
 */
public class GetEndingArrayTest {
    @Test
    public void testGetEndingArrayFrom0() {
        // given
        String[] input = {"She", "sells", "sea", "shells", "by", "the", "sea", "shore"};
        String[] expected = {"She", "sells", "sea", "shells", "by", "the", "sea", "shore"};
        int startIndex = 0;

        // when
        String[] actual = StringArrayUtils.getEndingArray(input, startIndex);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetEndingArrayFrom1() {
        // given
        String[] input = {"She", "sells", "sea", "shells", "by", "the", "sea", "shore"};
        String[] expected = {"sells", "sea", "shells", "by", "the", "sea", "shore"};
        int startIndex = 1;

        // when
        String[] actual = StringArrayUtils.getEndingArray(input, startIndex);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEndingArrayOutOfBounds1() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {};
        int startIndex = 150;

        // when
        String[] actual = StringArrayUtils.getEndingArray(input, startIndex);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetEndingArrayOutOfBounds2() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {};
        int startIndex = -10;

        // when
        String[] actual = StringArrayUtils.getEndingArray(input, startIndex);

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}
