#### Welcome in Snake & Ladder Simulation #####
    import java.util.Random;
    public class SnakeLadderSimulation
    {

         static void startPosition()
         {
               System.out.println("Player starting from position 0");
         }
         public static void rollDie()
         {
               Random random=new Random();
               int randomNum=random.nextInt(6)+1;
               System.out.println(""+randomNum);
         }
          public static void casesInSankeLader()
         {
               Random random= new Random();
               int randomNum=random.nextInt(3)+1;
               System.out.println(randomNum);
         if(randomNum==1)
         {
               System.out.println("You can't move you have done ome mistake");
         }
         else if(randomNum==2)
         {
               System.out.println("you stand on the snake, you will move two step back");
         }
         else
         {
               System.out.println("congrats you got ladder, you will move two forward");
         }
         public static void main(String[] args)
         {
               startPosition();
               rollDie();
               casesInSankeLader();
         }

         public static void main(String[] args)
         {
               startPosition();
               rollDie();
         }

    }
