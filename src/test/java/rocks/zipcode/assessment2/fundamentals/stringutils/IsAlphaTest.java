package rocks.zipcode.assessment2.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.fundamentals.StringUtils;

/**
 * @author leon on 28/11/2018.
 */
public class IsAlphaTest {
    @Test
    public void alphaStringTest1() {
        // Given
        String alphaString = "hiuaferbwiaufFEWAEF";

        // When
        boolean outcome = StringUtils.isAlphaString(alphaString);

        // Then
        Assert.assertTrue(outcome);
    }

    @Test
    public void alphaStringTest2() {
        // Given
        String alphaString = "HAFWEDI nkadf FAWJI          fffff   f d s s";

        // When
        boolean outcome = StringUtils.isAlphaString(alphaString);

        // Then
        Assert.assertTrue(outcome);
    }


    @Test
    public void numericStringTest1() {
        // Given
        String alphaString = "89465648";

        // When
        boolean outcome = StringUtils.isAlphaString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }


    @Test
    public void numericStringTest2() {
        // Given
        String alphaString = "561 5161 156";

        // When
        boolean outcome = StringUtils.isAlphaString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }


    @Test
    public void specialCharacterStringTest1() {
        // Given
        String alphaString = "*!(&Y$(!@";

        // When
        boolean outcome = StringUtils.isAlphaString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }


    @Test
    public void specialCharacterStringTest2() {
        // Given
        String alphaString = "&$!@@7";

        // When
        boolean outcome = StringUtils.isAlphaString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }
}
