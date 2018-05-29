package com.tom.ButterEggsAndCheese

//V0.2

enum class Piece{
	Empty, Cross, Circle	
}

class Board{
	//Instantiate the board
	private val board = Array<Piece>(9, {Piece.Empty})
	
	//Check for piece on given position
	operator fun get(position: Int): Piece = board[position]
	
	//Set piece on given position
	operator fun set(position: Int, piece: Piece): Unit{
		board[position] = piece		
	}	
}

