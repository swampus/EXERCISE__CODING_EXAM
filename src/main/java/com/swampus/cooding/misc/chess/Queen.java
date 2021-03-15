package com.swampus.cooding.misc.chess;

public class Queen extends AbstractFigure implements Figure {

    public Queen(ChessFigureSide chessFigureSide) {
        super(chessFigureSide);
    }

    @Override
    public ChessFigureSide getSide() {
        return chessFigureSide;
    }

    @Override
    public Long getValue() {
        return 9L;
    }
}
