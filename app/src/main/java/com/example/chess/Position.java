package com.example.chess;

public class Position {
    private Piece piece;


    public Position(Piece piece ) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;

    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

}