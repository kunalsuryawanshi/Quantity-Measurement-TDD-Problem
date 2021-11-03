package com.quantitymesurement;

import java.util.Objects;

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

    enum Unit {FAHRENHEIT}
}
