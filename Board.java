public class Board{
    private final char[][] squares = new char[8][8];
    public Board(){ // clears the board
        clear();
    }
    public void clear() { // method for clearing the board
        for(int r=0; r<8; r++){
            for(int c=0; c<8; c++){
                squares[r][c]= '.';
            }
        }
    }
    public char GetPosition(Position p){ //  gets the position using Position.java
        if (p == null){
            throw new IllegalArgumentException("Position cannot be null"); // error checking
        }
        if (!p.InBounds()){
            throw new IllegalArgumentException("Position out of bounds"); //error checking
        }
        
        return squares[p.row()][p.col()]; //return the position
    }
    public void SetPosition(Position p, char piece){ //set's the position for the piece
        if (p == null){
            throw new IllegalArgumentException("Position cannot be null"); // error checking
        }
        if (!p.InBounds()){
            throw new IllegalArgumentException("Position out of bounds"); // error checking
        }
        piece = squares[p.row()][p.col()]; // piece is set to the position
    }

}