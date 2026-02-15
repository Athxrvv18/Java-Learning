public class interfacee {
    public static void main(String[] args) {
        King k1 = new King();
        k1.moves();
        Pawn p1 = new Pawn();
        p1.moves();
        
    }
}

interface ChessPlayer {

    void moves();
}

class King implements ChessPlayer {

    public void moves() {
        System.out.println("horizontally, vertically, or diagonally");
    }
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("horizontally, vertically, or diagonally—in a single move");
    }
}

class Pawn implements ChessPlayer {
    public void moves() {
        System.out.println(
                "straight forward one square, or two squares on their very first move, but capture one square diagonally forward");
    }
}