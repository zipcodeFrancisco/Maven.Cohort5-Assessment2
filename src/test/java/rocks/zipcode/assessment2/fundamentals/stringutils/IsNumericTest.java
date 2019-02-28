package rocks.zipcode.assessment2.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.fundamentals.StringUtils;

/**
 * @author leon on 28/11/2018.
 */
public class IsNumericTest {
    @Test
    public void alphaStringTest1() {
        // Given
        String alphaString = "Ahugieahgejkanf";

        // When
        boolean outcome = StringUtils.isNumericString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }

    @Test
    public void alphaStringTest2() {
        // Given
        String alphaString = "HJWGIgijoeajgo";

        // When
        boolean outcome = StringUtils.isNumericString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }


    @Test
    public void numericStringTest1() {
        // Given
        String alphaString = "18653";

        // When
        boolean outcome = StringUtils.isNumericString(alphaString);

        // Then
        Assert.assertTrue(outcome);
    }


    @Test
    public void numericStringTest2() {
        // Given
        String alphaString = "486416d";

        // When
        boolean outcome = StringUtils.isNumericString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }


    @Test
    public void specialCharacterStringTest1() {
        // Given
        String alphaString = "!@$*21";

        // When
        boolean outcome = StringUtils.isNumericString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }


    @Test
    public void specialCharacterStringTest2() {
        // Given
        String alphaString = "*!@#&";

        // When
        boolean outcome = StringUtils.isNumericString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }
}
