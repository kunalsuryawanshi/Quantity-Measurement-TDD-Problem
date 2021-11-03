package com.quantitymesurement;

import java.util.Objects;

public class Volume {
    private static final Double GALLON_TO_LITRE = 3.78;
    private static final Double LITRE_TO_ML = 1000.0;
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
        if (this.unit.equals(Unit.GALLON) && that.unit.equals(Unit.LITRE))
            return Double.compare(this.value * GALLON_TO_LITRE, that.value) == 0;
        if (this.unit.equals(Unit.LITRE) && that.unit.equals(Unit.MILLI_LITRE))
            return Double.compare(this.value * LITRE_TO_ML, that.value) == 0;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Objects.equals(value, volume.value) && unit == volume.unit;
    }

    public double addTwoVolumes(Volume that) {
        if (this.unit.equals(Unit.GALLON) && that.unit.equals(Unit.LITRE))
            return this.value * GALLON_TO_LITRE + that.value;
        return 0;
    }

    enum Unit {GALLON, LITRE, MILLI_LITRE}
}