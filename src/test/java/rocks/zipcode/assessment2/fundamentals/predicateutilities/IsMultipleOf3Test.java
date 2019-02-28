package rocks.zipcode.assessment2.fundamentals.predicateutilities;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.fundamentals.PredicateUtilities;

public class IsMultipleOf3Test {
    @Test
    public void test1() {
        test(8, false);
    }

    @Test
    public void test2() {
        test(9, true);
    }

    @Test
    public void test3() {
        test(17, false);
    }

    @Test
    public void test4() {
        test(18, true);
    }

    @Test
    public void test5() {
        test(39, true);
    }


    private void test(Integer value, Boolean expectedOutcome) {
        // when
        Boolean actualOutcome = PredicateUtilities.isMultipleOf3(value);

        // then
        Assert.assertEquals(actualOutcome, expectedOutcome);
    }
}
