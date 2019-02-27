package rocks.zipcode.assessment2.collections.router;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.collections.Router;


public class RouterToStringTest {
    @Test
    public void test1() {
        // given
        String path = "/user";
        String controller = "UserController";
        String expected = path + " -> " + controller + "\n";
        test(path, controller, expected);
    }

    @Test
    public void test2() {
        // given
        String path = "/student";
        String controller = "StudentController";
        String expected = path + " -> " + controller + "\n";
        test(path, controller, expected);
    }


    @Test
    public void test3() {
        // given
        String path = "/employee";
        String controller = "EmployeeController";
        String expected = path + " -> " + controller + "\n";
        test(path, controller, expected);
    }


    private void test(String path, String controller, String expected) {
        // given
        Router router = new Router();
        router.add(path, controller);

        // when
        String actual = router.toString();

        // then
        Assert.assertEquals(expected, actual);
    }
}
