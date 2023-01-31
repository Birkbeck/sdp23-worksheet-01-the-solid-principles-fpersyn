import java.util.ArrayList;
import java.util.List;

public class Board {
    List<String> spots;

    public Board() {
        this.spots = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            this.spots.add(String.valueOf(i));
        }
    }
}
