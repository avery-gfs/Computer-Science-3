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

    // Only grades greens for now

    for (int i = 0; i < 5; i++) {
      if (guess.charAt(i) == actual.charAt(i)) {
        score[i] = "🟩";
      }
    }

    System.out.println(guess + " " + String.join("", score));
  }
}
