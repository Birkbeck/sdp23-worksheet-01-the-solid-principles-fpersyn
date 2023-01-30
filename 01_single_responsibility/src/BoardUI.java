import java.util.ArrayList;
import java.util.List;

public class BoardUI {
    Board board;
    
    public BoardUI(Board board) {
        this.board = board;
    }

    public List<String> firstRow() {
        List<String> firstRow = new ArrayList<>();
        firstRow.add(this.board.spots.get(0));
        firstRow.add(this.board.spots.get(1));
        firstRow.add(this.board.spots.get(2));
        return firstRow;
    }

    public List<String> secondRow() {
        List<String> secondRow = new ArrayList<>();
        secondRow.add(this.board.spots.get(3));
        secondRow.add(this.board.spots.get(4));
        secondRow.add(this.board.spots.get(5));
        return secondRow;
    }

    public List<String> thirdRow() {
        List<String> thirdRow = new ArrayList<>();
        thirdRow.add(this.board.spots.get(6));
        thirdRow.add(this.board.spots.get(7));
        thirdRow.add(this.board.spots.get(8));
        return thirdRow;
    }
    
    public void display() {
        String formattedFirstRow = this.board.spots.get(0) + " | " + this.board.spots.get(1) + " | " + this.board.spots.get(2) + "\n"
                + this.board.spots.get(3) + " | " + this.board.spots.get(4) + " | " + this.board.spots.get(5) + "\n"
                + this.board.spots.get(6) + " | " + this.board.spots.get(7) + " | " + this.board.spots.get(8);
        System.out.print(formattedFirstRow);
    }
}
