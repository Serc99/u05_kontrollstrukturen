// u05_kontrollstrukturen
// auf5.37

import java.io.*;

public class Primzahl
{
   public static void main(String[] args) throws Exception
   {
      // Eine Primzahl ist eine ganze Zahl größer als 1, die nur durch 1 und
      // sich selbst teilbar ist. Ergebnis muss eine ganze Zahl sein.
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
      // 1 ist keine Primzahl und hat nur einen Teiler.
      for(int i = 2; i <= oberGrenze; i++)
      {
         boolean istPrim = true;
      
         // Prüfe alle möglichen Teiler von 2 bis (i -1).
         // Teiler ist eine Zahl die ohne Rest teilt.
         // Primzahlen haben immer 2 Teiler, 1 und die Zahl selbst.
         for(int teiler = 2; teiler < i; teiler++)
         {
            // Modulo 
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