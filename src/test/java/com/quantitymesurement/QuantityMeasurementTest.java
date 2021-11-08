package com.quantitymesurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementTest {
    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(MeasurementUnits.FEET, 0.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(MeasurementUnits.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void givenFeetNull_ShouldReturnFalse() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(MeasurementUnits.FEET, null);
        boolean res = feet.equals(null);
        Assertions.assertFalse(res);
    }

    @Test
    public void givenFeet_WhenStringType_ShouldReturnFalse() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(MeasurementUnits.FEET, 0.0);
        boolean res = feet.equals("abc");
        Assertions.assertFalse(res);
    }

    @Test
    public void givenFeet_WhenIntegerType_ShouldReturnFalse() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(MeasurementUnits.FEET, 0.0);
        boolean res = feet.equals(1);
        Assertions.assertFalse(res);
    }

    @Test
    public void givenDifferentValueFeet1AndFeet2_ShouldReturnNotEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(MeasurementUnits.FEET, 8.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(MeasurementUnits.FEET, 11.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenSameValueFeet1AndFeet2_ShouldReturnEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(MeasurementUnits.FEET, 8.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(MeasurementUnits.FEET, 8.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void givenInchNull_ShouldReturnFalse() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(MeasurementUnits.INCH, 0.0);
        boolean res = inch.equals(null);
        Assertions.assertFalse(res);
    }

    @Test
    public void givenInch_WhenStringType_ShouldReturnFalse() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(MeasurementUnits.INCH, 0.0);
        boolean res = inch.equals("abc");
        Assertions.assertFalse(res);
    }

    @Test
    public void givenInch_WhenIntegerType_ShouldReturnFalse() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(MeasurementUnits.INCH, 0.0);
        boolean res = inch.equals(11);
        Assertions.assertFalse(res);
    }

    @Test
    public void givenInch1AndInch2_ShouldReturnEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(MeasurementUnits.INCH, 10.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(MeasurementUnits.INCH, 10.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void givenInch1AndInch2_ShouldReturnNotEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(MeasurementUnits.INCH, 2.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(MeasurementUnits.INCH, 10.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnNotEqualLength() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(MeasurementUnits.FEET, 0.0);
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(MeasurementUnits.INCH, 0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqualLength() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(MeasurementUnits.FEET, 1.0);
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(MeasurementUnits.INCH, 1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Feet_ShouldReturnNotEqualLength() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(MeasurementUnits.INCH, 1.0);
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(MeasurementUnits.FEET, 1.0);
        boolean compareCheck = inch1.compare(feet1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(MeasurementUnits.FEET, 1.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(MeasurementUnits.FEET, 1.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given1FeetAnd12Inch_ShouldReturnEqualLength() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(MeasurementUnits.FEET, 1.0);
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(MeasurementUnits.INCH, 12.0);
        boolean compareCheck = feet1.compare(inch1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_ShouldReturnEqualLength() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(MeasurementUnits.INCH, 12.0);
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(MeasurementUnits.FEET, 1.0);
        boolean compareCheck = inch1.compare(feet1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqualLength() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(MeasurementUnits.FEET, 3.0);
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(MeasurementUnits.YARD, 1.0);
        boolean compareCheck = feet1.compare(yard1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_WhenCompared_ShouldReturnNotEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(MeasurementUnits.FEET, 1.0);
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(MeasurementUnits.YARD, 1.0);
        boolean compareCheck = feet1.compare(yard1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_WhenCompared_ShouldReturnNotEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(MeasurementUnits.INCH, 1.0);
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(MeasurementUnits.YARD, 1.0);
        boolean compareCheck = inch1.compare(yard1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(MeasurementUnits.YARD, 1.0);
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(MeasurementUnits.INCH, 36.0);
        boolean compareCheck = yard1.compare(inch1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given36InchAnd1Yard_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(MeasurementUnits.INCH, 36.0);
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(MeasurementUnits.YARD, 1.0);
        boolean compareCheck = inch1.compare(yard1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem yard = new UnitMeasurementSystem(MeasurementUnits.YARD, 1.0);
        UnitMeasurementSystem feet = new UnitMeasurementSystem(MeasurementUnits.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd5Cm_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(MeasurementUnits.INCH, 2.0);
        UnitMeasurementSystem cm = new UnitMeasurementSystem(MeasurementUnits.CENTIMETER, 5.0);
        boolean compareCheck = inch.compare(cm);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given2InchPlus2Inch_WhenAdd_ShouldReturn4Inch() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(MeasurementUnits.INCH, 2.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(MeasurementUnits.INCH, 2.0);
        double add = inch1.addTwoLengths(inch2);
        Assertions.assertEquals(4.0, add);
    }

    @Test
    public void given2InchPlus2Inch_WhenExpectedValueWrong_ShouldReturnNotEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(MeasurementUnits.INCH, 2.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(MeasurementUnits.INCH, 2.0);
        double add = inch1.addTwoLengths(inch2);
        Assertions.assertNotEquals(2.0, add);
    }

    @Test
    public void given1FeetAnd2Inch_WhenAdd_ShouldReturn14Inch() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(MeasurementUnits.FEET, 1.0);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(MeasurementUnits.INCH, 2.0);
        double add = feet.addTwoLengths(inch);
        Assertions.assertEquals(14.0, add);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdd_ShouldReturn24Inch() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(MeasurementUnits.FEET, 1.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(MeasurementUnits.FEET, 1.0);
        double add = feet1.addTwoLengths(feet2);
        Assertions.assertEquals(24.0, add);
    }

    @Test
    public void given2InchAnd2$5Centimeter_WhenAdd_ShouldReturn3Inch() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(MeasurementUnits.INCH, 2.0);
        UnitMeasurementSystem centimeter = new UnitMeasurementSystem(MeasurementUnits.CENTIMETER, 2.5);
        double add = inch.addTwoLengths(centimeter);
        Assertions.assertEquals(3.0, add);
    }

    //UC5
    @Test
    public void givenGallon_WhenNull_ShouldReturnFalse() {
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(MeasurementUnits.GALLON, null);
        boolean nullCheck = gallon.equals(null);
        Assertions.assertFalse(nullCheck);
    }

    @Test
    public void givenLitre_WhenNull_ShouldReturnFalse() {
        UnitMeasurementSystem litre = new UnitMeasurementSystem(MeasurementUnits.LITRE, null);
        boolean nullCheck = litre.equals(null);
        Assertions.assertFalse(nullCheck);
    }

    @Test
    public void givenOneLitreAndOneLitre_ShouldReturnEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(MeasurementUnits.LITRE, 1.0);
        UnitMeasurementSystem litre2 = new UnitMeasurementSystem(MeasurementUnits.LITRE, 1.0);
        Assertions.assertEquals(litre1, litre2);
    }

    @Test
    public void givenOneGallonAndOneGallon_ShouldReturnEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(MeasurementUnits.GALLON, 1.0);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(MeasurementUnits.GALLON, 1.0);
        Assertions.assertEquals(gallon1, gallon2);
    }

    @Test
    public void givenLitre_WhenDifferent_ShouldReturnNotEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(MeasurementUnits.LITRE, 1.0);
        UnitMeasurementSystem litre2 = new UnitMeasurementSystem(MeasurementUnits.LITRE, 2.0);
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    public void givenGallon_WhenDifferent_ShouldReturnNotEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(MeasurementUnits.GALLON, 1.0);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(MeasurementUnits.GALLON, 2.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void givenGallonAndGallon_WhenTypeSame_ShouldReturnEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(MeasurementUnits.GALLON, 1.0);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(MeasurementUnits.GALLON, 1.0);
        Assertions.assertEquals(gallon1.getClass(), gallon2.getClass());
    }

    @Test
    public void givenLitreAndLitre_WhenTypeSame_ShouldReturnEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(MeasurementUnits.LITRE, 1.0);
        UnitMeasurementSystem litre2 = new UnitMeasurementSystem(MeasurementUnits.LITRE, 1.0);
        Assertions.assertEquals(litre1.getClass(), litre2.getClass());
    }

    @Test
    public void given1GallonAnd3$78Litres_WhenCompare_ShouldReturnEqual() {
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(MeasurementUnits.GALLON, 1.0);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(MeasurementUnits.LITRE, 3.78);
        boolean compare = gallon.compare(litre);
        Assertions.assertTrue(compare);
    }

    @Test
    public void given1LitreAnd1000ml_WhenCompare_ShouldReturnEqual() {
        UnitMeasurementSystem litre = new UnitMeasurementSystem(MeasurementUnits.LITRE, 1.0);
        UnitMeasurementSystem millilitre = new UnitMeasurementSystem(MeasurementUnits.MILLI_LITRE, 1000.0);
        boolean compare = litre.compare(millilitre);
        Assertions.assertTrue(compare);
    }

    @Test
    public void given1GallonAnd3$78Litres_WhenAdd_ShouldReturn7$57Litres() {
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(MeasurementUnits.GALLON, 1.0);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(MeasurementUnits.LITRE, 3.78);
        double add = gallon.addTwoLengths(litre);
        Assertions.assertEquals(7.56, add);
    }

    @Test
    public void given1LitreAnd1000MilliLitre_WhenAdd_ShouldReturn2Litres() {
        UnitMeasurementSystem litre = new UnitMeasurementSystem(MeasurementUnits.LITRE, 1.0);
        UnitMeasurementSystem ml = new UnitMeasurementSystem(MeasurementUnits.MILLI_LITRE, 1000.0);
        double add = litre.addTwoLengths(ml);
        Assertions.assertEquals(2.0, add);
    }

    @Test
    public void givenKg_WhenNull_ShouldReturnFalse() {
        UnitMeasurementSystem kg = new UnitMeasurementSystem(MeasurementUnits.KILOGRAM, null);
        boolean res = kg.equals(null);
        Assertions.assertFalse(res);
    }

    @Test
    public void givenGrams_WhenNull_ShouldReturnFalse() {
        UnitMeasurementSystem grams = new UnitMeasurementSystem(MeasurementUnits.GRAMS, null);
        boolean res = grams.equals(null);
        Assertions.assertFalse(res);
    }

    @Test
    public void givenTonne_WhenNull_ShouldReturnFalse() {
        UnitMeasurementSystem tonne = new UnitMeasurementSystem(MeasurementUnits.TONNE, null);
        boolean res = tonne.equals(null);
        Assertions.assertFalse(res);
    }

    @Test
    public void givenKg_WhenSameType_ShouldReturnEqual() {
        UnitMeasurementSystem kg1 = new UnitMeasurementSystem(MeasurementUnits.KILOGRAM, 1.0);
        UnitMeasurementSystem kg2 = new UnitMeasurementSystem(MeasurementUnits.KILOGRAM, 1.0);
        Assertions.assertEquals(kg1.getClass(), kg2.getClass());
    }

    @Test
    public void givenGram_WhenSameType_ShouldReturnEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(MeasurementUnits.GRAMS, 1000.0);
        UnitMeasurementSystem gram2 = new UnitMeasurementSystem(MeasurementUnits.GRAMS, 1000.0);
        Assertions.assertEquals(gram1.getClass(), gram2.getClass());
    }

    @Test
    public void givenTonne_WhenSameType_ShouldReturnEqual() {
        UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(MeasurementUnits.TONNE, 1.0);
        UnitMeasurementSystem tonne2 = new UnitMeasurementSystem(MeasurementUnits.TONNE, 1.0);
        Assertions.assertEquals(tonne1.getClass(), tonne2.getClass());
    }

    @Test
    public void given1KgAnd1Kg_WhenCompare_ShouldReturnEqual() {
        UnitMeasurementSystem kg1 = new UnitMeasurementSystem(MeasurementUnits.KILOGRAM, 1.0);
        UnitMeasurementSystem kg2 = new UnitMeasurementSystem(MeasurementUnits.KILOGRAM, 1.0);
        Assertions.assertEquals(kg1, kg2);
    }

    @Test
    public void given1000gramAnd1000gram_WhenCompare_ShouldReturnEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(MeasurementUnits.GRAMS, 1000.0);
        UnitMeasurementSystem gram2 = new UnitMeasurementSystem(MeasurementUnits.GRAMS, 1000.0);
        Assertions.assertEquals(gram1, gram2);
    }

    @Test
    public void given1TonneAnd1Tonne_WhenCompare_ShouldReturnEqual() {
        UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(MeasurementUnits.TONNE, 1.0);
        UnitMeasurementSystem tonne2 = new UnitMeasurementSystem(MeasurementUnits.TONNE, 1.0);
        Assertions.assertEquals(tonne1, tonne2);
    }

    @Test
    public void given1KgAnd1Kg_WhenCompare_ShouldReturnNotEqual() {
        UnitMeasurementSystem kg1 = new UnitMeasurementSystem(MeasurementUnits.KILOGRAM, 1.0);
        UnitMeasurementSystem kg2 = new UnitMeasurementSystem(MeasurementUnits.KILOGRAM, 2.0);
        Assertions.assertNotEquals(kg1, kg2);
    }

    @Test
    public void given1000gramAnd1000gram_WhenCompare_ShouldReturnNotEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(MeasurementUnits.GRAMS, 1000.0);
        UnitMeasurementSystem gram2 = new UnitMeasurementSystem(MeasurementUnits.GRAMS, 2000.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void given1TonneAnd1Tonne_WhenCompare_ShouldReturnNotEqual() {
        UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(MeasurementUnits.TONNE, 1.0);
        UnitMeasurementSystem tonne2 = new UnitMeasurementSystem(MeasurementUnits.TONNE, 3.0);
        Assertions.assertNotEquals(tonne1, tonne2);
    }

    @Test
    public void given1kgAnd1000Grams_WhenCompare_ShouldReturnTrue() {
        UnitMeasurementSystem kg = new UnitMeasurementSystem(MeasurementUnits.KILOGRAM, 1.0);
        UnitMeasurementSystem gram = new UnitMeasurementSystem(MeasurementUnits.GRAMS, 1000.0);
        boolean compareCheck = kg.compare(gram);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Kg_WhenCompare_ShouldReturnTrue() {
        UnitMeasurementSystem tonne = new UnitMeasurementSystem(MeasurementUnits.TONNE, 1.0);
        UnitMeasurementSystem gram = new UnitMeasurementSystem(MeasurementUnits.GRAMS, 1000.0);
        double add = tonne.addTwoLengths(gram);
        Assertions.assertEquals(1001.0, add);
    }

    //UC8
    @Test
    public void givenFahrenheitAndFahrenheit_ShouldReturnEqual() {
        Temperature fahrenheit1 = new Temperature(Temperature.Unit.FAHRENHEIT, 212.0);
        Temperature fahrenheit2 = new Temperature(Temperature.Unit.FAHRENHEIT, 212.0);
        Assertions.assertEquals(fahrenheit1, fahrenheit2);
    }

    @Test
    public void givenFahrenheitAndFahrenheit_ShouldReturnNotEqual() {
        Temperature fahrenheit1 = new Temperature(Temperature.Unit.FAHRENHEIT, 212.0);
        Temperature fahrenheit2 = new Temperature(Temperature.Unit.FAHRENHEIT, 200.0);
        Assertions.assertNotEquals(fahrenheit1, fahrenheit2);
    }

    @Test
    public void givenFahrenheit_WhenNull_ShouldReturnFalse() {
        Temperature Fahrenheit = new Temperature(Temperature.Unit.FAHRENHEIT, 212.0);
        boolean nullCheck = Fahrenheit.equals(null);
        Assertions.assertFalse(nullCheck);
    }

    @Test
    public void givenFahrenheit1AndFahrenheit2_WhenEqualType_ShouldReturnEqual() {
        Temperature fahrenheit1 = new Temperature(Temperature.Unit.FAHRENHEIT, 212.0);
        Temperature fahrenheit2 = new Temperature(Temperature.Unit.FAHRENHEIT, 212.0);
        Assertions.assertEquals(fahrenheit1.getClass(), fahrenheit2.getClass());
    }

    @Test
    public void given212Fahrenheit_WhenConvert_ShouldReturn100C() {
        Temperature fahrenheit = new Temperature(Temperature.Unit.FAHRENHEIT, 212.0);
        double celsius = fahrenheit.convertFahrenheitToCelsius();
        Assertions.assertEquals(100.0, celsius);
    }
    @Test
    public void given100Celsius_WhenConvert_ShouldReturn212F() {
        Temperature celsius = new Temperature(Temperature.Unit.CELSIUS, 100.0);
        double fahrenheit = celsius.convertCelsiusToFahrenheit();
        Assertions.assertEquals(212.0, fahrenheit);
    }

}