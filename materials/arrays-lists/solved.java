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

    int[] copy = numbers.clone();

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = copy[copy.length - 1 - i];
    }

    // Alternatively:

    // int left = 0;
    // int right = numbers.length - 1;

    // while (left < right) {
    //   int tmp = numbers[left];
    //   numbers[left] = numbers[right];
    //   numbers[right] = tmp;
    //   left++;
    //   right--;
    // }
  }

  static List<Integer> reversedList(List<Integer> numbers) {
    // Write a method that that takes a List and returns
    // a new List with the values reversed
    // (hint: use `.add()`)
    
    List<Integer> result = new ArrayList<>();

    for (int i = numbers.size() - 1; i >= 0; i--) {
      result.add(numbers.get(i));
    }

    return result;
  }

  static List<Integer> primeFactors(int n) {
    // Write a method that calculates the prime factorization
    // of a number and returns the factors as a List

    List<Integer> factors = new ArrayList<>();

    int div = 2;

    while (n > 1) {
      if (n % div == 0) {
        factors.add(div);
        n /= div;
      } else {
        div++;
      }
    }

    return factors;
  }

  static String calcDay(String startDay, int offset) {
    // Given a string `startDay` and a number `offset`,
    // print out what the day of the week it will be `offset`
    // days from `startDay`
    // (hint: make a list of day names and use `.indexOf()`)

    List<String> days = List.of(
      "Monday",
      "Tuesday",
      "Wednesday",
      "Thursday",
      "Friday",
      "Saturday",
      "Sunday"
    );

    int dayNum = days.indexOf(startDay);
    dayNum = (dayNum + offset) % 7;
    return days.get(dayNum);
  }
}
