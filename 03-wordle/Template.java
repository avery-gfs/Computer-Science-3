import java.nio.file.*;
import java.util.*;

class Template {
  public static void main(String[] args) throws Exception {
    Random random = new Random();
    Scanner reader = new Scanner(System.in);
    List<String> words = Files.readAllLines(Paths.get("words.txt"));

    // Start by making grading work for hard-coded guess and answer

    String guess = "emcee";
    String actual = "never";

    String[] score = { "⬜", "⬜", "⬜", "⬜", "⬜" };

    HashMap<Character, Integer> counts = new HashMap<Character, Integer>();

    for (int i = 0; i < 5; i++) {
      if (guess.charAt(i) == actual.charAt(i)) {
        score[i] = "🟩";
      } else {
        char letter = actual.charAt(i);
        int count = counts.getOrDefault(letter, 0);
        counts.put(letter, count + 1);
      }
    }

    for (int i = 0; i < 5; i++) {
      if (!score[i].equals("🟩")) {
        char letter = guess.charAt(i);
        int count = counts.getOrDefault(letter, 0);

        if (count > 0) {
          score[i] = "🟨";
          counts.put(letter, count - 1);
        }
      }
    }

    System.out.println(guess + " " + String.join("", score));
  }
}
