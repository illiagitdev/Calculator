package lesson15_16.o9_collections_generics;

import java.util.*;

public class PerformanceChecker {
    public long checkAdding(Collection collection, int count) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            collection.add(i*i );
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public long checkReading(Collection collection, int count) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            collection.contains(i*i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public long checkRemoving(Collection collection, int count) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            collection.remove(i*i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
