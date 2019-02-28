package rocks.zipcode.assessment2.fundamentals.basicstringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.fundamentals.BasicStringUtils;

public class ReverseThenConcatenateTest {
    @Test
    public void test1() {
        test("Ffau8e", "hTSED", "e8uafFDESTh");
    }

    @Test
    public void test2() {
        test("I^Yfjg", "ioeg89", "gjfY^I98geoi");
    }

    @Test
    public void test3() {
        test("@T#f", "4698=", "f#T@=8964");
    }


    private void test(String string1, String string2, String expectedString) {
        // when
        String actualString = BasicStringUtils.reverseThenConcatenate(string1, string2);

        // then
        Assert.assertEquals(expectedString, actualString);
    }
}
