package com.swampus.cooding.misc.chess;

public class Pound extends AbstractFigure implements Figure {


    public Pound(ChessFigureSide chessFigureSide) {
        super(chessFigureSide);
    }

    @Override
    public ChessFigureSide getSide() {
        return chessFigureSide;
    }

    @Override
    public Long getValue() {
        return 1L;
    }
}
