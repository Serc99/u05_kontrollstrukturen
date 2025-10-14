// u05_kontrollstruktur
// auf5.29

import java.io.*;

public class BreakEvenPoint4
{
   public static void main(String[] args) throws Exception
   {
      int verkaufspreisst;
      int rohstoffkostenst;
      int arbeitskostenst;
      int fixkosten = 5000;
      int breakeven = -1;

      InputStreamReader eingabeLeser     = new InputStreamReader(System.in);
      BufferedReader    gepufferterLeser = new BufferedReader(eingabeLeser);
      String eingabe;

      System.out.println();
      System.out.println("Verkaufspreis pro Stueck (ganze Zahl): ");
      eingabe         = gepufferterLeser.readLine();
      verkaufspreisst = Integer.parseInt(eingabe);

      System.out.println();
      System.out.println("Rohstoffkosten pro Stueck (ganze Zahl): ");
      eingabe           = gepufferterLeser.readLine();
      rohstoffkostenst  = Integer.parseInt(eingabe);

      System.out.println();
      System.out.println("Arbeitskosten pro Stueck (ganze Zahl): ");
      eingabe         = gepufferterLeser.readLine();
      arbeitskostenst = Integer.parseInt(eingabe);

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
         int stueckkosten     = fixkosten / i + rohstoffkostenst + arbeitskostenst;
         int ueberschuss      = verkaufspreisst - stueckkosten;

         System.out.println("Stueckzahl: " + i + " Stueckkosten: " + stueckkosten + 
                            " Ueberschuss pro Stueck: " + ueberschuss);
 
         if(ueberschuss <= 0) 
         {
            breakeven = i + 1;
         }
      }   
         System.out.println();
         System.out.println("Es müssen mindestens " + breakeven + " Stueck produziert werden.");
   }
}   


