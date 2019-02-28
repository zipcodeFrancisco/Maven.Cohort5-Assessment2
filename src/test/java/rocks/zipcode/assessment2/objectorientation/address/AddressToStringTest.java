package rocks.zipcode.assessment2.objectorientation.address;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.objectorientation.Address;

/**
 * @author leon on 29/11/2018.
 */
public class AddressToStringTest {
    @Test
    public void testNullaryConstructor() {
        // given
        String expected = "Address{addressLine1='', addressLine2='', city='', state='', zipcode=''}";
        Address address = new Address();

        // when
        String actual = address.toString();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNonNullaryConstructor() {
        // given
        String providedLine1 = "fsdafdsaf";
        String providedLine2 = "bh453waf";
        String providedCity = "br5tfaef";
        String providedState = "vf32e33qwf";
        String providedZipcode = "af2132ef";
        Address address = new Address(providedLine1, providedLine2, providedCity, providedState, providedZipcode);
        String expected = "Address{addressLine1='fsdafdsaf', addressLine2='bh453waf', city='br5tfaef', state='vf32e33qwf', zipcode='af2132ef'}";

        // when
        String actual = address.toString();

        // then
        Assert.assertEquals(expected, actual);
    }
}
