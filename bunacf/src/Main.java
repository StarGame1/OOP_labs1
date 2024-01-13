import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String text = "Buna ce mai faci? Buna, sunt mai bine";

        String[] words = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        TreeMap<String, Integer> map = new TreeMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        System.out.println("Numărul de apariții pentru fiecare cuvânt:");
        for (String word : map.keySet()) {
            System.out.println(word + ": " + map.get(word));
        }
    }
}
