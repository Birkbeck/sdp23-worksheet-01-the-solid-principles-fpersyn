import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {

    @Test
    public void testBoardHasNineSpots() {
        Board board = new Board();
        assertEquals(9, board.spots.size());
    }
}
