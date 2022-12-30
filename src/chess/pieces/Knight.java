package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {
    public Knight(Board board, Color color) {
        super(board, color);
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0,0);

        p.setValues(position.getRow() - 1, position.getColumn() - 2);
        setTrueInMatPossibleMoves(mat, p);

        p.setValues(position.getRow() - 2, position.getColumn() - 1);
        setTrueInMatPossibleMoves(mat, p);

        p.setValues(position.getRow() - 2, position.getColumn() + 1);
        setTrueInMatPossibleMoves(mat, p);

        p.setValues(position.getRow() - 1, position.getColumn() + 2);
        setTrueInMatPossibleMoves(mat, p);

        p.setValues(position.getRow() + 1, position.getColumn() + 2);
        setTrueInMatPossibleMoves(mat, p);

        p.setValues(position.getRow() + 2, position.getColumn() + 1);
        setTrueInMatPossibleMoves(mat, p);

        p.setValues(position.getRow() + 2, position.getColumn() - 1);
        setTrueInMatPossibleMoves(mat, p);

        p.setValues(position.getRow() + 1, position.getColumn() - 2);
        setTrueInMatPossibleMoves(mat, p);

        return mat;
    }

    @Override
    public String toString() {
        return "N";
    }
}
