
public class Main {

	public static void main(String[] args) {

		// Objekt der Klasse Bruchzahl erstellt:
		Bruchzahl bruchzahl = new Bruchzahl();

		Rechnen.einlesen(bruchzahl);
		Rechnen.ausgeben(bruchzahl);
			
		System.out.println(Rechnen.wert(bruchzahl));
	}

}

// Klassenmethoden --> static im Methodenkopf, werden über "Klassenname.Methode" aufgreufen

// über "Bezeichner.Methode aufrufen"

// Instanzmethoden --> kein static, erst Instanz erstellen "Klassenname Bezeichner = new Klassenname();"


// Objekte erstellen: "Klassenname Bezeichner = new Klassenname();"