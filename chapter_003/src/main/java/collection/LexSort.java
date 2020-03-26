package collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    private static int  extractNumber(String str) {
        String[] digit = str.split(". ");
        return Integer.parseInt(digit[0]);
    }

    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(extractNumber(o1), extractNumber(o2));
    }
}
