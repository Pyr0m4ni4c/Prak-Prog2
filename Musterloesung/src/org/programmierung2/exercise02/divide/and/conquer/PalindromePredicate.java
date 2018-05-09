package org.programmierung2.exercise02.divide.and.conquer;

import java.util.function.Predicate;

public class PalindromePredicate implements Predicate<String> {
    public boolean test(String s) {
        int iFront = 0;
        int iBack = s.length() - 1;
        return test(s, iFront, iBack);
    }

    private boolean test(String s, int iFront, int iBack) {
        if (iFront >= iBack) return true;
        else {
            char cFront = s.charAt(iFront);
            char cBack = s.charAt(iBack);
            if (cFront != cBack) {
                return false;
            } else {
                return test(s, iFront+1, iBack-1);
            }
        }
    }
}
