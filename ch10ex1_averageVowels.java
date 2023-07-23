import java.util.ArrayList;

public class ch10ex1_averageVowels {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Java");

        double avgVowels = averageVowels(strings);
        System.out.println("Average number of vowels: " + avgVowels);
    }

    public static double averageVowels(ArrayList<String> strings) {
    //     if (strings.isEmpty()) {
    //         return 0.0;
    //     }


    //     int totalStrings = strings.size();


    //     for(int i = 0; i < totalStrings; i++)
	// 	{
	// 		String str = strings.get(i);
    //         int totalVowels = 0;

	// 		for (char ch : str.toLowerCase().toCharArray()) {
    //             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
    //                 totalVowels++;
    //             }
    //         }
	// 	}


    //     return totalStrings;// (double) totalVowels / totalStrings;
        int count = 0;
        for (String word : strings) {
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j)=='a'||word.charAt(j)=='e'||word.charAt(j)=='i'||word.charAt(j)=='o'||word.charAt(j)=='u') {
                    count++;
                }
            }
        }

        double average = (double)count/strings.size();

        return average;

    }


}
