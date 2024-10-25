import java.util.*;

class Main {
  public static void main(String[] args) {
    // Initial 2x0 tilings
    List<List<Boolean>> oldBoards = List.of(List.of());
    
    // Initial 2x1 tilings
    List<List<Boolean>> currentBoards = List.of(List.of(true));

    // Do 4 rounds of updates to generate the tilings for a 2x5 board

    for (int n = 0; n < 4; n++) {
      List<List<Boolean>> newBoards = new ArrayList<>();

      // Fill in the code here to generate newBoards, the next list of board tilings

      oldBoards = currentBoards;
      currentBoards = newBoards;
    }

    for (List<Boolean> board : currentBoards) {
      System.out.println(showBoard(board));
    }
  }

  // true represents a vertical bar, false represents two horizontal bars
  // Example: `showBoard(List.of(true, false, false, true))` returns this:
  // 
  // ┌─┬───┬───┬─┐
  // │ ├───┼───┤ │
  // └─┴───┴───┴─┘

  static String showBoard(List<Boolean> board) {
    String[] rows = { "", "", "" };

    rows[0] += "┌";
    rows[1] += board.getFirst() ? "│": "├";
    rows[2] += "└";

    for (int index = 0; index < board.size(); index++) {
      boolean tile = board.get(index);

      if (tile) {
        rows[0] += "─";
        rows[1] += " ";
        rows[2] += "─";
      } else {
        rows[0] += "───";
        rows[1] += "───";
        rows[2] += "───";
      }

      if (index < board.size() - 1) {
        boolean nextTile = board.get(index + 1);
        rows[0] += "┬";

        if (tile) {
          rows[1] += nextTile ? "│" : "├";
        } else {
          rows[1] += nextTile ? "┤" : "┼";
        }

        rows[2] += "┴";
      }
    }

    rows[0] += "┐";
    rows[1] += board.getLast() ? "│": "┤";
    rows[2] += "┘";

    return String.join("\n", rows);
  }
}
