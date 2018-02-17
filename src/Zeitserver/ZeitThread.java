package Zeitserver;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Date;

public class ZeitThread implements Runnable {
	
	private Socket s;
	
	public ZeitThread (Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
	
		try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));) {
			
			bw.write("" + new Date());
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
