package com.quantitymesurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementTest {
    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void givenFeetNull_ShouldReturnFalse() {
        Length feet = new Length(Length.Unit.FEET, null);
        boolean res = feet.equals(null);
        Assertions.assertFalse(res);
    }

    @Test
    public void givenFeet_WhenStringType_ShouldReturnFalse() {
        Length feet = new Length(Length.Unit.FEET, 0.0);
        boolean res = feet.equals("abc");
        Assertions.assertFalse(res);
    }

    @Test
    public void givenFeet_WhenIntegerType_ShouldReturnFalse() {
        Length feet = new Length(Length.Unit.FEET, 0.0);
        boolean res = feet.equals(1);
        Assertions.assertFalse(res);
    }

    @Test
    public void givenDifferentValueFeet1AndFeet2_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 8.0);
        Length feet2 = new Length(Length.Unit.FEET, 11.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenSameValueFeet1AndFeet2_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 8.0);
        Length feet2 = new Length(Length.Unit.FEET, 8.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void givenInchNull_ShouldReturnFalse() {
        Length inch = new Length(Length.Unit.INCH, 0.0);
        boolean res = inch.equals(null);
        Assertions.assertFalse(res);
    }

    @Test
    public void givenInch_WhenStringType_ShouldReturnFalse() {
        Length inch = new Length(Length.Unit.INCH, 0.0);
        boolean res = inch.equals("abc");
        Assertions.assertFalse(res);
    }

    @Test
    public void givenInch_WhenIntegerType_ShouldReturnFalse() {
        Length inch = new Length(Length.Unit.INCH, 0.0);
        boolean res = inch.equals(11);
        Assertions.assertFalse(res);
    }

    @Test
    public void givenInch1AndInch2_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 10.0);
        Length inch2 = new Length(Length.Unit.INCH, 10.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void givenInch1AndInch2_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 2.0);
        Length inch2 = new Length(Length.Unit.INCH, 10.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnNotEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Feet_ShouldReturnNotEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = inch1.compare(feet1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given1FeetAnd12Inch_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 12.0);
        boolean compareCheck = feet1.compare(inch1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_ShouldReturnEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH, 12.0);
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = inch1.compare(feet1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 3.0);
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = feet1.compare(yard1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_WhenCompared_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = feet1.compare(yard1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_WhenCompared_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = inch1.compare(yard1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompared_ShouldReturnEqual() {
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 36.0);
        boolean compareCheck = yard1.compare(inch1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given36InchAnd1Yard_WhenCompared_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 36.0);
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = inch1.compare(yard1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_WhenCompared_ShouldReturnEqual() {
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length feet = new Length(Length.Unit.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd5Cm_WhenCompared_ShouldReturnEqual() {
        Length inch = new Length(Length.Unit.INCH, 2.0);
        Length cm = new Length(Length.Unit.CENTIMETER, 5.0);
        boolean compareCheck = inch.compare(cm);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given2InchPlus2Inch_WhenAdd_ShouldReturn4Inch() {
        Length inch1 = new Length(Length.Unit.INCH, 2.0);
        Length inch2 = new Length(Length.Unit.INCH, 2.0);
        double add = inch1.addTwoLengths(inch2);
        Assertions.assertEquals(4.0, add);
    }
}