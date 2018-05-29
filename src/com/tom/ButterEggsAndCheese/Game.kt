package com.tom.ButterEggsAndCheese

class game{
	
	val player1 = Player()
	val player2 = Player()
	val board = Board()
	
	init{
		player1.Name = "Tom"
		player1.PlayerPiece = Piece.Cross
		player1.IsAndroid = false
		
		player2.Name = "Andy"
		player2.PlayerPiece = Piece.Circle
		player2.IsAndroid = true		
		
	}
	
	fun main(args: Array<String>){
		board[1] = player1.PlayerPiece
		board[5] = player2.PlayerPiece
		
		println("Player 1:  $player1.Name Plays: $player1.PlayerPiece")
		println("Player 2:  $player2.Name Plays: $player2.PlayerPiece")
	}
			
}

