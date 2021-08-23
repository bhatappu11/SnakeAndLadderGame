package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
		public static final int NO_PLAY=0;
		public static final int LADDER=1;
		public static final int SNAKE=2;
		public static void main(String[] args) {
			System.out.println("Welcome to snake and ladder game");
			System.out.println("The Player Starts at Position 0");
			int currentPosition1=0,numberOnDice=0,count=0;
			while(currentPosition1<100) {
			numberOnDice=(int)((Math.random()*100)%6)+1;
			System.out.println("Number on dice "+numberOnDice);
			int option=(int)(Math.random()*100)%3;
			count++;
			switch(option) {
			case NO_PLAY:
			System.out.println("Option is No Play");
			break;
			case LADDER:
			System.out.println("Option is Ladder");
			currentPosition1=currentPosition1+numberOnDice;
			break;
			case SNAKE:
			System.out.println("Option is Snake");
			currentPosition1=currentPosition1-numberOnDice;
			break;
			}
			if(currentPosition1<0) 
			{
				currentPosition1=0;
			}	
			if(currentPosition1>100) 
			{
				currentPosition1=currentPosition1-numberOnDice;
			}
			if(currentPosition1==100)
			{
				System.out.println("player one done playing");
				break;
			}
			}
			System.out.println("Current Position of Player 1 and turns taken: "+currentPosition1+" "+count);
		

}
}
