import java.util.ArrayList;

public class ch10ex12_markLength4 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("this");
        list.add("is");
        list.add("lots");
        list.add("of");
        list.add("fun");
        list.add("for");
        list.add("Java");
        list.add("coders");

        markLength4(list);

        System.out.println(list);
    }


    public static void markLength4(ArrayList<String> words) {
        ArrayList<String> markedWords = new ArrayList<>();
        for (String word : words) {
            if (word.length() == 4) {
                markedWords.add("****");
            }
            markedWords.add(word);
        }
        words.clear();
        words.addAll(markedWords);
    }



}
