import java.util.HashSet;
import java.util.Set;

public class ch11ex11_symmetricSetDifference {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(4);
        set1.add(7);
        set1.add(9);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        Set<Integer> symmetricDifference = symmetricSetDifference(set1, set2);
        System.out.println("Symmetric set difference: " + symmetricDifference);
    }

    public static Set<Integer> symmetricSetDifference(Set<Integer> set1, Set<Integer> set2) {
        HashSet<Integer> difference = new HashSet<Integer>();

        for (int num : set1) {
            if (!set2.contains(num)) {
                difference.add(num);
            }
        }

        for (int num : set2) {
            if (!set1.contains(num)) {
                difference.add(num);
            }
        }

        return difference;
    }

}
