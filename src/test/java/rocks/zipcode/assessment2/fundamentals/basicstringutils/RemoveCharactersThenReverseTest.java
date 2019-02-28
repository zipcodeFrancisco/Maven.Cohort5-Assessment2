package rocks.zipcode.assessment2.fundamentals.basicstringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.fundamentals.BasicStringUtils;

public class RemoveCharactersThenReverseTest {
    @Test
    public void test1() {
        test("fhuwialfd", "er", "dflaiwuhf");
    }

    @Test
    public void test2() {
        test("bvycuewsa", "ers", "awucyvb");
    }

    @Test
    public void test3() {
        test("TEajnkda", "res", "adknjaET");
    }

    @Test
    public void test4() {
        test("hfaeuwcdke", "kaer", "dcwufh");
    }

    private void test(String stringToManipulate, String charactersToRemove, String expected) {
        // when
        String actual = BasicStringUtils.removeCharactersThenReverse(stringToManipulate, charactersToRemove);

        // then
        Assert.assertEquals(expected, actual);
    }
}
