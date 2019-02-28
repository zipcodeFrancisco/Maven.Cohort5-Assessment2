package rocks.zipcode.assessment2.collections.monthconversion;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.collections.MonthConversion;

public class MonthConversionValidTest {

    @Test
    public void testIsValidNumber_whenExist(){
        //Given
        MonthConversion conversion = new MonthConversion();
        String expectedMonth = "faewdsv";
        Integer number = 3;
        conversion.add(number, expectedMonth);

        //When
        Boolean actual = conversion.isValidNumber(number);

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testIsValidNumber_whenNotExist(){
        //Given
        MonthConversion conversion = new MonthConversion();
        String expectedMonth = "fdsabreab";
        Integer number = 3;
        conversion.add(number, expectedMonth);

        //When
        Boolean actual = conversion.isValidNumber(10);

        //Then
        Assert.assertFalse(actual);
    }


    @Test
    public void testIsValidMonth_whenExist(){
        //Given
        MonthConversion conversion = new MonthConversion();
        String month = "May";
        Integer expectedNumber = 5;
        conversion.add(4, "kjhfkytjd");
        conversion.add(expectedNumber, month);
        conversion.add(6, "45yrhjtum");

        //When
        Boolean actual = conversion.isValidMonth(month);

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testIsValidMonth_whenNotExist(){
        //Given
        MonthConversion conversion = new MonthConversion();
        conversion.add(4, "mv7yymhg");

        //When
        Boolean actual = conversion.isValidMonth("aa");

        //Then
        Assert.assertFalse(actual);
    }
}
