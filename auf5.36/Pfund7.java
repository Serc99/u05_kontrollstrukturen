// u05_kontrollstruktur
// auf3.36

import java.io.*;

public class Pfund7
{
   public static void main(String[] args) throws Exception
   {
      // Deklaration
      double faktor = 0.7853;
      String eingabeEuroString;
      double eingabeEuroDouble;
      String eingabeGebuehrGesamtText;
      double pfundErgebnis;
      String gebuehrEinzelZifferText;
      double einzahlung;
      double finalGebuehr;
      double gebuehrEinzelZiffer;

      // Deklariere und Initiere den InputStreamReader und BufferedReader
      InputStreamReader eingabeLeser     = new InputStreamReader(System.in);
      BufferedReader    gepufferterLeser = new BufferedReader(eingabeLeser);

      // Abfrage des Euro-Betrages
      System.out.println();
      System.out.println("Bitte den Euro-Betrag einfuegen: ");
      eingabeEuroString = gepufferterLeser.readLine();
      eingabeEuroDouble = Double.parseDouble(eingabeEuroString);
      System.out.println();

      // Abfrage der Gebuehr
      System.out.println();
      System.out.println("Bitte die Gebuehr eingeben: ");
      System.out.println("Eingabeform: \"x Euro\" oder \"x Prozent\"");
      System.out.println();
      eingabeGebuehrGesamtText = gepufferterLeser.readLine();
      System.out.println();

      int leerZeichenPosition = eingabeGebuehrGesamtText.indexOf(" ");
      System.out.println(leerZeichen);

      gebuehrEinzelZifferText = eingabeGebuehrGesamtText.substring(0, leerZeichenPosition);
      gebuehrEinzelZiffer     = Double.parseDouble(gebuehrEinzelZifferText);

      // Euro zu Pfund Umrechnung
      pfundErgebnis     = eingabeEuroDouble * faktor;

      if(eingabeGebuehrGesamtText.endsWith("Euro"))
      { 
         finalGebuehr   = gebuehrEinzelZiffer;
      }      
      else if(eingabeGebuehrGesamtText.endsWith("Prozent"))
      {
         finalGebuehr   = gebuehrEinzelZiffer;
         finalGebuehr   = eingabeEuroDouble / 100 * gebuehrEinzelZiffer;  
      }
      else
      {
         System.out.println("Falsche Eingabe. Bitte 'x Prozent' oder 'x Euro' eingeben.");
         return;
      }
      // Berechnung der Gesamteinzahlung in Euro
      einzahlung = eingabeEuroDouble + finalGebuehr;

      // Finale Ausgabe
      System.out.printf("Euro-Betrag: %7.2f Euro\n", eingabeEuroDouble);
      System.out.printf("Pfund-Betrag: %7.2f Pfund\n", pfundErgebnis);
      System.out.printf("Gebuehr: %7.2f Euro\n", finalGebuehr);
      System.out.printf("Einzuzahlen: %7.2f Euro\n", einzahlung);
   }
}















