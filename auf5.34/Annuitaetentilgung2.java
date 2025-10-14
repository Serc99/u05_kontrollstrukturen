// u05_kontrollstrukturen
// auf5.34

import java.io.*;

public class Annuitaetentilgung2
{
   public static void main(String[] args) throws Exception
   {
      int kredit;
      int zinssatz;
      int annuitaet;

      InputStreamReader eingabeLeser     = new InputStreamReader(System.in);
      BufferedReader    gepufferterLeser = new BufferedReader(eingabeLeser);
      String eingabe;

      System.out.println();
      System.out.println("Kreditbetrag (ganze Zahl): ");
      eingabe = gepufferterLeser.readLine();
      kredit  = Integer.parseInt(eingabe);

      System.out.println();
      System.out.println("Zinsssatz (ganze Zahl): ");
      eingabe  = gepufferterLeser.readLine();
      zinssatz = Integer.parseInt(eingabe);

      System.out.println();
      System.out.println("Annuitaet (ganze Zahl): ");
      eingabe  = gepufferterLeser.readLine();
      annuitaet = Integer.parseInt(eingabe);

      System.out.println();
      System.out.println("Annuitaetentilgung");
      System.out.println();

      System.out.println();
      System.out.println("Zinssatz:  " + zinssatz);
      System.out.println("Kredit:    " + kredit);
      System.out.println("Annuitaet:  " + annuitaet);
      System.out.println();

      int restschuld = kredit;
      int jahr = 1;

      while(restschuld > 0)
      {
         int zinsen     = restschuld * zinssatz / 100;
         int tilgung    = annuitaet - zinsen;

         if(tilgung > restschuld)
         {
            tilgung   = restschuld;
            annuitaet = tilgung + zinsen;
            
         }

         System.out.println("Jahr " + jahr + "   Restschuld " + restschuld + "   Zinsen "
                            + zinsen + "   Tilgung " + tilgung + "   Annuitaet " + annuitaet);
         
         restschuld -= tilgung;
         jahr++;
      }
   }
}
