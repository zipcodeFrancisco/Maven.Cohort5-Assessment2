package rocks.zipcode.assessment2.fundamentals.basicstringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.fundamentals.BasicStringUtils;

public class ConcatenateTest {
    @Test
    public void test1() {
        test("jifaojes", "uiveh", "jifaojesuiveh");
    }

    @Test
    public void test2() {
        test("9485huriengv", "vu8erw", "9485huriengvvu8erw");
    }

    @Test
    public void test3() {
        test("6843513d8", "3728yh9f", "6843513d83728yh9f");
    }

    private void test(String string1, String string2, String expectedString) {
        // when
        String actualString = BasicStringUtils.concatentate(string1, string2);

        // then
        Assert.assertEquals(expectedString, actualString);
    }
}
