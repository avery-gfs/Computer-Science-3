import java.util.*;

// The Main class provides the entry point when our application runs
class Main {
  public static void main(String[] args) {
    Game game = new Game();
    game.start(); // Enter game at starting point
  }
}

// Static methods and attributes belong to an instance of the Game
// class. Each instance gets its own copies of the attributes.
class Game {
  // Keep track of game statistics
  int attempts = 0;
  int successes = 0;

  // Game uses different methods to keep track of game state (state machine)
  void start() {
    System.out.println("Attempts: " + attempts + " Successes: " + successes);

    System.out.println("""
    Center and think about your linner light.

    Do I have the urge to speak?
    """);

    String choice = UserInput.getInput("Yes", "No");

    switch (choice) {
      case "Yes":
        community(); // Advance to next state
        break; // Need break to avoid fallthrough
      case "No":
        recenter(); // Go to end state
        break;
    }
  }

  void recenter() {
    attempts++;
    System.out.println("Return to center.\n");
    String choice = UserInput.getInput("Return to center");

    switch (choice) {
      case "Return to center":
        start(); // Return to initial state
        break;
    }
  }

  void community() {
    System.out.println("Is the message for the good of the community?\n");
    String choice = UserInput.getInput("Yes", "No");

    switch (choice) {
      case "Yes":
        revelation();
        break;
      case "No":
        recenter();
        break;
    }
  }

  void revelation() {
    System.out.println("Is the message a new idea or revelation?\n");
    String choice = UserInput.getInput("Yes", "No");

    switch (choice) {
      case "Yes":
        politics();
        break;
      case "No":
        recenter();
        break;
    }
  }

  void politics() {
    System.out.println("Is the message free from politics and lecture?\n");
    String choice = UserInput.getInput("Yes", "No");

    switch (choice) {
      case "Yes":
        compelled();
        break;
      case "No":
        recenter();
        break;
    }
  }

  void compelled() {
    System.out.println("Do I feel compelled to speak?\n");
    String choice = UserInput.getInput("Yes", "No");

    switch (choice) {
      case "Yes":
        speak();
        break;
      case "No":
        recenter();
        break;
    }
  }

  void speak() {
    successes++;
    System.out.println("Speak.\n");
    recenter();
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
