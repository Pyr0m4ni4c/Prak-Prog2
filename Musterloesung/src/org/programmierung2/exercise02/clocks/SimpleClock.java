package org.programmierung2.exercise02.clocks;

public class SimpleClock {

    protected int minutes;
    protected int hours;

    public SimpleClock(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleClock(int hours) {
        this(hours, 0);
    }

    public SimpleClock() {
        this(0, 0);
    }

    public SimpleClock add(int min) {
        this.minutes += min;
        return this;
    }

    public SimpleClock add(SimpleClock o) {
        this.hours += o.hours;
        this.minutes += o.minutes;
        return this;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    @Override
    public String toString() {
        final String h, m;
        if (hours < 10) h = "0" + hours;
        else h = "" + hours;
        if (minutes < 10) m = "0" + minutes;
        else m = "" + minutes;
        return h + ':' + m;
    }
}
