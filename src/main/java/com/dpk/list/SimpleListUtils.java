package com.dpk.list;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SimpleListUtils {

    public static int findLargest(List<Integer> list) {
        Optional<Integer> optionalNumber = list.stream().max(Comparator.comparingInt(Integer::intValue));
        if(optionalNumber.isPresent()) {
            return optionalNumber.get();
        }
        throw new IllegalArgumentException("Invalid list of items");
    }

    public static int findSmallest(List<Integer> list) {
        Optional<Integer> optionalNumber = list.stream().min(Comparator.comparingInt(Integer::intValue));
        if(optionalNumber.isPresent()) {
            return optionalNumber.get();
        }
        throw new IllegalArgumentException("Invalid list of items");
    }

}
