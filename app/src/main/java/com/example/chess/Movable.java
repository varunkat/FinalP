package com.example.chess;

import java.util.ArrayList;



public interface Movable {
    public ArrayList<Coordinates> AllowedMoves(Coordinates coordinates, Position[][] board);
}
