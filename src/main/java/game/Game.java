package game;

import functionality.BoardInitializer;
import model.Board;
import model.DoubleBoard;
import model.CellSet;
import model.Score;

import java.util.List;

public class Game {
    private DoubleBoard board;
    private Score score;

    public Game(String boardName) {
        this.board = new BoardInitializer().initializeBoard(boardName);
    }


    private List<CellSet> validate() {
        //TODO
        //Compare boards and return difference
        return null;
    }

    public Board getUserBoard() {
        return board.getUserBoard();
    }
}