package rocks.zipcode.assessment2.collections.monthconversion;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.collections.MonthConversion;

public class MonthConversionAddTest {

    @Test
    public void testAdd1(){
        //Given
        MonthConversion conversion = new MonthConversion();
        Integer expected = 1;

        //When
        conversion.add(1, "hufiewa");

        //Then
        Integer actual = conversion.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddMultiples(){
        //Given
        MonthConversion conversion = new MonthConversion();
        Integer expected = 4;

        //When
        conversion.add(1, "nkjsnfs");
        conversion.add(2, "j8934g");
        conversion.add(3, "bvuireq");
        conversion.add(4, "rh23978hnfd");

        //Then
        Integer actual = conversion.size();
        Assert.assertEquals(expected, actual);
    }
}
