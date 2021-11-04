package com.quantitymesurement;
/**
 * @author KUNAL SURYAWANSHI
 */

import java.util.Objects;

public class Weight {
    public final Double value;
    public final Unit unit;

    public Weight(Unit unit, Double value) {
        this.value = value;
        this.unit = unit;
    }

    /**
     * Purpose : To Compare Weights
     *
     * @param that Taking Weights
     * @return if Units Matches Return Converted Values
     */
    public boolean compare(Weight that) {
        return Double.compare(this.unit.convertToBaseUnit(this), that.unit.convertToBaseUnit(that)) == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weight weight = (Weight) o;
        return Objects.equals(value, weight.value) && unit == weight.unit;
    }

    /**
     * Purpose : To Add Weights
     *
     * @param that : Taking Lengths
     * @return addition of the two lengths
     */
    public double addTwoWeights(Weight that) {
        return this.unit.convertToBaseUnit(this) + that.unit.convertToBaseUnit(that);
    }

    enum Unit {
        KILOGRAM(1.0), GRAMS(0.001), TONNE(1000.0);

        private final double baseUnitConversion;

        Unit(double baseUnitConversion) {
            this.baseUnitConversion = baseUnitConversion;
        }

        /**
         * Purpose : To Convert Into Base Value
         *
         * @param w1 Taking Weight
         * @return Converted Value
         */
        public double convertToBaseUnit(Weight w1) {
            return w1.value * baseUnitConversion;
        }
    }
}
