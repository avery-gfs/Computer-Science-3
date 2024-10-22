import java.util.*;

class Main {
  public static void main(String[] args) {
  }
}

class UserInput {
  // Static methods and attributes belong to a class itself,
  // rather than an instance of the class

  // We could put this definition in getInput, but then we'd be
  // re-creating a new Scanner object for each getInput call.
  // This way we can re-use the same Scanner object.
  static Scanner reader = new Scanner(System.in);

  // Clears the console
  static void clear() {
    System.out.print("\033[H\033[2J");
  }

  // Allows the user to choose an option by entering a number
  // Returns the String option that the user chose
  // Takes a flexible number of arguments (varargs)
  static String getInput(String ...options) {
    System.out.println("Your options are:\n");

    // Use 1-index for options labelling
    for (int i = 0; i < options.length; i++) {
      System.out.println("(" + (i + 1) + ") " + options[i]);
    }

    System.out.println("(0) Exit");

    // Loop until we get valid input
    while (true) {
      try {
        System.out.print("\nEnter a number: ");
        int choice = reader.nextInt();

        if (choice == 0) {
          return "Exit";
        } else if (choice > 0 && choice <= options.length) {
          clear();
          return options[choice - 1];
        }
      } catch (InputMismatchException err) {
        reader.next(); // flush input buffer
      }
    }
  }
}
