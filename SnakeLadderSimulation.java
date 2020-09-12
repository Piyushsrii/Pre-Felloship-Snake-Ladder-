#### Welcome in Snake & Ladder Simulation #####
    import java.util.Random;
    public class SnakeLadderSimulation
    {

         static void startPosition()
         {
               System.out.println("Player starting from position 0");
         }
         public static int rollDie()
         {
               Random random=new Random();
               int randomNum=random.nextInt(6)+1;
               System.out.println(""+randomNum);
               return rollDie;
         }
                 public static void repeatSankeLader()
                 {
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
			}
			else
			{
				Wining=Wining+random1To6;
				System.out.println("congrats you have incremented by "+random1To6);
		         	System.out.println("you are in "+Wining);
			}
			if(Wining == 100)
			{
				System.out.println("congrats you have reached till 100");
                        }
		}
    }

         public static void main(String[] args)
         {
               startPosition();
               casesInSankeLader();
         }

    }
