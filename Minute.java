package com.roselism.one.obj.unit;

/**
 * 分钟单位类
 * 
 * @author Simon Wang
 *
 */
public class Minute extends Time {
    public Minute() {
	super();
    }

    @Override
    public int getValue() {
	Second second = new com.roselism.one.obj.unit.Second();

	int value = second.getValue() * 60;
	return value;
    }
}
