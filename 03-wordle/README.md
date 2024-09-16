## Problem: Implement Wordle

```
charm ⬜🟨⬜⬜⬜ b d e f g i j k l n o p q s t u v w x y z
slope ⬜🟩⬜🟩⬜ b d f g i j k n q t u v w x y z
fight ⬜⬜🟨🟨⬜ b d j k n q u v w x y z
glyph 🟩🟩🟩🟩🟩 b d j k n q u v w x z
```

https://en.wikipedia.org/wiki/Wordle

For this assignment, you will be implementing an interactive, command-line based version of Wordle in Java. This problem will help you practice important concepts such as:

- Static typing
- File and terminal IO
- Sequence types
- Iteration
- Hashed data structures
- Methods

You may have implemented a version of Wordle before; if so, your focus should be not just on recreating the game, but on attempting to maximize the quality of your code. Here are some design questions for you to consider:

- Is your code as straightforward as possible? Could another programmer understand how it operates without too much confusion?

- Is your code modular? For instance, if you wanted to implement a web server that graded Wordle submissions sent over a network, how much of your code would you be able to reuse?

- Does your code take advantage of modern Java features?

- Is your code efficient? Does it use appropriate data structures for each task?

- Does your code implement the Wordle grading rules correctly? Do you have test cases that demonstrate this? Is your code split into components that can be tested separately? `"Error"` and `"River"` are your friends here.

There are many ways to approach this problem and structure your code. You are free to experiment and choose an approach that works for you. Here is a suggested list of steps to take:

1. Write a scoring method that identifies the "green" letters in a guess for a given hard-coded `guess` and `answer` pair.
2. Update your scoring method to find "yellow" letters as well.

3. Write test cases for your grading algorithm.

4. Get a guess as input from the user.

5. Split grading and UI code into separate methods.

6. Use iteration to get guesses from the user repeatedly. End once the correct guess is reached.

7. Read the list of 5-letter words from `words.txt` into an appropriate data-structure. Use the list of words to generate a random secret word for each new game.

8. Validate the user's guesses and handle invalid guesses gracefully.

9. Make your code robust to whitespace and capitalization in guesses.

10. Display the grades for each guess in a readable way, possibly using colors. Make the input and output elements of the UI work together cleanly. See https://emojipedia.org/search?q=square and https://www.w3schools.blog/ansi-colors-java.

11. Add code to show the user which letters have yet to be guessed, as well as the "best" resulting color for each letter that has been guessed.

12. Use `HashMap`s for grading guesses and keeping track of alphabet letter guess states.

13. Add a "play again" option.

14. Load `words.txt` from its path relative to the source script, so that your program works when called outside of the project directory.

15. Use `HashMap.getOrDefault` if applicable.

16. Use `enums` if applicable.

17. Use `switch` and `yield` if applicable.

18. Use `String.join` if applicable.

19. Use `Array.fill` if applicable.

20. Use the `Stream` API if applicable.

## Notes

- Reading files

  ```java
  import java.io.IOException;
  import java.net.URISyntaxException;
  import java.nio.file.*;
  import java.util.*;

  class Demo {
    public static void main(String[] args) throws IOException, URISyntaxException {
      List<String> words = Files.readAllLines(Paths.get("words.txt"));

      // ... your code here
    }
  }
  ```

- The grade for the guess `"error"` for the actual word `"river"` should be `🟨🟨⬜⬜🟩`.

- `char`s vs `String`s

- Wrapper classes: https://www.w3schools.com/java/java_wrapper_classes.asp

- When writing code to read `words.txt`, Java might complain about there being exceptions that need to be caught or thrown. In Java, some exceptions are "checked" which means that you have explicitly tell Java what to do when they arise, using either the `try` / `catch` or the `throws` language features.

- If you are using an IDE like VSCode or IntelliJ, make sure that your project is structured in a way the editor can understand (your editor should have an option to make a new Java project). In particular, make sure that your `words.txt` is in your project directory, but not in your `src` directory. See the example structure below:

  ```
  Wordle/
  ├── src/
  │   └── Wordle.java
  └── words.txt
  ```

## Extensions

**Counter:** Add code to show the number of possible guesses remaining that fit previously given guess grades.

**Adversary:** Implement an "adversarial" Wordle program that changes its secret word (while respecting previous guess grades) in order to prolong the game.

**Guesser:** Write a program to suggest guesses based on previous guesses and grades.
