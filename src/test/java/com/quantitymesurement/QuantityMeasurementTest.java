package com.quantitymesurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementTest {
    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void givenFeetNull_ShouldReturnFalse() {
        Feet feet = new Feet(null);
        boolean res = feet.equals(null);
        Assertions.assertFalse(res);
    }

    @Test
    public void givenFeet_WhenStringType_ShouldReturnFalse() {
        Feet feet = new Feet(0.0);
        boolean res = feet.equals("abc");
        Assertions.assertFalse(res);
    }

    @Test
    public void givenFeet_WhenIntegerType_ShouldReturnFalse() {
        Feet feet = new Feet(0.0);
        boolean res = feet.equals(1);
        Assertions.assertFalse(res);
    }

    @Test
    public void givenDifferentValueFeet1AndFeet2_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(8.0);
        Feet feet2 = new Feet(11.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenSameValueFeet1AndFeet2_ShouldReturnEqual() {
        Feet feet1 = new Feet(8.0);
        Feet feet2 = new Feet(8.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void givenInchNull_ShouldReturnFalse() {
        Inch inch = new Inch(0.0);
        boolean res = inch.equals(null);
        Assertions.assertFalse(res);
    }

    @Test
    public void givenInch_WhenStringType_ShouldReturnFalse() {
        Inch inch = new Inch(0.0);
        boolean res = inch.equals("abc");
        Assertions.assertFalse(res);
    }

    @Test
    public void givenInch_WhenIntegerType_ShouldReturnFalse() {
        Inch inch = new Inch(0.0);
        boolean res = inch.equals(11);
        Assertions.assertFalse(res);
    }
}