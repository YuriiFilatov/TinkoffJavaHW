package edu.hw1;

public class Task8 {

    static final int BOARD_SIZE = 8;

    private Task8() {
    }

    private static boolean checkBoarders(int x, int y) {
        return (x >= 0 && x < BOARD_SIZE && y >= 0 && y < BOARD_SIZE);
    }

    public static boolean knightBoardCapture(int[][] board) {

        final int[] MOVES = {1, 2, 1, -2, -1, 2, -1, -2, 2, 1, 2, -1, -2, 1, -2, -1};

        for (int x = 0; x < BOARD_SIZE; x++) {
            for (int y = 0; y < BOARD_SIZE; y++) {
                if (board[x][y] == 1) {
                    for (int position = 0; position < MOVES.length; position += 2) {
                        if (checkBoarders(x + MOVES[position * 2], y + MOVES[position * 2 + 1])) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
