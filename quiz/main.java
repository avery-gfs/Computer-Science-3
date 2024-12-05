import java.util.*;

public class Main {
  public static void main(String[] args) {
    var quiz = new Quiz();

    quiz.addQuestion("alabama", "montgomery");
    quiz.addQuestion("alaska", "juneau");
    quiz.addQuestion("arizona", "phoenix");
    quiz.addQuestion("arkansas", "little rock");
    quiz.addQuestion("california", "sacramento");
    quiz.addQuestion("colorado", "denver");
    quiz.addQuestion("connecticut", "hartford");
    quiz.addQuestion("delaware", "dover");
    quiz.addQuestion("florida", "tallahassee");
    quiz.addQuestion("georgia", "atlanta");

    quiz.runQuiz();
  }
}

// The UI class contains code for getting user input
// and clearing the console

public class UI {
  static Scanner scanner = new Scanner(System.in);

  static void clearScreen() {
    // Clear the console

    // Your code goes here !!
  }

  static String getResponse() {
    // Prompt the user to enter a response and return
    // the resulting string

    // Your code goes here !!
    return null;
  }
}

public class Question {
  // Keep track of the question and answer text, as
  // well as the response from the user

  String question;
  String answer;
  String response;

  public Question(String question, String answer) {
    // Your code goes here !!
  }

  void ask() {
    // Display the question text, get and store the user response

    // Your code goes here !!
  }

  boolean isCorrect() {
    // Check if the response is correct

    // Your code goes here !!
    return false;
  }

  public String showResult() {
    // Display the question text, the user response,
    // the status (Correct or Incorrect), and the answer if
    // the response is incorrect

    var result = "";

    // Your code goes here !!

    return result;
  }
}

// Quiz keep track of a list of questions and handles
// handles asking the questions sequentially

public class Quiz {
  List<Question> questions = new ArrayList<>();

  void runQuiz() {
    // Have the user respond to each question, then
    // print out the results for each question and
    // calculate the number of correct responses

    // Your code goes here !!
  }

  void addQuestion(String question, String answer) {
    // Add a new question to the quiz for
    // the given question and answer pair

    // Your code goes here !!
  }
}
