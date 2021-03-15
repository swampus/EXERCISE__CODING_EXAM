package com.swampus.cooding.misc.chess;

public class Knight extends AbstractFigure implements Figure {


    public Knight(ChessFigureSide chessFigureSide) {
        super(chessFigureSide);
    }

    @Override
    public ChessFigureSide getSide() {
        return chessFigureSide;
    }

    @Override
    public Long getValue() {
        return 3L;
    }
}
