package com.roselism.one.obj.unit;

public class Hour extends Time {
    public Hour() {
	super();
    }

    @Override
    public int getValue() {
	Minute minute = new com.roselism.one.obj.unit.Minute();
	int value = minute.getValue() * 60;
	return value;
    }
}
