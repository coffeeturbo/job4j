package collection.departments;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                start = start.compareTo("") == 0
                        ? el
                        : start + "/" + el;
                tmp.add(start);
            }
        }

        return new ArrayList<>(tmp);
    }
}
