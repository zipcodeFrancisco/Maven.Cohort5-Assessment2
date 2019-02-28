package rocks.zipcode.assessment2.fundamentals.predicateutilities;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.fundamentals.PredicateUtilities;

public class IsOddTest {
    @Test
    public void test1() {
        test(10, false);
    }

    @Test
    public void test2() {
        test(11, true);
    }

    @Test
    public void test3() {
        test(22, false);
    }

    @Test
    public void test4() {
        test(53, true);
    }


    private void test(Integer value, Boolean expectedOutcome) {
        // when
        Boolean actualOutcome = PredicateUtilities.isOdd(value);

        // then
        Assert.assertEquals(actualOutcome, expectedOutcome);
    }
}
