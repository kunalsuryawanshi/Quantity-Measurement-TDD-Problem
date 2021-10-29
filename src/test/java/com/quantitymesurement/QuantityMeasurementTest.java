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
    @Test
    public void givenFeet_WhenDoubleType_ShouldReturnTrue() {
        boolean res = quantityMeasurement.compareDataType(1.0, 10.0);
        Assertions.assertTrue(res);
    }
    /*
     * 4: Value Check for equality
     * Given Feet When Not Equal Should Return False
     */
    @Test
    public void givenFeet_WhenNotEqual_ShouldReturnFalse() {
        double feet1 =quantityMeasurement.compareLengths(1.0);
        double feet2 =quantityMeasurement.compareLengths(9.0);
        Assertions.assertNotEquals(feet1,feet2);
    }
    /* Given Feet When Equal Should Return True */
    @Test
    public void givenFeet_WhenEqual_ShouldReturnTrue() {
        double feet1 =quantityMeasurement.compareLengths(9.0);
        double feet2 =quantityMeasurement.compareLengths(9.0);
        Assertions.assertEquals(feet1,feet2);
    }
    /*
     * TC 1.7-1.12 : Performing similar test for Inch
     * 1: Null Check
     */
    @Test
    public void givenInch_WhenNotNull_ShouldReturnFalse() {
        boolean res = quantityMeasurement.nullCheck(36.0,36.0);
        Assertions.assertFalse(res);
    }
    /* Given Inch When Null Should Return True */
    @Test
    public void givenInch_WhenNull_ShouldReturnTrue() {
        boolean res = quantityMeasurement.nullCheck(null,null);
        Assertions.assertTrue(res);
    }
    /* Given Single Inch Value When Null Should Return True */
    @Test
    public void givenSingleInch_WhenNull_ShouldReturnTrue() {
        boolean res = quantityMeasurement.nullCheck(null,12.0);
        Assertions.assertTrue(res);
    }
    /*
     * 3: Inch Type Check
     * Given Inch When Different Data Type Should Return False
     */
    @Test
    public void givenInch_WhenIntegerType_ShouldReturnFalse() {
        boolean res = quantityMeasurement.compareDataType(1, 1.0);
        Assertions.assertFalse(res);
    }
    @Test
    public void givenInch_WhenStringType_ShouldReturnFalse() {
        boolean res = quantityMeasurement.compareDataType("1", 1.0);
        Assertions.assertFalse(res);
    }
    /* Given Inch When Double Data Type Should Return True */
    @Test
    public void givenInch_WhenDouble_ShouldReturnTrue() {
        boolean res = quantityMeasurement.compareDataType(12.0, 1.0);
        Assertions.assertTrue(res);
    }
    /*
     * 4: Value Check for equality
     * Given Inch When Not Equal Should Return False
     */
    @Test
    public void givenInch_WhenNotEqual_ShouldReturnFalse() {
        double inch1 =quantityMeasurement.compareLengths(1.0);
        double inch2 =quantityMeasurement.compareLengths(9.0);
        Assertions.assertNotEquals(inch1,inch2);
    }
    /* Given Inch When Equal Should Return True */
    @Test
    public void givenInch_WhenEqual_ShouldReturnTrue() {
        double inch1 =quantityMeasurement.compareLengths(9.0);
        double inch2 =quantityMeasurement.compareLengths(9.0);
        Assertions.assertEquals(inch1,inch2);
    }
    /*
     * UC2: Compare lengths 3ft = 1yd
     * 1: 3ft = 1yd
     */
    @Test
    public void givenFeet_ShouldReturnInYard() {
        double yard = quantityMeasurement.feetToYard(3.0);
        Assertions.assertEquals(1,yard);
    }
    /* 2: 1ft != 1yd */
    @Test
    public void givenOneFeet_EqualsOneYards_ShouldReturnFalse() {
        double yard = quantityMeasurement.feetToYard(1.0);
        Assertions.assertNotEquals(1,yard);
    }
    /* 3: 1in != 1yd */
    @Test
    public void givenOneInch_NotEqualToOneYard() {
        double yard = quantityMeasurement.inchToYard(1.0);
        Assertions.assertNotEquals(1,yard);
    }
    /* 4: 1yd = 36in */
    @Test
    public void givenOneYard_EqualToThirtySixInch_ShouldReturnTrue() {
        double inch = quantityMeasurement.yardToInch(1.0);
        Assertions.assertEquals(36,inch);
    }
    /* 5: 36 in = 1 yd */
    @Test
    public void givenThirtySixInch_EqualToOneYard() {
        double yard = quantityMeasurement.inchToYard(36.0);
        Assertions.assertEquals(1,yard);
    }
    /* 6: 1yd = 3ft */
    @Test
    public void givenOneYard_EqualToThreeFeet() {
        double feet = quantityMeasurement.yardToFeet(1.0);
        Assertions.assertEquals(3,feet);
    }
}