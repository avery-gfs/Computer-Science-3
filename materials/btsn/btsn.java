class BTSN {
  public static void main(String[] args) {
    System.out.println("CS 3 Info");

    var name = "Avery Nortonsmith";
    var email = "anortonsmith@germantownfriends.org";

    System.out.println(name);
    System.out.println(email);

    var description = """
    This class will explore some of the more advanced topics and questions in software engineering.
    How can we use algorithmic analysis to predict how our code will perform? What techniques do
    massive software engineering projects with thousands of collaborators use to avoid bugs? When
    does using self-reference simplify our code and when does it make it more complex? How does a
    computer represent text, numbers, and directory structures internally? 
    """;

    System.out.println(description.replace("\n", " "));

    String[] topics = {
      "Recursion",
      "Static typing and type systems",
      "Object oriented, functional, and asynchronous programming",
      "Performance analysis and optimization",
      "Design principles",
      "Programming language internals",
      "Programming language development",
      "Algorithms",
      "Data structures",
    };

    System.out.println("- " + String.join("\n- ", topics));
  }
}

// Given a "maze" string, where `A` is the start, `B` is the end, and `█`s are
// walls, find a path from `A` to `B`, and mark the path with `x` characters.

// █████████████████████████████████
// █A█     █B█xxxxx    █xxx      █ █
// █x█ ███ █x█x███x█████x█x█████ █ █
// █x█ █ █ █xxx  █xxxxxxx█x█xxx█   █
// █x█ █ █ ███████████ ███x█x█x█████
// █x  █ █     █     █ █ █xxx█xxxxx█
// █x███ █████ █ ███ █ █ ███████ █x█
// █x█xxxxx█ █ █ █ █ █       █ █ █x█
// █x█x███x█ █ █ █ █ █████████ ███x█
// █x█xxx█xxx█ █   █   █       █xxx█
// █x███x███x█ ███ ███ █ ███████x█ █
// █x█xxx█ █x█     █ █   █xxx█xxx█ █
// █x█x███ █x███████ █████x█x█x███ █
// █x█xxx█ █xxxxxxx█xxx█xxx█x█x█ █ █
// █x███x█ ███████x█x█x█x███x█x█ █ █
// █xxxxx█        xxx█xxx█  xxx█   █
// █████████████████████████████████

import java.util.*;
import java.util.stream.Stream;

class Maze {
  static int height, width;
  static char[][] board;

  public static void main(String[] args) {
    String maze = """
    █████████████████████████████████
    █A█     █B█         █         █ █
    █ █ ███ █ █ ███ █████ █ █████ █ █
    █ █ █ █ █     █       █ █   █   █
    █ █ █ █ ███████████ ███ █ █ █████
    █   █ █     █     █ █ █   █     █
    █ ███ █████ █ ███ █ █ ███████ █ █
    █ █     █ █ █ █ █ █       █ █ █ █
    █ █ ███ █ █ █ █ █ █████████ ███ █
    █ █   █   █ █   █   █       █   █
    █ ███ ███ █ ███ ███ █ ███████ █ █
    █ █   █ █ █     █ █   █   █   █ █
    █ █ ███ █ ███████ █████ █ █ ███ █
    █ █   █ █       █   █   █ █ █ █ █
    █ ███ █ ███████ █ █ █ ███ █ █ █ █
    █     █           █   █     █   █
    █████████████████████████████████
    """;

    String[] lines = maze.trim().split("\n");    
    board = Stream.of(lines).map(line -> line.toCharArray()).toArray(char[][]::new);
    
    for (int r = 0; r < lines.length; r++) {
      for (int c = 0; c < lines[0].length(); c++) {
        if (board[r][c] == 'A') {
          search(r, c);
          return;
        }
      }
    }
  }

  static boolean search(int r, int c) {
    try { Thread.sleep(20); } catch (InterruptedException err) {}
    System.out.print("\033c");

    for (var row : board) {
      System.out.println(new String(row));
    }

    switch (board[r][c]) {
      case 'B': return true;
      case '█':
      case 'x': return false;
    }

    if (board[r][c] != 'A') { board[r][c] = 'x'; }

    boolean result = search(r - 1, c) || search(r, c + 1) || search(r + 1, c) || search(r, c - 1);

    if (board[r][c] != 'A') { board[r][c] = ' '; }

    return result;
  }
}
