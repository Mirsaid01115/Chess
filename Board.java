public class Board{
    private final char[][] squares = new char[8][8];
    public Board(){
        clear();
    }
    public void clear() {
        for(int r=0; r<8; r++){
            for(int c=0; c<8; c++){
                squares[r][c]= '.';
            }
        }
    }
    public char GetPosition(Position p){
        if (p == null){
            throw new IllegalArgumentException("Position cannot be null");
        }
        if (!p.InBounds()){
            throw new IllegalArgumentException("Position out of bounds");
        }
        
        return squares[p.row()][p.col()];
    }
    public void SetPosition(Position p, char piece){
        if (p == null){
            throw new IllegalArgumentException("Position cannot be null");
        }
        if (!p.InBounds()){
            throw new IllegalArgumentException("Position out of bounds");
        }
        piece = squares[p.row()][p.col()];
    }

}