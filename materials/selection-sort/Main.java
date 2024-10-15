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
    // Checks whether or not a list is sorted (from low to high)
    
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

    // Pseudocode:
    // 
    // - Initialize a variable pointer to the first index in the list
    // - While pointer is less than the length of the list:
    //   - Find the index (maxIndex) of the largest number between index
    //     pointer and the end of the list
    //   - Swap the value at pointer and the value at maxIndex
  }
}