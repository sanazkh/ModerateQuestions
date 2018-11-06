package com.sjsu.sanaz;

import java.util.Hashtable;

/**
 * Created by sanazk on 10/4/18.
 */
public class TicaTacToe {
    // If we call hasWinner many times
    enum Piece{
        Empty,
        Red,
        Blue
    }

    // HashTable<String, Piece> which has all boards and the winner for each of them
    Hashtable<String, Piece> boards = new Hashtable<>();
    Piece hasWinner(Piece[][] board){
        String sboard = convertBoard(board);
        return boards.get(sboard);
    }

    String convertBoard(Piece[][] board){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                sb.append(board[i][j].ordinal());
            }
        }
        return sb.toString();
    }

    // If we know the last move

    Piece hasWinner(Piece[][] board, int row, int column){
        if(board.length != board[0].length){
            return Piece.Empty;
        }

        if(hashWonRow(board, row) || hasWonColumn(board, column)){
            return board[row][column];
        }

        if(row == column && hashWonDiagonal(board, 1)){
            return board[row][column];
        }

        if(row == (board.length - column - 1) && hashWonDiagonal(board, -1)){
            return board[row][column];
        }

        return Piece.Empty;
    }

    boolean hashWonRow(Piece[][] board, int row){
        for(int i = 1; i < board[0].length; i++){
            if(board[row][i] != board[row][0]){
                return false;
            }
        }
        return true;
    }

    boolean hasWonColumn(Piece[][] board, int column){
        for(int i = 1; i < board.length; i++){
            if(board[i][column] != board[column][0]){
                return false;
            }
        }
        return true;
    }

    boolean hashWonDiagonal(Piece[][] board, int direction){
        if(direction == 1){
            for(int i = 1; i < board.length; i++){
                if(board[i][i] != board[0][0]){
                    return false;
                }
            }
        }else if(direction == -1){
            for(int i = 1; i < board.length; i++){
                if(board[i][board.length - 1 - i] != board[0][board.length-1]){
                    return false;
                }
            }
        }
        return true;
    }

    // Design for a 3 * 3 board
    // We just check each row, each column and diagonal to find a winner
    boolean hasWinner(Piece p1, Piece p2, Piece p3){
        if(p1 == Piece.Empty){
            return false;
        }

        return p1 == p2 && p2 == p3;
    }

    Piece hasWon(Piece[][] board){
        for(int i = 0; i < board.length; i++){
            // Check row
            if(hasWinner(board[i][0], board[i][1], board[i][2])){
                return board[i][0];
            }

            // Check column
            if(hasWinner(board[0][i], board[1][i], board[2][i])){
                return board[0][i];
            }

            // Check diagonal
            if(hasWinner(board[0][0], board[1][1], board[2][2])){
                return board[0][0];
            }
            if(hasWinner(board[0][2], board[1][1], board[2][0])){
                return board[0][2];
            }
        }
        return Piece.Empty;
    }

    // Design for n * n board
    Piece hasWonNN(Piece[][] board){
        if(board.length != board[0].length){
            return Piece.Empty;
        }

        Piece first;

        // Check rows
        for(int i = 0; i < board.length; i++){
            first = board[i][0];
            if(first == Piece.Empty){
                continue;
            }
            for(int j = 1; j < board.length; j++){
                if(board[i][j] != first){
                    break;
                }else if(j == board.length - 1){
                    return first;
                }
            }
        }

        // Check columns
        for(int i = 0; i < board.length; i++){
            first = board[0][i];
            if(first == Piece.Empty){
                continue;
            }
            for(int j = 1; j < board.length; j++){
                if(board[j][i] != first){
                    break;
                }else if(j == board.length - 1){
                    return first;
                }
            }
        }

        // Check Diagonals
        first = board[0][0];
        if(first != Piece.Empty){
            for(int i = 1; i < board.length; i++){
                if(board[i][i] != first){
                    break;
                }else if(i == board.length - 1){
                    return first;
                }
            }
        }

        first = board[0][board.length - 1];
        if(first != Piece.Empty){
            for(int i = 1; i < board.length - 1; i++){
                if(board[i][board.length - i - 1] != first){
                    break;
                }else if(i == board.length - 1){
                    return first;
                }
            }
        }
        return Piece.Empty;
    }
}
