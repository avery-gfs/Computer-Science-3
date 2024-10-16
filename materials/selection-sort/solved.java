import java.util.*;

class Main {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(List.of(3, 1, 4, 1, 5, 9, 2, 6, 5, 4));
    
    System.out.println(numbers);
    System.out.println(isSorted(numbers));

    sort(numbers);

    System.out.println(numbers);
    System.out.println(isSorted(numbers));
  }

  static boolean isSorted(List<Integer> numbers) {
    // Check whether or not a list is sorted (from low to high)

    if (!numbers.isEmpty()) {
      int prev = numbers.get(0);

      for (int n : numbers) {
        if (prev > n) {
          return false;
        }

        prev = n;
      }
    }

    return true;
  }

  static void sort(List<Integer> numbers) {
    // Sort numbers in place using the selection sort algorithm
    // https://en.wikipedia.org/wiki/Selection_sort

    for (int dest = 0; dest < numbers.size(); dest++) {
      int minIndex = dest;
      int destNum = numbers.get(dest);
      int min = destNum;

      for (int i = dest; i < numbers.size(); i++) {
        if (numbers.get(i) < min) {
          min = numbers.get(i);
          minIndex = i;
        }
      }

      numbers.set(minIndex, destNum);
      numbers.set(dest, min);
    }
  }
}