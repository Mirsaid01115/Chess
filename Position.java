public record  Position(int row, int col) {
    public boolean InBounds(){
        return row >= 0 && row < 8 && col >= 0 && col < 8;//checking if the position is 8x8
    }
    public static Position ChessNotationToBoardCoordinate(String s){
        if( s==null ||  s.length() != 2){// checking to see if the coordinate is empty or not 2 characters
            throw new IllegalArgumentException("Bad Square: "+ s);
        }
        char letter = s.charAt(0); //setting letter equal to letters index ex: e4 -> e
        char number = s.charAt(1);  //setting number equal to the numbers index ex: e4 -> 4
        int col = letter -'a'; // extracting the column number from the letter
        int row = '8' - number; // extracting the number from the available size of 8 
        Position p = new Position(row, col); //setting the column and row coordinate as the new position
        if(!p.InBounds()){ // checking if the new position is within bounds
            throw new IllegalArgumentException("Bad Square "+ s);
        }
        return p; //returning the position
        
    }
    public String BoardCoordinateToChessNotation(){ // converting board coordinate to chess notation
        char letter = (char)('a' + col);
        char number = (char)('8' + row);

        return ""+ letter + number;
    }

}
