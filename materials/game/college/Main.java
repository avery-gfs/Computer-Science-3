import java.util.*;

// The Main class provides the entry point when our application runs
class Main {
  public static void main(String[] args) {
    Random random = new Random();
    int energy = 50;
    int gpa = 20;

    // Loop until we exit game
    while (true) {
      // Multi-line strings use triple quotes
      System.out.println("""
      COLLEGE SIMULATOR VERSION 0.1.0 🏫

      Your stats are:""");

      System.out.println("  Energy: " + energy + "%");
      System.out.println("  GPA: " + gpa / 10.0);

      System.out.println("""

      In college, your can:
        - Work when you should be resting
        - Rest when you should be working
        - Go to office hours
      """);

      String choice = Game.getInput("Work", "Rest", "Office hours");

      // Switch is an alternative to if/else, allows us to match a
      // value with number of different options
      switch (choice) {
        case "Work":
          energy -= 10;
          gpa += 2;
          break; // Need break to avoid fallthrough

        case "Rest":
          gpa -= 4;
          energy += 5;
          break;

        case "Office hours":
          boolean isHelpful = random.nextBoolean();
          String result = isHelpful ? "HELPFUL" : "UNHELPFUL";
          System.out.println("Your trip to office hours was " + result + "\n");
          gpa += isHelpful ? 4 : -4;
          break;

        default:
          return; // Exit loop
      }

      if (energy <= 0 || gpa <= 0) {
        String cause = energy <= 0 ? "exhaustion" : "failure";
        System.out.println("You lose (" + cause + ")\n");

        if (!Game.getInput("Restart").equals("Restart")) {
          return; // Exit loop
        }

        // Reset stats
        energy = 50;
        gpa = 20;
      }
    }
  }
}

class Game {
  // We could put this definition in getInput, but then we'd be
  // re-creating a new Scanner object for each getInput call.
  // This way we can re-use the same Scanner object.
  static Scanner reader = new Scanner(System.in);

  // Static methods belong to a class itself, not an instance
  static void clear() {
    System.out.print("\033[H\033[2J"); // clear console
  }

  // Get input takes a flexible number of arguments
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
