package rocks.zipcode.assessment2.objectorientation.address;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.objectorientation.Address;

/**
 * @author leon on 29/11/2018.
 */
public class AddressEqualsTest {
    @Test
    public void checkDefaultAddressEquivalence() {
        // given
        Address address1 = new Address();
        Address address2 = new Address();

        // when
        Boolean outcome = address1.equals(address2);

        // then
        Assert.assertTrue(outcome);
    }

    @Test
    public void checkNonDefaultAddressEquivalence() {
        // given
        String providedLine1 = "Y42WETREAT";
        String providedLine2 = "EFAGRESGR";
        String providedCity = "O65YRTS";
        String providedState = "gdsfrgdrts";
        String providedZipcode = "489486";
        Address address1 = new Address(providedLine1, providedLine2, providedCity, providedState, providedZipcode);
        Address address2 = new Address(providedLine1, providedLine2, providedCity, providedState, providedZipcode);

        // when
        Boolean outcome = address1.equals(address2);

        // then
        Assert.assertTrue(outcome);
    }

    @Test
    public void checkNonDefaultAddressNonEquivalence() {
        // given
        String providedLine1 = "g54ewgasbreg";
        String providedLine2 = "dgsaefwaf";
        String providedCity = "fdsah5eragr";
        String providedState = "y43grvar";
        String providedZipcode = "5894861";
        Address address1 = new Address(providedLine1, providedLine2, providedCity, providedState, providedZipcode);
        Address address2 = new Address(providedLine1, providedLine2, providedCity, providedState, "Different Zip");

        // when
        Boolean outcome = address1.equals(address2);

        // then
        Assert.assertFalse(outcome);
    }
}
