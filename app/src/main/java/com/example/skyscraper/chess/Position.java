package com.example.skyscraper.chess;

import com.example.skyscraper.chess.Pieces.Piece;

/**
 * Created by skyscraper on 03-10-2017
 */

public class Position {
    private Piece piece;


    Position(Piece piece ) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;

    }

    void setPiece(Piece piece) {
        this.piece = piece;
    }

}
