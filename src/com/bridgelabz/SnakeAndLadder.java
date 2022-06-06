package com.bridgelabz;

public class SnakeAndLadder 
{
	    private static final int NO_PLAY = 0;
	    private static final int LADDER = 1;
	    private static final int SNAKE = 2;
	    private static final int MAX_POSITION = 100;
	    private static final int MIN_POSITION = 0;
	    
	   public static int positionA = 0;
       public static int positionB = 0;

	    public static int getRandomInteger(int maximum, int minimum){
	        return ((int) (Math.random()*(maximum - minimum))) + minimum;
	    }
	    
	    public static int PlayerA() {
	    	System.out.println("Player A is Rolling Dice");
	    	int dice = getRandomInteger(7, 1);
	    	System.out.println("dice for A :"+dice);
	    	
	    	int checkPlay = (int) Math.floor(Math.random()*10)%3;
	    	System.out.println("checkPlay for A : " + checkPlay);
	    	
	    	switch(checkPlay) {
	    	case NO_PLAY:
	    		break;
	    		
	    	case LADDER:
	    		positionA += dice;
	    		if(positionA > MAX_POSITION) {
	    			positionA = positionA-dice;
	    		}
	    		if(positionA == MAX_POSITION) {
	    			//System.out.println("Position of A : "+ positionA);
	    			return positionA;
	    		}
	    		PlayerA();
	    		break;
	    		
	    	case SNAKE:
	    		positionA -= dice;
	    		if(positionA < MIN_POSITION) {
	    			positionA =0;
	    		}
	    		break;
	    	}
	    //	System.out.println("Position of A : " + positionA);
	    	return positionA;
	    }
	    
	    public static  int PlayerB() {
	    	System.out.println("Player B is Rolling Dice");
	    	int dice = getRandomInteger(7, 1);
	    	System.out.println("dice for B : "+ dice);
	    	
	    	int checkPlay = (int) Math.floor(Math.random()*10)%3;
	    	System.out.println("checkPlay for B : " +checkPlay);
	    	
	    	switch(checkPlay) 
	    	{
	    	case NO_PLAY:
	    		break;
	    		
	    	case LADDER:
	    		positionB += dice;
	    		if(positionB > MAX_POSITION) {
	    		   positionB = positionB-dice;
	    		}
	    		if(positionB == MAX_POSITION) {
	    		//	System.out.println("Position of B : "+ positionB);
	    			return positionB;
	    		}
	    		PlayerB();
	    		break;
	    		
	    	case SNAKE:
	    	    positionB -= dice;
	    	    if(positionB < MIN_POSITION) {
	    	    	positionB =0;
	    	    }
	    	    break;
	    	}
	    	System.out.println("positon of B : "+ positionB);
	    	return positionB;
	    }
	    
	    public static void main(String[] args) {
			
	    	System.out.println("--Welcome to the game of SNAKES AND LADDERS--");
	    	
	    	int positionOfA = 0, positionOfB = 0;
	    	
	    	while(positionOfA < MAX_POSITION || positionOfB < MAX_POSITION) {
	    		
	    		positionOfA = PlayerA();
	    		if(positionOfA == MAX_POSITION) {
	    			System.out.println("position of A : " + positionOfA);
	    			System.out.println("position of B : " + positionOfB);
	    			System.out.println(" ----Player A  WON-----");
	    			System.exit(0);
	    		}
	    		
	    		positionOfB = PlayerB();
	    		
	    		if(positionOfB == MAX_POSITION) {
	    			
	    			System.out.println("position of A : " + positionOfA);
	    			System.out.println("Position of B : " + positionOfB);
	    			System.out.println("----Player B WON-----");
	    			System.exit(0);
	    		}
	    	}
		}

	  
}
