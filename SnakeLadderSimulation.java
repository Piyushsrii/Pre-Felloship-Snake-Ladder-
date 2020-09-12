#### Welcome in Snake & Ladder Simulation #####
    import java.util.Random;
    public class SnakeLadderSimulation
    {
         static int position=0;
         static void startPosition()
         {
               System.out.println("Player starting from position"+position);
         }
         public static int rollDie()
         {
               Random random=new Random();
               int randomNum=random.nextInt(6)+1;
               System.out.println(""+randomNum);
               return rollDie;
         }
                 public static int numOfDiceRoll()
                 {
                 int countDiceRolling=0;
                 Random random = new Random();
		 int Wining=0;
		 while(Wining < 100)
		 {
			int random1To6=rollDie();
			int RandomCheck=random.nextInt(3);
			if(RandomCheck ==2 && Wining > random1To6)
			{

				System.out.println("you stand on the snake, you will move back by = " +random1To6);
				Wining=Wining-random1To6;
				System.out.println("you are in "+Wining);
                                countDiceRolling++;
                                if(Wining<0)
                                {
                                Wining=position;
                                System.out.println("Now your real posiion is 0"+Wining);
                                }

                                 if(Wining<0)
                                {
                                Wining=position;
                                System.out.println("Now your real posiion is 0"+Wining);
                                }

			}
			else if(RandomCheck == 0)
			{
				System.out.println("No Play");
				System.out.println("you are in "+Wining);
			        countDiceRolling++;
                        }
			else
			{
				Wining=Wining+random1To6;
                                if(Wining > 100)
				{
					Wining=Wining-random1To6;
				}
				System.out.println("congrats you have incremented by "+random1To6);
		         	System.out.println("you are in "+Wining);
                                countDiceRolling++;
			}
			if(Wining == 100)
			{
				System.out.println("congrats you have reached till 100");
                        }
		}
                   return countDiceRolling
    }

         public static void main(String[] args)
         {
               startPosition();
               System.out.println("<-------------->");
               System.out.println("Total times dice played by you is"+numOfDiceRoll();
               System.out.println("ThankYou For playing game");
         }

    }
