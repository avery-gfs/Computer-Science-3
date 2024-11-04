import java.util.*;

class Main {
  public static void main(String[] args) {
    // In the United Kingdom the currency is made up of pound (£) and pence (p).
    // There are eight coins in general circulation:
    //
    //     1p, 2p, 5p, 10p, 20p, 50p, £1 (100p), and £2 (200p).
    //
    // It is possible to make £2 in the following way:
    //
    //     1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
    //
    // How many different ways can £2 be made using any number of coins?

    int goal = 200;
    int count = 0;

    long start = System.currentTimeMillis();

    // Your code goes here!

    long end = System.currentTimeMillis();

    System.out.println(count);
    System.out.println("Seconds: " + (end - start) / 1000.0);
  }
}
