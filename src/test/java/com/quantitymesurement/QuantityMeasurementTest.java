package com.quantitymesurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    // Given Two feet when not Equal Should return False
    @Test
    public void givenTwoFeet_WhenNotEqual_ShouldReturnFalse() {
        boolean res = quantityMeasurement.compareLengths(0.0,16.0);
        Assertions.assertFalse(res);
    }

    // Given Two feet when Equal Should return True
    @Test
    public void givenTwoFeet_WhenNotEqual_ShouldReturnTrue() {
        boolean res = quantityMeasurement.compareLengths(0.0,0.0);
        Assertions.assertTrue(res);
    }
    /*
     * 1: Null Check
     * Given feet When null should return True
     */
    @Test
    public void givenFeet_WhenNull_ShouldReturnTrue() {
        boolean res = quantityMeasurement.nullCheck(null,null);
        Assertions.assertTrue(res);
    }
    @Test
    public void givenOneFeet_WhenNull_ShouldReturnTrue() {
        boolean res = quantityMeasurement.nullCheck(null,2.0);
        Assertions.assertTrue(res);
    }
    @Test
    public void givenFeet_WhenNotNull_ShouldReturnFalse() {
        boolean res = quantityMeasurement.nullCheck(5.0,5.0);
        Assertions.assertFalse(res);
    }
    /*
     * 3: Type Check
     * Given Feet When Different Data Type Should Return False
     */
    @Test
    public void givenFeet_WhenIntegerType_ShouldReturnFalse() {
        boolean res = quantityMeasurement.compareDataType(1, 1.0);
        Assertions.assertFalse(res);
    }
    @Test
    public void givenFeet_WhenStringType_ShouldReturnFalse() {
        boolean res = quantityMeasurement.compareDataType("9", 1.0);
        Assertions.assertFalse(res);
    }
}