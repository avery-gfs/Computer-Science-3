import java.util.*;

class Main {
  public static void main(String[] args) {
    List<Integer> numbers;

    numbers = new ArrayList<>(List.of(3, 1, 4, 1, 5, 9, 2, 6, 5, 4));
    System.out.println(isSorted(numbers) == false);

    sort(numbers);
    System.out.println(isSorted(numbers));

    numbers = new ArrayList<>();
    sort(numbers);
    System.out.println(isSorted(numbers));

    numbers = new ArrayList<>(List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 0));
    sort(numbers);
    System.out.println(isSorted(numbers));

    numbers = new ArrayList<>(List.of(0, -1, -2));
    sort(numbers);
    System.out.println(isSorted(numbers));

    int upper = 10000;

    for (int m = 0; m < 5; m++) {
      numbers = new ArrayList<>();

      for (int n = 0; n < upper; n++) {
        numbers.add(n);
      }

      long start = System.currentTimeMillis();
      sort(numbers);
      long end = System.currentTimeMillis();

      System.out.println(isSorted(numbers));
      System.out.println((end - start) / 1000.0);

      upper *= 2;
    }
  }

  static boolean isSorted(List<Integer> numbers) {
    // Check whether or not a list is sorted (from low to high)
    return false;
  }

  static void sort(List<Integer> numbers) {
    // Sort numbers in place using the selection sort algorithm
    // https://en.wikipedia.org/wiki/Selection_sort
  }
}