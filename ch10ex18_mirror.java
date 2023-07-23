import java.util.ArrayList;

public class ch10ex18_mirror {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        ArrayList<String> mirroredList = mirror(list);

        System.out.println(mirroredList);
    }

    public static ArrayList<String> mirror(ArrayList<String> inputList) {
        ArrayList<String> mirroredList = new ArrayList<>(inputList);
        int size = inputList.size();

        for (int i = size - 1; i >= 0; i--) {
            mirroredList.add(inputList.get(i));
        }

        return mirroredList;
    }


}
