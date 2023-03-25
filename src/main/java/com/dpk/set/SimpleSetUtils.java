package com.dpk.set;

import java.util.HashSet;
import java.util.Set;

public class SimpleSetUtils {

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.removeIf( item -> !set2.contains(item));
        return result;
    }

    public static Set<Integer> minus(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.removeIf(item -> set2.contains(item));
        return result;
    }

}
