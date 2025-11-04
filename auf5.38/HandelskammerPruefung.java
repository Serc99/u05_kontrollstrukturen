// u05_kontrollstrukturen
// auf5.38

public class HandelskammerPruefung
{
   public static void main(String[] args)
   {
      // Initialiserung der Punktzahl.
      int ap1   = 40;
      int ap2p1 = 50;
      int ap2p2 = 30;
      int ap2p3 = 65;
      int ap2d  = 60;
      int ap2mp = 60;

      // Initialisierung der gewichtung der folgenden Pruefungen.
      int ap1gw   = 20;
      int ap2p1gw = 10;
      int ap2p2gw = 10;
      int ap2p3gw = 10;
      int ap2dgw  = 25;
      int ap2mpgw = 25;

      // Rechnung der gesamtpunkte inklusive der gewichtung.
      // Punkte * gewichtung (z.B. 20% = 20) / 100;
      int gesamterzieltepunkte = ap1 * ap1gw / 100 + 
                                 ap2p1 * ap2p1gw / 100 + 
                                 ap2p2 * ap2p2gw / 100 + 
                                 ap2p3 * ap2p3gw / 100 + 
                                 ap2d * ap2dgw / 100 + 
                                 ap2mp * ap2mpgw / 100;

      // Ausgabe
      System.out.println("Punkte AP1:                         " + ap1);
      System.out.println("Punkte AP2 schriftliche Pruefung 1: " + ap2p1);
      System.out.println("Punkte AP2 schriftliche Pruefung 2: " + ap2p2);
      System.out.println("Punkte AP2 schriftliche Pruefung 3: " + ap2p3);
      System.out.println("Punkte AP2 Projekt-Doku:            " + ap2d);
      System.out.println("Punkte AP2 Muendliche Pruefung:     " + ap2mp);
      System.out.println();
      System.out.println("Gesamtpunkte: " + gesamterzieltepunkte);

      boolean nichtBestanden = false;

      // Mit dieser if prüfen wir ob die Gesamtpruefung bestanden ist oder nicht.
      // Operator || = oder. Wenn irgendeine Bedingung wahr ist (also < 30),
      // wird "nicht bestanden" ausgegeben.
      if(ap1 < 30 ||
         ap2p1 < 30 ||
         ap2p2 < 30 ||
         ap2p3 < 30 ||
         ap2d < 30 ||
         ap2mp < 30)
      {
         nichtBestanden = true;
      }
      if(nichtBestanden)
      {
         System.out.println("Pruefung nicht bestanden weil eine Punktzahl unter 30");
      }
      // Wenn keiner der Werte < 29 ist, dann bestanden. 
      else
      {
         System.out.println("Pruefung bestanden");
      }
   }
}
