package midterm.lizi_zarkua_1.task4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;
        Set<String> uniqueWords = new HashSet<>(fantasyFormatData);
        System.out.println("Unique Words:");
        System.out.println(uniqueWords);
        Map<Integer, Integer> wordLengthCount = new HashMap<>();
        for (String word : uniqueWords) {
            int length = word.length();
            wordLengthCount.put(length, wordLengthCount.getOrDefault(length, 0) + 1);
        }
        System.out.println("\nWord Lengths and Counts:");
        for (Map.Entry<Integer, Integer> entry : wordLengthCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        writeToTask4File(uniqueWords, wordLengthCount);
    }

    private static void writeToTask4File(Set<String> uniqueWords, Map<Integer, Integer> wordLengthCount) {
        try {
            java.io.FileWriter myWriter = new java.io.FileWriter("task4.txt", true);
            myWriter.write("\n\nUnique Words:\n" + uniqueWords.toString() + "\n\nWord Lengths and Counts:\n");
            for (Map.Entry<Integer, Integer> entry : wordLengthCount.entrySet()) {
                myWriter.write(entry.getKey() + " : " + entry.getValue() + "\n");
            }
            myWriter.close();
            System.out.println("\nResults have been written to task4.txt");
        } catch (java.io.IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
    