package com.roselism.one.obj.unit;

public class Day extends Time {
    public Day() {
			super();
    }

    @Override
    public int getValue() {
			Hour hour = new com.roselism.one.obj.unit.Hour();
			int value = hour.getValue() * 24;
			return value;
    }
}
