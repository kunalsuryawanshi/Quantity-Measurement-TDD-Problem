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

    @Test
    public void given2InchPlus2Inch_WhenExpectedValueWrong_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 2.0);
        Length inch2 = new Length(Length.Unit.INCH, 2.0);
        double add = inch1.addTwoLengths(inch2);
        Assertions.assertNotEquals(2.0, add);
    }

    @Test
    public void given1FeetAnd2Inch_WhenAdd_ShouldReturn14Inch() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length inch = new Length(Length.Unit.INCH, 2.0);
        double add = feet.addTwoLengths(inch);
        Assertions.assertEquals(14.0, add);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdd_ShouldReturn24Inch() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        double add = feet1.addTwoLengths(feet2);
        Assertions.assertEquals(24.0, add);
    }

    @Test
    public void given2InchAnd2$5Centimeter_WhenAdd_ShouldReturn3Inch() {
        Length inch = new Length(Length.Unit.INCH, 2.0);
        Length centimeter = new Length(Length.Unit.CENTIMETER, 2.5);
        double add = inch.addTwoLengths(centimeter);
        Assertions.assertEquals(3.0, add);
    }

    //UC5
    @Test
    public void givenGallon_WhenNull_ShouldReturnFalse() {
        Volume gallon = new Volume(Volume.Unit.GALLON, null);
        boolean nullCheck = gallon.equals(null);
        Assertions.assertFalse(nullCheck);
    }

    @Test
    public void givenLitre_WhenNull_ShouldReturnFalse() {
        Volume litre = new Volume(Volume.Unit.LITRE, null);
        boolean nullCheck = litre.equals(null);
        Assertions.assertFalse(nullCheck);
    }

    @Test
    public void givenOneLitreAndOneLitre_ShouldReturnEqual() {
        Volume litre1 = new Volume(Volume.Unit.LITRE, 1.0);
        Volume litre2 = new Volume(Volume.Unit.LITRE, 1.0);
        Assertions.assertEquals(litre1, litre2);
    }

    @Test
    public void givenOneGallonAndOneGallon_ShouldReturnEqual() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 1.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 1.0);
        Assertions.assertEquals(gallon1, gallon2);
    }

    @Test
    public void givenLitre_WhenDifferent_ShouldReturnNotEqual() {
        Volume litre1 = new Volume(Volume.Unit.LITRE, 1.0);
        Volume litre2 = new Volume(Volume.Unit.LITRE, 2.0);
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    public void givenGallon_WhenDifferent_ShouldReturnNotEqual() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 1.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 2.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void givenGallonAndGallon_WhenTypeSame_ShouldReturnEqual() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 1.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 1.0);
        Assertions.assertEquals(gallon1.getClass(), gallon2.getClass());
    }

    @Test
    public void givenLitreAndLitre_WhenTypeSame_ShouldReturnEqual() {
        Volume litre1 = new Volume(Volume.Unit.LITRE, 1.0);
        Volume litre2 = new Volume(Volume.Unit.LITRE, 1.0);
        Assertions.assertEquals(litre1.getClass(), litre2.getClass());
    }

    @Test
    public void given1GallonAnd3$78Litres_WhenCompare_ShouldReturnEqual() {
        Volume gallon = new Volume(Volume.Unit.GALLON, 1.0);
        Volume litre = new Volume(Volume.Unit.LITRE, 3.78);
        boolean compare = gallon.compare(litre);
        Assertions.assertTrue(compare);
    }

    @Test
    public void given1LitreAnd1000ml_WhenCompare_ShouldReturnEqual() {
        Volume litre = new Volume(Volume.Unit.LITRE, 1.0);
        Volume millilitre = new Volume(Volume.Unit.MILLI_LITRE, 1000.0);
        boolean compare = litre.compare(millilitre);
        Assertions.assertTrue(compare);
    }

    @Test
    public void given1GallonAnd3$78Litres_WhenAdd_ShouldReturn7$57Litres() {
        Volume gallon = new Volume(Volume.Unit.GALLON, 1.0);
        Volume litre = new Volume(Volume.Unit.LITRE, 3.78);
        double add = gallon.addTwoVolumes(litre);
        Assertions.assertEquals(7.56, add);
    }

    @Test
    public void given1LitreAnd1000MilliLitre_WhenAdd_ShouldReturn2Litres() {
        Volume litre = new Volume(Volume.Unit.LITRE, 1.0);
        Volume ml = new Volume(Volume.Unit.MILLI_LITRE, 1000.0);
        double add = litre.addTwoVolumes(ml);
        Assertions.assertEquals(2.0, add);
    }

    @Test
    public void givenKg_WhenNull_ShouldReturnFalse() {
        Weight kg = new Weight(Weight.Unit.KILOGRAM, null);
        boolean res = kg.equals(null);
        Assertions.assertFalse(res);
    }

    @Test
    public void givenGrams_WhenNull_ShouldReturnFalse() {
        Weight grams = new Weight(Weight.Unit.GRAMS, null);
        boolean res = grams.equals(null);
        Assertions.assertFalse(res);
    }

    @Test
    public void givenTonne_WhenNull_ShouldReturnFalse() {
        Weight tonne = new Weight(Weight.Unit.TONNE, null);
        boolean res = tonne.equals(null);
        Assertions.assertFalse(res);
    }

    @Test
    public void givenKg_WhenSameType_ShouldReturnEqual() {
        Weight kg1 = new Weight(Weight.Unit.KILOGRAM, 1.0);
        Weight kg2 = new Weight(Weight.Unit.KILOGRAM, 1.0);
        Assertions.assertEquals(kg1.getClass(), kg2.getClass());
    }

    @Test
    public void givenGram_WhenSameType_ShouldReturnEqual() {
        Weight gram1 = new Weight(Weight.Unit.GRAMS, 1000.0);
        Weight gram2 = new Weight(Weight.Unit.GRAMS, 1000.0);
        Assertions.assertEquals(gram1.getClass(), gram2.getClass());
    }

    @Test
    public void givenTonne_WhenSameType_ShouldReturnEqual() {
        Weight tonne1 = new Weight(Weight.Unit.TONNE, 1.0);
        Weight tonne2 = new Weight(Weight.Unit.TONNE, 1.0);
        Assertions.assertEquals(tonne1.getClass(), tonne2.getClass());
    }

    @Test
    public void given1KgAnd1Kg_WhenCompare_ShouldReturnEqual() {
        Weight kg1 = new Weight(Weight.Unit.KILOGRAM, 1.0);
        Weight kg2 = new Weight(Weight.Unit.KILOGRAM, 1.0);
        Assertions.assertEquals(kg1, kg2);
    }

    @Test
    public void given1000gramAnd1000gram_WhenCompare_ShouldReturnEqual() {
        Weight gram1 = new Weight(Weight.Unit.GRAMS, 1000.0);
        Weight gram2 = new Weight(Weight.Unit.GRAMS, 1000.0);
        Assertions.assertEquals(gram1, gram2);
    }

    @Test
    public void given1TonneAnd1Tonne_WhenCompare_ShouldReturnEqual() {
        Weight tonne1 = new Weight(Weight.Unit.TONNE, 1.0);
        Weight tonne2 = new Weight(Weight.Unit.TONNE, 1.0);
        Assertions.assertEquals(tonne1, tonne2);
    }

    @Test
    public void given1KgAnd1Kg_WhenCompare_ShouldReturnNotEqual() {
        Weight kg1 = new Weight(Weight.Unit.KILOGRAM, 1.0);
        Weight kg2 = new Weight(Weight.Unit.KILOGRAM, 2.0);
        Assertions.assertNotEquals(kg1, kg2);
    }

    @Test
    public void given1000gramAnd1000gram_WhenCompare_ShouldReturnNotEqual() {
        Weight gram1 = new Weight(Weight.Unit.GRAMS, 1000.0);
        Weight gram2 = new Weight(Weight.Unit.GRAMS, 2000.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void given1TonneAnd1Tonne_WhenCompare_ShouldReturnNotEqual() {
        Weight tonne1 = new Weight(Weight.Unit.TONNE, 1.0);
        Weight tonne2 = new Weight(Weight.Unit.TONNE, 3.0);
        Assertions.assertNotEquals(tonne1, tonne2);
    }

    @Test
    public void given1kgAnd1000Grams_WhenCompare_ShouldReturnTrue() {
        Weight kg = new Weight(Weight.Unit.KILOGRAM, 1.0);
        Weight gram = new Weight(Weight.Unit.GRAMS, 1000.0);
        boolean compareCheck = kg.compare(gram);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Kg_WhenCompare_ShouldReturnTrue() {
        Weight tonne = new Weight(Weight.Unit.TONNE, 1.0);
        Weight gram = new Weight(Weight.Unit.GRAMS, 1000.0);
        double add = tonne.addTwoWeights(gram);
        Assertions.assertEquals(1001.0, add);
    }
}