package com.quantitymesurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    // Given Two feet when not Equal Should return False
    @Test
    public void givenTwoFeet_WhenNotEqual_ShouldReturnFalse() {
        boolean res = quantityMeasurement.compareLengths(1.1,0.0);
        Assertions.assertFalse(res);
    }

    // Given Two feet when Equal Should return True
    @Test
    public void givenTwoFeet_WhenNotEqual_ShouldReturnTrue() {
        boolean res = quantityMeasurement.compareLengths(0.0,0.0);
        Assertions.assertTrue(res);
    }
    // Given feet When null should return True
    @Test
    public void givenFeet_WhenNull_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean res = quantityMeasurement.nullCheck(null,null);
        Assertions.assertTrue(res);
    }
}