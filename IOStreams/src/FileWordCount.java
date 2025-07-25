import java.io.*;
import java.util.*;
public class FileWordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length < 2) {
            System.out.println("Usage: java FileWordCount inputFile outputFile");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        Map<String, Integer> wordCountMap = new TreeMap<>();

        try (Scanner scanner = new Scanner(new File(inputFile))) {
            while (scanner.hasNext()) {
                String word = scanner.next().replaceAll("[^a-zA-Z]", "").trim();
                if (!word.isEmpty()) {
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
            }

            try (PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
                for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                    writer.println(entry.getKey() + " : " + entry.getValue());
                }
            }

            System.out.println("Word count has been written to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

	}

}
