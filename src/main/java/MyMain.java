public class MyMain {
    // This method returns true/false if there 
    // was a boat the specified coordinates. This
    // method also prints out an appropriate message
    public static boolean hit(boolean[][] board, int row, int col) { 
        // YOUR CODE HERE
        String msg = (board[row][col]) ? "There was a hit!": "You missed a boat!";
        System.out.println(msg);
        return board[row][col];
    }


    // Places a boat onto the board
    // The top-left piece of the board is located at (row, col)
    // The remaining pieces are placed in the direction given
    // by the direction input
    public static boolean[][] placeBoat(boolean[][] board, String direction, int boatLength, int row, int col) { 
        // YOUR CODE HERE
        if (direction.equals("right")){
            for (int i = col; i < col + boatLength; i ++){
                board[row][i] = true;
            }
        }
        else if (direction.equals("down")){
            for (int i = row; i < row + boatLength; i ++){
                board[i][col] = true;
            }
        }
        return board;
    }

    // Returns true if the every row in the 2D array
    // is in both alphabetical order and in order of 
    // increasing length
    // You may assume that all Strings are lowercase 
    public static boolean inOrder(String[][] words) { 
        // YOUR CODE HERE
        for (int row = 0; row < words.length; row ++){
            for (int col = 1; col < words[0].length; col ++){
                if (words[row][col].length() < words[row][col - 1].length()){
                    return false;
                }
                if (words[row][col].charAt(0) < words[row][col - 1].charAt(0)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
