package com.tom.ButterEggsAndCheese

class Player{
	init{
		//Constructor body goes here
	}	
	
	//Declaring name property
	var Name:String = ""
	get() = field.toUpperCase()
	set(value){
		field = value
	}
	
	//Set player piece
	var PlayerPiece: Piece = Piece.Empty
	get() = field
	set(value){
		field = value
	}
	
	//Declaring wether the player is a human or an android
	var IsAndroid:Boolean = false
	get() = field
	set(value){
		field = value
	}		
}

