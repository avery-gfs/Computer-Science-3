import java.util.*;

class Template {
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
  }

  static List<Integer> reversedList(List<Integer> numbers) {
    // Write a method that that takes a List and returns
    // a new List with the values reversed
    return null;
  }

  static List<Integer> primeFactors(int n) {
    // Write a method that calculates the prime factorization
    // of a number and returns the factors as a List
    return null;
  }

  static String calcDay(String startDay, int offset) {
    // Get a string `startDay` and a number `offset` as input,
    // print out what the day of the week it will be `offset`
    // days from `startDay`
    return null;
  }
}
