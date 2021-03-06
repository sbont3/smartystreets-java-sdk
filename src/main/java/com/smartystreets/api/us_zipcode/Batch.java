package com.smartystreets.api.us_zipcode;

import com.smartystreets.api.exceptions.BatchFullException;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Vector;

public class Batch {
    public static final int MAX_BATCH_SIZE = 100;
    private Map<String, Lookup> namedLookups;
    private Vector<Lookup> allLookups;

    public Batch() {
        this.namedLookups = new LinkedHashMap<>();
        this.allLookups = new Vector<>();
    }

    public void add(Lookup lookup) throws BatchFullException {
        if (this.isFull())
            throw new BatchFullException("Batch size cannot exceed " + MAX_BATCH_SIZE);

        String key = lookup.getInputId();

        if (key != null)
            this.namedLookups.put(key, lookup);

        this.allLookups.add(lookup);
    }

    public void clear() {
        this.namedLookups.clear();
        this.allLookups.clear();
    }

    //region [ Helpers ]

    public int size() {
        return this.allLookups.size();
    }

    public boolean isFull() {
        return (this.size() >= MAX_BATCH_SIZE);
    }

    public Iterator<Lookup> iterator() {
        return this.allLookups.iterator();
    }

    //endregion

    //region [ Getters ]

    public Map<String, Lookup> getNamedLookups() {
        return this.namedLookups;
    }

    public Vector<Lookup> getAllLookups() {
        return this.allLookups;
    }

    public Lookup get(String inputId) {
        return this.namedLookups.get(inputId);
    }

    public Lookup get(int inputIndex) {
        return this.allLookups.get(inputIndex);
    }

    //endregion
}
