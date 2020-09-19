/** Textbasierter einfacher Taschenrechner für Übungszwecke programmiert
 * 	Für jede Rechenart sowie für die Benutzerauswahl wird ein Objekt erstellt
 * 	In diesem Objekt wird auch die Berechnung durchgeführt
 * 	
 * TO-DO: Try-Catch implementieren um ungültige Eingaben abzufangen 
 * 		  Funktionserweiterung um mit dem errechneten Ergebnis weiterzurechnen*/

import java.util.*;
public class OOPTRechner 
{
// Objekte erstellen 	
	 static Rechenart rArt = new Rechenart(0);
	 static Plus plus = new Plus(0,0,0);
	 static Minus minus = new Minus(0,0,0);
	 static Mal mal = new Mal(0,0,0);
	 static Durch durch = new Durch(0,0,0);
	 static Potenz potenz = new Potenz(0,0,0);
	 static Scanner scn = new Scanner(System.in);
// ****************

	public static void main(String[] args) 
	{	
		boolean programmschleife = true;
		while(programmschleife == true)
		{
			/* Beginn Menu*/
			boolean menuschleife = true;
			while(menuschleife == true)
			{
				System.out.println("Bitte Rechenart wählen");
				System.out.println("----------------------");
				System.out.println("Addition ( + ): \t 1");
				System.out.println("Subtraktion ( - ): \t 2");
				System.out.println("Multiplikation ( x ): \t 3");
				System.out.println("Division ( : ): \t 4");
				System.out.println("Potenzieren (m ^ n): \t 5");
				System.out.println("\n!! Bitte NUR Zahlen eingeben !!");
				rArt.setrArt(scn.nextInt());
				if(rArt.getrArt()>0 && rArt.getrArt()<6)
				{
					menuschleife = false;
				}
				else
				{
					System.out.println("Auswahlmenu beachten!");
				}
			} // Klammer Menuschleife
			/* ENDE Menu */
					
					// Addition
					if(rArt.getrArt() == 1)
					{
						System.out.println("Wert1 eingeben: ");
						plus.setWert1(scn.nextDouble());
						System.out.println("Wert2 eingeben: ");
						plus.setWert2(scn.nextDouble());
						double erg = plus.getErgebnis(); // double erg um mit dem Ergebnis später weiter zu rechnen
						System.out.println("Ergebnis: " + erg);
					}
					
					// Subtraktion
					else if(rArt.getrArt() == 2)
					{
						System.out.println("Wert1 eingeben: ");
						minus.setWert1(scn.nextDouble());
						System.out.println("Wert2 eingeben: ");
						minus.setWert2(scn.nextDouble());
						double erg = minus.getErgebnis(); // double erg um mit dem Ergebnis später weiter zu rechnen
						System.out.println("Ergebnis: " + erg);
					}
					
					// Multiplikation
					else if(rArt.getrArt() == 3)
					{
						System.out.println("Wert1 eingeben: ");
						mal.setWert1(scn.nextDouble());
						System.out.println("Wert2 eingeben: ");
						mal.setWert2(scn.nextDouble());
						double erg = mal.getErgebnis(); // double erg um mit dem Ergebnis später weiter zu rechnen
						System.out.println("Ergebnis: " + erg);
					}
					
					// Division
					else if(rArt.getrArt() == 4)
					{
						System.out.println("Wert1 eingeben: ");
						durch.setWert1(scn.nextDouble());
						System.out.println("Wert2 eingeben: ");
						durch.setWert2(scn.nextDouble());
						double erg = durch.getErgebnis(); // double erg um mit dem Ergebnis später weiter zu rechnen
						System.out.println("Ergebnis: " + erg);
					}
					
					// Potenzieren
					else if(rArt.getrArt() == 5)
					{
						System.out.println("Wert der Basis eingeben: ");
						potenz.setBasis(scn.nextDouble());
						System.out.println("Potenzwert eingeben: ");
						potenz.setPotenzwert(scn.nextDouble());
						double erg = potenz.getErgebnis(); // double erg um mit dem Ergebnis später weiter zu rechnen
						System.out.println("Ergebnis: " + erg);
					}
			System.out.println("Weitere Berechnung? J/N");
			String weitereBerechnung = scn.next();
			if(weitereBerechnung.equalsIgnoreCase("N"))
			{
				programmschleife = false;
			}
			
		} // Klammer Programmschleife				
	} // Klammer main
} // Klammer Class