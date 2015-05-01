package com.roselism.one.obj.unit;

public class Second extends Time {

    @Override
    public int getValue() {
	Millisecond millisecond = new com.roselism.one.obj.unit.Millisecond();
	int value = millisecond.getValue() * 1000;
	return value;
    }
}
