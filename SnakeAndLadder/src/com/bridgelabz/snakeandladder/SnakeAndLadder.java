package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder game");
		System.out.println("The Player Starts at Position 0");
		int currentPosition1=0,numberOnDice=0;
		numberOnDice=(int)((Math.random()*100)%6)+1;
		System.out.println("Number on dice "+numberOnDice);
	}

}
