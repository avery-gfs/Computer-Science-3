import java.util.*;

class Main {
  public static void main(String[] args) {
    int[] numArray = { 1, 2, 3, 4, 5};

    reverseArray(numArray);
    System.out.println(Arrays.toString(numArray));

    List<Integer> numList = List.of(1, 2, 3, 4, 5);

    System.out.println(reversedList(numList));

    System.out.println(primeFactors(12345678));

    System.out.println(calcDay("Wednesday", 100));
  }

  static void reverseArray(int[] numbers) {
    // Write a method that reverses an Array
    // Make sure that your method updates the numbers array
    // (hint: use `.clone()`)
  }

  static List<Integer> reversedList(List<Integer> numbers) {
    // Write a method that that takes a List and returns
    // a new List with the values reversed
    // (hint: use `.add()`)

    return null;
  }

  static List<Integer> primeFactors(int n) {
    // Write a method that calculates the prime factorization
    // of a number and returns the factors as a List

    return null;
  }

  static String calcDay(String startDay, int offset) {
    // Given a string `startDay` and a number `offset`,
    // print out what the day of the week it will be `offset`
    // days from `startDay`
    // (hint: make a list of day names and use `.indexOf()`)
    
    return null;
  }
}
