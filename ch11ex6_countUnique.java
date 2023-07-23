import java.util.HashSet;
import java.util.List;

public class ch11ex6_countUnique {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);

        System.out.println("Number of unique values: " + countUnique(numbers));
    }

    public static int countUnique(List<Integer> numbers) {
        HashSet<Integer> uniqueSet = new HashSet<Integer>();

        for (Integer num : numbers) {
            uniqueSet.add(num);
        }

        return uniqueSet.size();
    }

}
