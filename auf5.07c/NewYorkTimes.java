// u05_kontrollstrukturen
// auf5.07c

public class NewYorkTimes 
{
   public static void main(String[] args)
   {
      System.out.println("Delivering The New York Times");

      for(int avenue = 5; avenue <= 7; avenue++)
      {
         System.out.println("---------------------------");
         System.out.println("Reaching the " + avenue + "th avenue");
         System.out.println();

         for(int house = 21; house <= 25; house += 2)
         {
            System.out.println("Enter No " + house);
      
            for(int floor = 0; floor <= 2; floor++)
            {
               System.out.println("Delivered in No " + house + ", floor " + floor);
            }

            System.out.println();
         }

         System.out.println();
      }
   }
}
