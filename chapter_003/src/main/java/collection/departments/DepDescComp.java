package collection.departments;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] left = o1.split("/");
        String[] right = o2.split("/");

        var comp = right[0].compareTo(left[0]);
        return comp == 0 ? o1.compareTo(o2) : comp;
    }
}
