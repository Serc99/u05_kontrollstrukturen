// u05_kontrollstruktur
// auf5.27

public class BreakEvenPoint
{
   public static void main(String[] args)
   {
      int verkaufspreisst  = 1500;
      int rohstoffkostenst = 600;
      int arbeitskostenst  = 400;
      int fixkosten        = 5000;

      System.out.println();
      System.out.println("Break-Even-Point");
      System.out.println("================");
      System.out.println("Verkaufspreis pro Stueck:  " + verkaufspreisst);
      System.out.println("Rohstoffkosten pro Stueck: " + rohstoffkostenst);
      System.out.println("Arbeitskosten pro Stueck:  " + arbeitskostenst);
      System.out.println("Fixkosten pro Monat:       " + fixkosten);
      System.out.println("Maximale Stueckzahl pro Monat: " + "15");
      System.out.println();

      for(int i = 1; i <= 15; i++)
      {

         int gesamtkosten     = ((rohstoffkostenst + arbeitskostenst) *i) + fixkosten;
         int erloes           = verkaufspreisst * i;
         int ueberschuss      = erloes - gesamtkosten;

         System.out.println("Stueckzahl: " + i + " Gesamtkosten: " + gesamtkosten + 
                            " Erloes: " + erloes + " Ueberschuss: " + ueberschuss);
      }
   }
}
