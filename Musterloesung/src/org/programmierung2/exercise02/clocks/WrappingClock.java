package org.programmierung2.exercise02.clocks;

public class WrappingClock extends SimpleClock implements Comparable<WrappingClock> {
    private static int MINUTES_PER_DAY = 24 * 60;

    public WrappingClock() {
        super();
    }

    public WrappingClock(int hours) {
        super(hours);
        wrap();
    }

    public WrappingClock(int hours, int minutes) {
        super(hours, minutes);
        wrap();
    }

    public WrappingClock add(int minutes) {
        super.add(minutes);
        wrap();
        return this;
    }

    public WrappingClock add(SimpleClock o) {
        super.add(o);
        wrap();
        return this;
    }

    protected void wrap() {
        int newRawMinutes = this.hours * 60 + this.minutes;
        newRawMinutes %= MINUTES_PER_DAY;
        if (newRawMinutes < 0) {
            newRawMinutes += MINUTES_PER_DAY;
        }
        this.minutes = newRawMinutes % 60;
        this.hours = newRawMinutes / 60;
    }

    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof WrappingClock)) return false;
        WrappingClock o = (WrappingClock) other;
        return (this.hours == o.hours) && (this.minutes == o.minutes);
    }

    @Override
    public int compareTo(WrappingClock o) {
        int thisMinutes   = this.hours * 60 + this.minutes;
        int otherMinutes  = o.hours    * 60 + o.minutes;
        return thisMinutes - otherMinutes;
    }
}
