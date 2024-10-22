import java.util.*;

class Main {
  public static void main(String[] args) {
    Game game = new Game();
    game.start();
  }
}

class Game {
  void start() {
    System.out.println("""
    Center and think about your linner light.

    Do I have the urge to speak?
    """);

    String choice = getInput("Yes", "No");

    switch (choice) {
      case "Yes":
        community();
        return;
      case "No":
        recenter();
        return;
    }
  }

  void recenter() {
    System.out.println("Return to center.\n");
    String choice = getInput("Return to center");

    switch (choice) {
      case "Return to center":
        start();
        return;
    }
  }

  void community() {
    System.out.println("Is the message for the good of the community?\n");
    String choice = getInput("Yes", "No");

    switch (choice) {
      case "Yes":
        revelation();
        return;
      case "No":
        recenter();
        return;
    }
  }

  void revelation() {
    System.out.println("Is the message a new idea or revelation?\n");
    String choice = getInput("Yes", "No");

    switch (choice) {
      case "Yes":
        politics();
        return;
      case "No":
        recenter();
        return;
    }
  }

  void politics() {
    System.out.println("Is the message free from politics and lecture?\n");
    String choice = getInput("Yes", "No");

    switch (choice) {
      case "Yes":
        compelled();
        return;
      case "No":
        recenter();
        return;
    }
  }

  void compelled() {
    System.out.println("Do I feel compelled to speak?\n");
    String choice = getInput("Yes", "No");

    switch (choice) {
      case "Yes":
        speak();
        return;
      case "No":
        recenter();
        return;
    }
  }

  void speak() {
    System.out.println("Speak.\n");
    recenter();
  }
}

class Game {
  static void clear() {
    System.out.print("\033[H\033[2J"); // clear console
  }

  static String getInput(String ...options) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Your options are:\n");

    for (int i = 0; i < options.length; i++) {
      System.out.println("(" + (i + 1) + ") " + options[i]);
    }

    System.out.println("(0) Exit");

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

