package com.quantitymesurement;

/**
 * @author KUNAL SURYAWANSHI
 */
public class Length {
    public final Double value;
    private final Unit unit;

    public Length(Unit unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    /**
     * Purpose : Compare the Lengths
     *
     * @param that : Taking Lengths
     * @return : Converted Values
     */
    public boolean compare(Length that) {
        return Double.compare(this.unit.convertToBaseUnit(this), that.unit.convertToBaseUnit(that)) == 0;
    }

    /**
     * Purpose : Given Two Lengths Should add and return Expected Value
     *
     * @param that : Taking Lengths
     * @return addition of the two lengths
     */
    public double addTwoLengths(Length that) {
          return  this.unit.convertToBaseUnit(this) + that.unit.convertToBaseUnit(that);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }

    enum Unit {
        FEET(12.0), INCH(1.0), YARD(36.0), CENTIMETER(0.4);

        private final double baseUnitConversion;

        Unit(double baseUnitConversion) {
            this.baseUnitConversion = baseUnitConversion;
        }

        /**
         * Purpose : To Convert Into Base Value
         *
         * @param l1 Taking Length
         * @return Converted Value
         */
        public double convertToBaseUnit(Length l1) {
            return (l1.value * baseUnitConversion);
        }
    }
}