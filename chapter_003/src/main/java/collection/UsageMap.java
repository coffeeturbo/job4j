package collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("test@mail.ru", "Esteban Eric Cartman");
        map.put("test2@mail.ru", "Hulia Eric Cartman");
        map.put("test2@mail.ru", "Hulia Eric Cartmanz");

        for (String key:map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
