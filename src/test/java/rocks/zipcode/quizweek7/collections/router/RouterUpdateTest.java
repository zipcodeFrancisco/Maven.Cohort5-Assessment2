package rocks.zipcode.quizweek7.collections.router;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quizweek7.collections.Router;

public class RouterUpdateTest {
    @Test
    public void test1() {
        // given
        String path = "/user";
        String controller = "UserController";
        test(path, controller);
    }

    @Test
    public void test2() {
        // given
        String path = "/student";
        String controller = "StudentController";
        test(path, controller);
    }


    @Test
    public void test3() {
        // given
        String path = "/employee";
        String controller = "EmployeeController";
        test(path, controller);
    }

    private void test(String path, String controller) {
        // given
        Router router = new Router();
        String expected = controller + "Updated";

        // when
        router.add(path, controller);
        router.update(path, expected);

        // then
        Assert.assertTrue(router.containsPath(path));
        Assert.assertFalse(router.containsController(controller));
        Assert.assertTrue(router.containsController(expected));
    }
}
