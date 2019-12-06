package com.example.chess;

import java.util.ArrayList;

public class Piece implements Movable{

    private boolean white;

    public Piece(boolean white) {
        this.white = white;
    }



    public boolean isWhite() {
        return white;
    }

    public ArrayList<Coordinates> AllowedMoves(Coordinates coordinates , Position[][] board){
        ArrayList<Coordinates> allowedMoves = new ArrayList<>();
        Coordinates c;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                c = new Coordinates(i,j);
                allowedMoves.add(c);
            }
        }
        return allowedMoves;
    }
}
