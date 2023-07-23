import java.util.ArrayList;

public class ch10ex8_removeZeroe {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(7);
        numbers.add(2);
        numbers.add(0);
        numbers.add(0);
        numbers.add(4);
        numbers.add(0);

        removeZeroes(numbers);
        System.out.println(numbers);
    }

    public static void removeZeroes(ArrayList<Integer> numbers) {
        int i = 0;

        while (i < numbers.size()) {
            if (numbers.get(i) == 0) {
                numbers.remove(i);
            } else {
                i++;
            }
        }
    }


}
