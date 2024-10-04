import java.util.*;

class Main {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(List.of(3, 1, 4, 1, 5, 9, 2, 6, 5, 4));
    System.out.println(numbers);
    sort(numbers);
    System.out.println(numbers);
  }

  static void sort(List<Integer> numbers) {
    // Sort numbers in place using the selection sort algorithm
    // https://en.wikipedia.org/wiki/Selection_sort
  }
}
