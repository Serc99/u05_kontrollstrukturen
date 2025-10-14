// u05_kontrollstrukturen
// auf5.31

public class Ratentilgung1
{
   public static void main(String[] args)
   {
      int kredit = 5000;
      int zinssatz = 6;
      int laufzeit = 5;

      int tilgung    = kredit / laufzeit;
      int restschuld = kredit;

      System.out.println("Ratentilgung");
      System.out.println();

      for(int jahr = 1; jahr <= laufzeit; jahr++)
      {
         int zinsen     = restschuld / 100 * zinssatz; 
         int zahlung    = tilgung + zinsen;

         System.out.println("Jahr " + jahr + "   Restschuld " + restschuld + "   Zinsen "
                         + zinsen + "   Tilgung " + tilgung + "   Zahlung " + zahlung);
         restschuld -= tilgung;
      }
   }
}

