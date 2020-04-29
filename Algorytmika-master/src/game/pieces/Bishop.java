package game.pieces;

import game.Board;
import game.Game;
import game.Movement;
import game.Position;

public class Bishop extends Piece {
    public Bishop(Color color) {
        super(color, "bishop");
    }

    @Override
    public boolean isValidMovement(Game game, Movement movement) {
        if (Math.abs(movement.getRowOffset()) == Math.abs(movement.getColOffset())) {
            return true;
        }
        Board board = game.getBoard();
        return false;
    }

}