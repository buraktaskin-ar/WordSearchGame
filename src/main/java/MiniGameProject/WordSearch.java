package MiniGameProject;

/**
 * Hello world!
 *
 */


import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); // Kelime sayısı
        String[] words = new String[n];
        
        
        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }
        
        
        String text = scanner.nextLine();
        scanner.close();
        boolean[] used = new boolean[text.length()];
        
        for (String word : words) {
            markWord(text, word, used);
            markWord(text, new StringBuilder(word).reverse().toString(), used);
        }
        StringBuilder secretMessage = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (!used[i]) {
                secretMessage.append(text.charAt(i));
            }
        }
        System.out.println(secretMessage.toString());
    }
    private static void markWord(String text, String word, boolean[] used) {
        int index = text.indexOf(word);
        while (index != -1) {
            for (int i = 0; i < word.length(); i++) {
                used[index + i] = true;
            }
            index = -1;
        }
    }
}