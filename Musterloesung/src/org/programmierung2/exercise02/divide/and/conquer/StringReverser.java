package org.programmierung2.exercise02.divide.and.conquer;

import java.util.function.UnaryOperator;

public class StringReverser implements UnaryOperator<String> {
    public String apply(String s) {
        if (s.length() == 0) return s;
        else {
            int lastPos = s.length()-1;
            return s.charAt(lastPos) + apply(s.substring(0, lastPos));
        }
    }
}
