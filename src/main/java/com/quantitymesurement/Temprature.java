package com.quantitymesurement;

/**
 * @author KUNAL SURYAWANSHI
 */

public class Temprature {
    public final double value;
    public final Unit unit;

    public Temprature(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temprature that = (Temprature) o;
        return Double.compare(that.value, value) == 0;
    }

    /**
     * Purpose : To Convert Value Fahrenheit to Celcius
     *
     * @return Celcius
     */
    public double convert() {
        return (this.value - 32) * 5 / 9;
    }

    enum Unit {FAHRENHEIT}
}
