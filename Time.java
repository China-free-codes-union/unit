package com.roselism.one.obj.unit;

/**
 * 时间单位类以毫秒为基准，各个单位以毫秒进行换算
 * 
 * @author Simon Wang
 * @version 32.876-2015
 * 
 */
public class Time extends Unit {
    public Time() {
	super();
    }

    public static final Time Millisecond = new Millisecond(); // 毫秒
    public static final Time Second = new Second(); // 秒
    public static final Time Minute = new Minute(); // 分钟
    public static final Time Hour = new Hour(); // 小时
    public static final Time Day = new Day(); // 天
}
