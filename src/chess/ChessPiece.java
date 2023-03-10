package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {
    private Color color;
    private int moveCount;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getMoveCount() {
        return moveCount;
    }

    protected void increaseMoveCount() {
        moveCount++;
    }

    protected void decreaseMoveCount() {
        moveCount--;
    }

    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(position);
    }

    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }

    protected boolean verifyIfNextPositionIsAOpponent(boolean[][] mat, Position position) {
        if (getBoard().positionExists(position) && isThereOpponentPiece(position)) {
            mat[position.getRow()][position.getColumn()] = true;
        }
        return false;
    }

    protected boolean canMove(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }

    protected boolean setTrueInMatPossibleMoves(boolean[][] mat, Position position) {
        if (getBoard().positionExists(position) && canMove(position)) {
            mat[position.getRow()][position.getColumn()] = true;
        }
        return false;
    }
}
