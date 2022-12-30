package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0,0);

        //above
        p.setValues(position.getRow() - 1, position.getColumn());
        setTrueInMatPossibleMoves(mat, p);

        //above
        p.setValues(position.getRow() + 1, position.getColumn());
        setTrueInMatPossibleMoves(mat, p);

        //left
        p.setValues(position.getRow(), position.getColumn() - 1);
        setTrueInMatPossibleMoves(mat, p);

        //right
        p.setValues(position.getRow(), position.getColumn() + 1);
        setTrueInMatPossibleMoves(mat, p);

        //nw
        p.setValues(position.getRow() - 1, position.getColumn() - 1);
        setTrueInMatPossibleMoves(mat, p);

        //ne
        p.setValues(position.getRow() - 1, position.getColumn() + 1);
        setTrueInMatPossibleMoves(mat, p);

        //sw
        p.setValues(position.getRow() + 1, position.getColumn() - 1);
        setTrueInMatPossibleMoves(mat, p);

        //se
        p.setValues(position.getRow() + 1, position.getColumn() + 1);
        setTrueInMatPossibleMoves(mat, p);

        return mat;
    }
}
