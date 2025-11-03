// u05_kontrollstrukturen
// auf5.37

import java.io.*;

public class Primzahl
{
   public static void main(String[] args) throws Exception
   {
      // Deklariere und Initiere den InputStreamReader und BufferedReader.
      InputStreamReader eingabeLeser     = new InputStreamReader(System.in);
      BufferedReader    gepufferterLeser = new BufferedReader(eingabeLeser);

      // Abfrage der Obergrenze.
      System.out.println();
      System.out.println("Bitte Obergrenze eingeben: ");
      String oberGrenzeEingabeText = gepufferterLeser.readLine();
      int oberGrenze = Integer.parseInt(oberGrenzeEingabeText);

      System.out.println("Primzahlen bis " + oberGrenze + ":");

      // Schleife von 2 bis Obergrenze bis zur Obergrenze.
      // Starten mit 2, da 1 jede Zahl teilt und es dadurch keinen Sinn ergibt.
      for(int i = 2; i <= oberGrenze; i++)
      {
         boolean istPrim = true;
      
         // Prüfe alle möglichen Teiler von 1 bis (i -1).
         for(int teiler = 2; teiler < i; teiler++)
         {
            if(i % teiler == 0)
            {
               istPrim = false; // Wenn teilbar, keine Primzahl.
               break; // Schleife abbrechen, nicht weiter zaehlen.
            }
         }
         if(istPrim)
         {
            System.out.println(i);
         }
      }
   }  
}