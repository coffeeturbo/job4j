package collection.departments;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int limit = Math.min(o1.length(), o2.length());
        char[] first = o1.toCharArray();
        char[] second = o2.toCharArray();
        int result = 0;
        for (int i = 0; i < limit; i++) {
            result = Character.compare(second[i], first[i]);
            if (result != 0) {
                return result;
            }
        }
        return o1.length() - o2.length();
    }
}
