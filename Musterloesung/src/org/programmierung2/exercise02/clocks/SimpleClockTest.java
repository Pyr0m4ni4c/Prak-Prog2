package org.programmierung2.exercise02.clocks;

import org.junit.Assert;
import sun.java2d.pipe.SpanShapeRenderer;

import static org.junit.Assert.*;

public class SimpleClockTest {
    new SimpleClock.SimpleClocks(5, 24);

    @org.junit.Test
    public void add() {

    }

    @org.junit.Test
    public void add1() {
    }

    @org.junit.Test
    public void getHours() {
    }

    @org.junit.Test
    public void getMinutes() {
    }

    @org.junit.Test
    public void toString() {
        Assert.assertEquals("test", "5:24", new SimpleClock(5,24));
    }
}