package rocks.zipcode.quizweek7.collections.router;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quizweek7.collections.Router;

import java.util.Map;

public class RouterPolymorphismTest {
    @Test
    public void test() {
        Router router = new Router();
        Assert.assertFalse(router instanceof Map);
    }
}
