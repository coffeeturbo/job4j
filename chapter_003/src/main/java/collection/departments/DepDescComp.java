package collection.departments;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        var rsl = 0;
        String[] left = o1.split("/");
        String[] right = o2.split("/");
        var comp = right[0].compareTo(left[0]);
        if (comp == 0) {
            rsl = o1.compareTo(o2);
        } else {
            rsl = o2.compareTo(o1);
        }
        return rsl;
    }
}
