package Zeitserver;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Zeitserver {
	// Socket = Client
	// ServerSocket = Server
	// Folie 61 sehr wichtig!
	public static void main(String[] args) {

		try {
			ServerSocket ss = new ServerSocket(8080);

			while (true) {
				Thread t = new Thread(new ZeitThread(ss.accept()));

				t.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

// try {
// ServerSocket ss = new ServerSocket(8080);
//
// // sobald jemand auf den server zugreift erstellen wir einen neuen Client
// Socket s = ss.accept();
//
// s.getOutputStream();
//
// // getOutputStream() gibt einen byte stream zurück und wir müssen umwandeln
// // um von byte stream zu character stream umzuwandeln
// // BufferedWriter erwartet einen Writer als Parameter. Writer ist character
// // basiert deshalb müssen wir umwandeln in character
// BufferedWriter bw = new BufferedWriter(new
// OutputStreamWriter(s.getOutputStream()));
//
// // write erwartet einen string deshalb einfach einen leeren string vorne
// // rangehen als trick
// bw.write("" + new Date());
//
// bw.flush();
//
// } catch (IOException e) {
// e.printStackTrace();
// }