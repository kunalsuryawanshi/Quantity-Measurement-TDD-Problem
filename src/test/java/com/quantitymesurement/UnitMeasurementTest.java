package com.quantitymesurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitMeasurementTest {
    Convertor convertor = new Convertor();

    @Test
    public void givenFeet_ShouldConvertIntoYard() {
        double yard = convertor.feetIntoYard(6.0);
        Assertions.assertEquals(2.0, yard);
    }

    @Test
    public void given1Feet_ShouldNotEqualTo1Yard() {
        double yard = convertor.feetIntoYard(1.0);
        Assertions.assertNotEquals(1.0, yard);
    }

    @Test
    public void given1Inch_ShouldNotEqualToOneYard() {
        double yard = convertor.inchToYard(1.0);
        Assertions.assertNotEquals(1.0, yard);
    }

    @Test
    public void given1Yard_ShouldEqualTo36Inch() {
        double inch = convertor.inchToYard(1.0);
        Assertions.assertEquals(36.0, inch);
    }

    @Test
    public void given36Inch_ShouldEqualTo1Yard() {
        double yard = convertor.yardToInch(36.0);
        Assertions.assertEquals(1.0, yard);
    }

    @Test
    public void given1Yard_ShouldConvertInto3Feet() {
        double feet = convertor.yardIntoFeet(1.0);
        Assertions.assertEquals(3.0, feet);
    }

    @Test
    public void given2Inch_ShouldConvertInto5Centimeter() {
        double centimeter = convertor.inchToCentimeter(2.0);
        Assertions.assertEquals(5.0, centimeter);
    }
}
