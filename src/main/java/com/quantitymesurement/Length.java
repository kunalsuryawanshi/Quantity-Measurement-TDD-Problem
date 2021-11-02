package com.quantitymesurement;

/**
 * @author KUNAL SURYAWANSHI
 */
public class Length {
    private static final double FEET_TO_INCH = 12.0;
    private static final double FEET_TO_YARD = 3.0;
    private static final double YARD_TO_INCH = 36.0;
    private static final double INCH_TO_CENTIMETER = 2.5;
    private final Double value;
    private final Unit unit;

    public Length(Unit unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    /**
     * Purpose : Compare the Lengths
     *
     * @param that : Taking Lengths
     * @return : if Matches then returning Converted Values
     */
    public boolean compare(Length that) {
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * FEET_TO_INCH, that.value) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value / FEET_TO_INCH, that.value) == 0;
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.YARD))
            return Double.compare(this.value / FEET_TO_YARD, that.value) == 0;
        if (this.unit.equals(Unit.YARD) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * YARD_TO_INCH, that.value) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.YARD))
            return Double.compare(this.value / YARD_TO_INCH, that.value) == 0;
        if (this.unit.equals(Unit.YARD) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value * FEET_TO_YARD, that.value) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.CENTIMETER))
            return Double.compare(this.value * INCH_TO_CENTIMETER, that.value) == 0;
        return false;
    }

    /**
     * Purpose : Given Two Lengths Should add and return Expected Value
     *
     * @param that : Taking Lengths
     * @return addition of the two lengths
     */
    public double addTwoLengths(Length that) {
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.INCH))
            return this.value + that.value;
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            return this.value * FEET_TO_INCH + that.value;
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.FEET))
            return this.value * FEET_TO_INCH + that.value * FEET_TO_INCH;
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }

    enum Unit {
        FEET, INCH, YARD, CENTIMETER
    }
}