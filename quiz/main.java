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

class Question {
  // Keep track of the question and answer text, as
  // well as the response from the user

  String question;
  String answer;
  String response;

  // Share one scanner instance between all Questions
  static Scanner scanner = new Scanner(System.in);

  Question(String question, String answer) {
    // Your code goes here !!
  }

  void ask() {
    // Display the question text, get and store the user response
    
    // Your code goes here !!

    // Prompt the user to enter a response and return
    // the resulting string
    
    // Your code goes here !!
  }

  boolean isCorrect() {
    // Check if the response is correct
    
    return false; // Your code goes here !!
  }

  public String toString() {
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

class Quiz {
  List<Question> questions = new ArrayList<>();

  void runQuiz() {
    // Have the user respond to each question, then
    // print out the results for each question and
    // calculate the number of correct responses

    var score = 0;
    var total = questions.size();

    for (var question : questions) {
      // Ask each question and update the score

      // Your code goes here !!

      // Clear the console
      System.out.print("\033[H\033[2J");
      System.out.flush();
    }

    for (var question : questions) {
      // Show the results for each question and submission

      // Your code goes here !!
    }

    System.out.println("Score: " + score + " of " + total);
  }

  void addQuestion(String question, String answer) {
    // Add a new question to the quiz for
    // the given question and answer pair
    
    // Your code goes here !!
  }
}
