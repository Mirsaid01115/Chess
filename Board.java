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


}