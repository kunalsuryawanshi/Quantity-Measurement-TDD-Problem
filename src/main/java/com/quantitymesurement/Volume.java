package com.quantitymesurement;
/**
 * @author KUNAL SURYAWANSHI
 */

import java.util.Objects;

public class Volume {
    private final Double value;
    private final Unit unit;

    public Volume(Unit unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    /**
     * Purpose : Compare the Volumes
     *
     * @param that: Taking Volumes
     * @return if Matches return Converted Values
     */
    public boolean compare(Volume that) {
        return Double.compare(this.unit.convertToBaseUnit(this), that.unit.convertToBaseUnit(that)) == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Objects.equals(value, volume.value) && unit == volume.unit;
    }

    /**
     * Purpose To add Two Volumes
     *
     * @param that = Volume
     * @return Addition of Two Volumes
     */
    public double addTwoVolumes(Volume that) {
        return this.unit.convertToBaseUnit(this) + that.unit.convertToBaseUnit(that);
    }

    enum Unit {
        GALLON(3.78), LITRE(1.0), MILLI_LITRE(0.001);

        private final double baseUnitConversion;

        Unit(double baseUnitConversion) {
            this.baseUnitConversion = baseUnitConversion;
        }

        /**
         * Purpose : To Convert Into Base Value
         *
         * @param v1 Taking Volume
         * @return Converted Value
         */
        public double convertToBaseUnit(Volume v1) {
            return (v1.value * baseUnitConversion);
        }
    }
}