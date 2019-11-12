package edu.nyu.cs9053.homework8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TextingDictionary {

    private final List<String> dictionary;

    public TextingDictionary() {
        this.dictionary = new ArrayList<>(20);
    }

    public void insert(String word) {
        if (word == null) {
            throw new IllegalArgumentException("Cannot insert null to dictionary!");
        }
        String regex = "^[a-zA-Z]+$";           //Using regular-expression to find non a-Z or A-Z characters and throw IllegalArgumentException.
        if (!word.matches(regex)) {
            throw new IllegalArgumentException("Cannot insert non a-z or A-Z characters! ");
        }
        this.dictionary.add(word);
    }

    public List<String> search(List<ValidTextKeyPress> prefixes) {
        if (prefixes == null) {
            throw new IllegalArgumentException("Searching TextKey cannot be null!");
        }
        List<String> searchResults = new ArrayList<>(dictionary);
        Iterator<ValidTextKeyPress> iteratorKey = prefixes.iterator();
        Iterator<String> iteratorResults = searchResults.iterator();
        int letterIndex = 0;
        while (iteratorKey.hasNext()) {
            ValidTextKeyPress nextKey = iteratorKey.next();
            while (iteratorResults.hasNext()) {
                String nextResult = iteratorResults.next();
                if (!nextKey.getKeyMappings().contains(nextResult.charAt(letterIndex))) {
                    iteratorResults.remove();
                }
            }
            iteratorResults = searchResults.iterator();
            letterIndex++;
        }
        return searchResults;
    }

}
