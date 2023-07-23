import java.util.ArrayList;

public class ch10ex4_doubleList {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("how");
        strings.add("are");
        strings.add("you?");

        doubleList(strings);

        System.out.println(strings);
    }

    public static void doubleList(ArrayList<String> strings) {
        int strSize = strings.size();

        for (int i = 0; i < strSize; i += 2) {
            strings.add(i, strings.get(i));
        }
        // ArrayList<String> temp = new ArrayList<String>();

        // for(String str : strings) {
        //     temp.add(str);
        //     temp.add(str);
        // }

        // strings.clear();

        // for(String str : temp)
        //     strings.add(str);

    }



}
