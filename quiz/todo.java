import java.util.*;

public class Main {
  public static void main(String[] args) {
    var todo = new ToDo();
    todo.addTask("Water dog");
    todo.addTask("Feed dog");
    todo.addTask("Water plants");
    todo.markDone("Feed dog");
    todo.removeTask("Water dog");
    System.out.println(todo);
  }
}

class Task {
  String label;
  boolean isDone = false;

  Task(String label) {
    this.label = label;
  }

  boolean matches(String label) {
    return this.label.equals(label);
  }

  public String toString() {
    var marker = isDone ? "[x] " : "[ ] ";
    return marker + label;
  }
}

class ToDo {
  List<Task> tasks = new ArrayList<>();

  void addTask(String label) {
    tasks.add(new Task(label));
  }

  void markDone(String label) {
    for (var task : tasks) {
      if (task.matches(label)) {
        task.isDone = true;
      }
    }
  }

  void removeTask(String label) {
    List<Task> newTasks = new ArrayList<>();

    for (var task : tasks) {
      if (!task.matches(label)) {
        newTasks.add(task);
      }
    }

    tasks = newTasks;
  }

  public String toString() {
    var count = tasks.size();
    var remaining = 0;
    var result = "";

    for (var task : tasks) {
      result += task + "\n";
      remaining += task.isDone ? 0 : 1;
    }

    result += count + " tasks, " + remaining + " remaining";
    return result;
  }
}
