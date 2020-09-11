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
          public static void casesInSankeLader()
         {
               int random1To6=rollDie;
               Random random= new Random();
               int randomNum=random.nextInt(3)+1;
               System.out.println(randomNum);
         if(randomNum==1)
         {
               System.out.println("You can't move you have done ome mistake");
         }
         else if(randomNum==2)
         {
               System.out.println("you stand on the snake, you will move back"+random1To6);
         }
         else
         {
               System.out.println("congrats you got ladder, you will move ahead by"+random1To6);
         }
         public static void main(String[] args)
         {
               startPosition();
               rollDie();
               casesInSankeLader();
         }

    }
