import Prog1Tools.IOTools;

public class Rechnen {

	public int ggt(int a, int b) {

		int x = 0;
		int y = 0;

		if (a == 0) {
			return b;
		} else if (b == 0) {
			return a;
		} else {

		}

		x = Math.abs(a);
		y = Math.abs(b);

		while (x != y) {

			if (x > y) {
				x = x - y;

			} else {
				y = y - x;
			}

		}

		return x;

	}

	public static void einlesen(Bruchzahl bruchzahl) {

		int nenner = IOTools.readInt("Nenner: ");

		bruchzahl.zaehler = IOTools.readInt("Zaehler: ");
		if (nenner == 0) {
			return;
		} else {
			bruchzahl.nenner = IOTools.readInt();
		}

	}

	public static void ausgeben(Bruchzahl bruchzahl) {

		System.out.println(bruchzahl.zaehler + " / " + bruchzahl.nenner);

	}

	public static double wert(Bruchzahl bruchzahl) {

		double ergebnis = (double) bruchzahl.zaehler / bruchzahl.nenner;

		return ergebnis;

	}

	public static Bruchzahl mul(Bruchzahl a, Bruchzahl b) {

		Bruchzahl bruchzahl = new Bruchzahl();

		bruchzahl.zaehler = a.zaehler * b.zaehler;
		bruchzahl.nenner = a.nenner * b.nenner;

		if (bruchzahl.nenner % bruchzahl.zaehler == 0) {

			bruchzahl.nenner = bruchzahl.nenner / bruchzahl.zaehler;
			bruchzahl.zaehler = 1;
			
		}

		return bruchzahl;

	}
	
	// a mit dem Kehrwert von b multiplizieren: Benutze die Methode mul
	public static Bruchzahl div(Bruchzahl a, Bruchzahl b) {
		
		Bruchzahl bruchzahl = new Bruchzahl();
		bruchzahl.zaehler = b.nenner;
		bruchzahl.nenner = b.zaehler;
		
		return mul (a, bruchzahl);

	}

	public static Bruchzahl add(Bruchzahl a, Bruchzahl b) {
		
		Bruchzahl bruchzahl = new Bruchzahl();
		
		bruchzahl.nenner = a.nenner * b.nenner;
		bruchzahl.zaehler = (a.zaehler * b.nenner) + (b.zaehler * a.nenner);
		
		//kürzt den Bruch
		if (bruchzahl.nenner % bruchzahl.zaehler == 0) {

			bruchzahl.nenner = bruchzahl.nenner / bruchzahl.zaehler;
			bruchzahl.zaehler = 1;
			
		}

		return bruchzahl;

	}

	public static Bruchzahl sub(Bruchzahl a, Bruchzahl b) {
		//b negativ indem man zähler oder nenner mit * (-1) nimmt.
		b.zaehler = b.zaehler * (-1);
		
		return add(a,b);

	}
}
