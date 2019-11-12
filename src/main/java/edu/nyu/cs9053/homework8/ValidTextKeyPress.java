package edu.nyu.cs9053.homework8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public enum ValidTextKeyPress {
    Two(new HashSet<Character>(Arrays.asList('a', 'b', 'c', 'A', 'B', 'C'))),
    Three(new HashSet<Character>(Arrays.asList('d', 'e', 'f', 'D', 'E', 'F'))),
    Four(new HashSet<Character>(Arrays.asList('g', 'h', 'i', 'G', 'H', 'I'))),
    Five(new HashSet<Character>(Arrays.asList('j', 'k', 'l', 'J', 'K', 'L'))),
    Six(new HashSet<Character>(Arrays.asList('m', 'n', 'o', 'M', 'N', 'O'))),
    Seven(new HashSet<Character>(Arrays.asList('p', 'q', 'r', 's', 'P', 'Q', 'R', 'S'))),
    Eight(new HashSet<Character>(Arrays.asList('t', 'u', 'v', 'T', 'U', 'V'))),
    Nine(new HashSet<Character>(Arrays.asList('w', 'x', 'y', 'z', 'W', 'X', 'Y', 'Z')));

    private final Set<Character> keyMappings;     //The reason to use Set: 1) no need to guarantee the order of elements; 2) .contains() operation has constant time performance

    private ValidTextKeyPress(Set<Character> keyMappings) {
        this.keyMappings = keyMappings;
    }

    public Set<Character> getKeyMappings() {
        return keyMappings;
    }
}
