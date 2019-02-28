package rocks.zipcode.assessment2.fundamentals.basicstringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.fundamentals.BasicStringUtils;

public class ReverseTest {
    @Test
    public void test1() {
        test("afw4dsf", "fsd4wfa");
    }

    @Test
    public void test2() {
        test("avreaf", "faerva");
    }

    @Test
    public void test3() {
        test("ea4hrdfs", "sfdrh4ae");
    }

    @Test
    public void test4() {
        test("FAWOEJ39242", "24293JEOWAF");
    }

    private void test(String string, String expectedString) {
        // when
        String actualString = BasicStringUtils.reverse(string);

        // then
        Assert.assertEquals(expectedString, actualString);
    }
}
