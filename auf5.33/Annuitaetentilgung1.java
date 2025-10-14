// u05_kontrollstrukturen
// auf5.33

public class Annuitaetentilgung1
{
   public static void main(String[] args)
   {
      int kredit = 5000;
      int zinssatz = 6;
      int annuitaet = 1000;

      int restschuld = kredit;
      int jahr = 1;

      System.out.println();
      System.out.println("Annuitaetentilgung");
      System.out.println();

      while(restschuld > 0)
      {
         int zinsen     = restschuld / 100 * zinssatz;
         int tilgung    = annuitaet - zinsen;

         if(tilgung > restschuld)
         {
            tilgung   = restschuld;
            annuitaet = tilgung + zinsen;
            
         }

         System.out.println("Jahr " + jahr + "   Restschuld " + restschuld + "   Zinsen "
                            + zinsen + "   Tilgung " + tilgung + "   Zahlung " + annuitaet);
         
         restschuld -= tilgung;
         jahr++;
      }
   }
}
