package com.tw;

import java.util.Objects;

public class Probability {
    final double value;

    public Probability(double probabilityOfAnEvent) {
        this.value = probabilityOfAnEvent;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Probability that = (Probability) object;
        return Double.compare(that.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
