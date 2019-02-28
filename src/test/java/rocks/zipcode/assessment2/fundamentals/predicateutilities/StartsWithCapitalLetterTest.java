package rocks.zipcode.assessment2.fundamentals.predicateutilities;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.fundamentals.PredicateUtilities;

public class StartsWithCapitalLetterTest {
    @Test
    public void test1() {
        test("TEJisafo", true);
    }

    @Test
    public void test2() {
        test("nvghuisug", false);
    }

    @Test
    public void test3() {
        test("y1823i912", false);
    }

    @Test
    public void test4() {
        test("8615", false);
    }

    @Test
    public void test5() {
        test("Y", true);
    }


    private void test(String value, Boolean expectedOutcome) {
        // when
        Boolean actualOutcome = PredicateUtilities.startsWithCapitalLetter(value);

        // then
        Assert.assertEquals(actualOutcome, expectedOutcome);
    }
}
