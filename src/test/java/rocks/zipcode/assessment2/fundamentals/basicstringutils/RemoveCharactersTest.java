package rocks.zipcode.assessment2.fundamentals.basicstringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.fundamentals.BasicStringUtils;

public class RemoveCharactersTest {
    @Test
    public void test1() {
        test("ababababa", "a", "bbbb");
    }

    @Test
    public void test2() {
        test("umbrella", "l", "umbrea");
    }

    @Test
    public void test3() {
        test("basketball", "la", "bsketb");
    }

    @Test
    public void test4() {
        test("Doliod", "Do", "lid");
    }

    private void test(String string, String charactersToRemove, String expectedString) {
        // when
        String actualString = BasicStringUtils.removeCharacters(string, charactersToRemove);


        // then
        Assert.assertEquals(expectedString, actualString);
    }
}
