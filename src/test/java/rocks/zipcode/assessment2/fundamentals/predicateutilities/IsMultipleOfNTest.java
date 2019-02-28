package rocks.zipcode.assessment2.fundamentals.predicateutilities;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.fundamentals.PredicateUtilities;

public class IsMultipleOfNTest {
    @Test
    public void test1() {
        test(117, 2,false);
    }

    @Test
    public void test2() {
        test(28, 14, true);
    }

    @Test
    public void test3() {
        test(17, 25, false);
    }

    @Test
    public void test4() {
        test(18, 2, true);
    }

    @Test
    public void test5() {
        test(144, 12, true);
    }


    private void test(Integer value, Integer multiple, Boolean expectedOutcome) {
        // when
        Boolean actualOutcome = PredicateUtilities.isMultipleOfN(value, multiple);

        // then
        Assert.assertEquals(actualOutcome, expectedOutcome);
    }
}
