package com.roselism.one.obj.unit;

/**
 * 
 * @author Simon Wang
 * @version 32.876-2015
 */
public class Millisecond extends Time {
    public Millisecond() {
	super();
    }

    @Override
    public int getValue() {
	int value = 1; // 毫秒是时间类的比较对象
	return value;
    }
}
