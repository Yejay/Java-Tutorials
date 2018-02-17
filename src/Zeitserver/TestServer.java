package Zeitserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestServer {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = null;
		Socket s = null;
		try {

			s = new Socket("localhost", 8080);

			reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
			System.out.println(reader.readLine());

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (s != null) {
				s.close();
			}

			if (reader != null) {
				reader.close();
			}
		}
	}

}
