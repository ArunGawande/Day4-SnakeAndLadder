package com.bridgelabz;

public class SnakeAndLadder 
{
	public static int getRandomInteger(int maximum,int minimum)
	{
		return (int) (( (Math.random()*(maximum-minimum)))+minimum);
	}
	
     public static void main(String[] args) 
    {
	   System.out.println("---Welcome to the game Snake And Ladder---");
	   
	   int startPositionA = 0;
	   int dice = getRandomInteger(7,1);
	   System.out.println(dice);
	   
    }
}
