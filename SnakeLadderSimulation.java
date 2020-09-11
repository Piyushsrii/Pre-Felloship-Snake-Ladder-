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
         public static void main(String[] args)
         {
         startPosition();
         rollDie();
         }
    }
