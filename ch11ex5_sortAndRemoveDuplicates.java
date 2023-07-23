import java.util.ArrayList;
// import java.util.HashSet;
import java.util.List;
// import java.util.Set;

public class ch11ex5_sortAndRemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(4);
        numbers.add(-9);
        numbers.add(4);
        numbers.add(15);
        numbers.add(8);
        numbers.add(27);
        numbers.add(7);
        numbers.add(11);
        numbers.add(-5);
        numbers.add(32);
        numbers.add(-9);
        numbers.add(-9);

        sortAndRemoveDuplicates(numbers);

        System.out.println(numbers);
    }

    public static void sortAndRemoveDuplicates(List<Integer> numbers) {
        int n = numbers.size();

        // Remove duplicates
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers.get(i).equals(numbers.get(j))) {
                    numbers.remove(j);
                    n--;
                    j--;
                }
            }
        }

        // Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers.get(j) > numbers.    get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
    }



}
