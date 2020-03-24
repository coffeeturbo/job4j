package collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String originString: origin) {
            check.add(originString);
        }

        for (String duplString: text) {
            if (!check.contains(duplString)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
