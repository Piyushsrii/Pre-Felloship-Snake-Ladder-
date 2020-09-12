#### Welcome in Snake & Ladder Simulation #####
    import java.util.Random;
    public class SnakeLadderSimulation
    {
         			static int player1Postion=0;
    static int player2Postion=0;
    static int player1NoDiceRoll=0;
    static int player2NoDiceRoll=0;
    static Random random=new Random();
    static void startPosition()
    {
    System.out.println("Player1 starting from position 0");
    System.out.println("Player2 starting from position 0");
    }
    public static int rollDie()
    {
         int dieNum=random.nextInt(6)+1;
         return dieNum;
    }
    public static int getOption()
    {
        int RandomCheck=random.nextInt(3)+1;
        return RandomCheck;
    }
    public static void player2Wining()
    {
        int count=0;
        while(player1Postion < 100 && player2Postion < 100 )
      {
           int random1To6=rollDie();
           int RandomNum=getOption();
	   if(count%2==0)
           {
                count++;
                player1NoDiceRoll++;
  	        if(RandomNum == 1 && player1Postion>random1To6) //ignore the negative value
                {
                 System.out.println("you stand on the snake, you will move back by = " +random1To6);
		 player1Postion-=random1To6;
		 System.out.println("you are in "+player1Postion);
	        }
			else if(RandomNum == 2)
			{
				System.out.println("No Play");
				System.out.println("you are in "+player1Postion);
                        }
			else
			{
				player1Postion +=random1To6;
				if(player1Postion > 100)
				{
					player1Postion -=random1To6;
				}
				else {
					System.out.println("congrats you have incremented by "+random1To6);
					System.out.println("you are under "+player1Postion);
				      }
		        	}
		        	if(player1Postion == 100)
			        {
				System.out.println("congrats player1 won !! you getting your winning position");
                                }
	       	}
                else{
                 count++;
                 player2NoDiceRoll++;
  	         if(RandomNum == 1 && player2Postion>random1To6)//ignore the negative value
                 {
                 System.out.println("you stand on the snake, you will move back by = " +random1To6);
		 player2Postion+=random1To6;
		 System.out.println("you are in "+player2Postion);
	         }
		 else if(RandomNum == 1)
		 {
	       	System.out.println("No Play");
		System.out.println("you are in "+player2Postion);
                 }       
		else
		{
	        player2Postion +=random1To6;
	        if(player2Postion > 100)
		{
		player2Postion -=random1To6;
		}
		else 
                {
		System.out.println("congrats you have incremented by "+random1To6);
		System.out.println("you are under "+player2Postion);
       	        }
         	}
		if(player2Postion == 100)
		{
		System.out.println("congrats player2 won !! you getting your winning position");
                }
		}
                }
           System.out.println("player1= "+player1Postion);
           System.out.println("player2= "+player2Postion);
           System.out.println("player1DiceRolling= "+ player1NoDiceRoll);
           System.out.println("player2DiceRolling= "+ player2NoDiceRoll);
    }
     public static void main(String[] args)
    {
        startPosition();
        System.out.println("<-------------->");
        player2Wining();
    }
    }

         public static void main(String[] args)
         {
               startPosition();
               System.out.println("<-------------->");
               System.out.println("Total times dice played by you is"+numOfDiceRoll();
               System.out.println("ThankYou For playing game");
         }

    }
