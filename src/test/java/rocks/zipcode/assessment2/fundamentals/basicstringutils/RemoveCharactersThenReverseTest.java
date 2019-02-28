package rocks.zipcode.assessment2.fundamentals.basicstringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.fundamentals.BasicStringUtils;

public class RemoveCharactersThenReverseTest {
    @Test
    public void test1() {
        test("Feelers", "er", "Fls");
    }

    @Test
    public void test2() {
        test("Takers", "ers", "Tak");
    }

    @Test
    public void test3() {
        test("Takers", "res", "Tak");
    }

    @Test
    public void test4() {
        test("breaking", "kaer", "bing");
    }

    private void test(String stringToManipulate, String charactersToRemove, String expected) {
        // when
        String actual = BasicStringUtils.removeCharactersThenReverse(stringToManipulate, charactersToRemove);

        // then
        Assert.assertEquals(expected, actual);
    }
}
