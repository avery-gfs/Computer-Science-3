import java.util.*;

class Main {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 4, 2, 5, 3);

    // Print a bar chart based on the numbers in the list `numbers`
    // where each number `n` in the list gets its own column with
    // `n` 'X' characters in it.
    //
    // For the numbers (1, 4, 2, 5, 3) the output should be:
    //
    //    X
    //  X X
    //  X XX
    //  XXXX
    // XXXXX

    // Remember that you can use `System.out.print` to print multiple values in
    // the same line (as opposed to `System.out.println` which adds newlines)
    //
    // You can use Collections.max to get the maximum number in a list
    //
    // Optionally, see also:
    //   - "for each" loops
    //      https://www.w3schools.com/java/java_foreach_loop.asp
    // 
    //   - Ternary operator (conditional expressions)
    //     https://www.w3schools.com/java/java_conditions_shorthand.asp

    for (int threshold = Collections.max(numbers); threshold > 0; threshold--) {
      for (int n : numbers) {
        System.out.print(n >= threshold ? "X" : " ");
      }

      System.out.println();
    }

    // Or, in Python:
    //
    // l = [1, 4, 2, 5, 3]
    // print("\n".join("".join(" X"[n >= t] for n in l) for t in range(max(l), 0, -1)))
  }
}
