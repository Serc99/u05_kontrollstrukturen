// u05_kontrollstrukturen
// auf5.07a

public class Wochenblatt
{
   public static void main(String[] args)
   {
      System.out.println("Zustellung Wochenblatt");
      System.out.println();
   
      for(int haus = 5; haus <= 7; haus++)
      {
         System.out.println("Ich betrete Nr " + haus);

         for(int stock = 0; stock <= 3; stock++)
         {
            System.out.println("Zugestellt in Nr " + haus + ", " + stock + ".Stock");
         }
         System.out.println();
      }
   }
}
