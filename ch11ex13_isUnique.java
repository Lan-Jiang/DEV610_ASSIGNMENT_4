import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ch11ex13_isUnique {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("Marty", "Stepp");
        map1.put("Stuart", "Reges");
        map1.put("Jessica", "Miller");
        map1.put("Amanda", "Camp");
        map1.put("Hal", "Perkins");

        Map<String, String> map2 = new HashMap<>();
        map2.put("Kendrick", "Perkins");
        map2.put("Stuart", "Reges");
        map2.put("Jessica", "Miller");
        map2.put("Bruce", "Reges");
        map2.put("Hal", "Perkins");

        System.out.println("Map 1 is unique: " + isUnique(map1)); // true
        System.out.println("Map 2 is unique: " + isUnique(map2)); // false
    }

    public static boolean isUnique(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return true;
        }

        HashSet<String> set = new HashSet<String>();

        for (String value: map.values()) {
            boolean added = set.add(value);
            if (! added) {
                return false;
            }
        }

        return true;
    }

}
