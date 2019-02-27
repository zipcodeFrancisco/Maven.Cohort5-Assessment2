package rocks.zipcode.assessment2.collections.router;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.collections.Router;

public class RouterSizeTest {
    @Test
    public void test1() {
        test(0);
    }

    @Test
    public void test2() {
        test(1);
    }

    @Test
    public void test3() {
        test(10);
    }

    @Test
    public void test4() {
        test(100);
    }

    private void test(int expected) {
        // given
        Router router = new Router();
        int originalSize = router.size();
        Assert.assertEquals(originalSize, 0);

        for (int i = 0; i < expected; i++) {
            String pseudoPath = new Object().toString();
            String pseudoController = new Object().toString();
            router.add(pseudoPath, pseudoController);
        }

        // when
        int actual = router.size();

        // then
        Assert.assertEquals(expected, actual);
    }
}
