package files_streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Files_Streams {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("kundendaten.txt"));
				PrintWriter pr = new PrintWriter(new FileWriter("kundendaten.csv"));) {
			
			String s;
			while((s = br.readLine()) != null) {
				pr.print(s + ";");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

// BufferedReader br = null;
// PrintWriter pr = null;
// try {
// br = new BufferedReader(new FileReader("kundendaten.txt"));
//
// pr = new PrintWriter(new FileWriter("kundendaten.csv"));
//
// String s;
//
// while ((s = br.readLine()) != null) {
// pr.write(s + ";");
// System.out.println(s + ";");
// }
//
// } catch (IOException e) {
// e.printStackTrace();
// } finally {
//
// try {
// if (br != null) {
// br.close();
// }
//
// if (pr != null) {
// pr.close();
// }
// } catch (IOException e) {
// e.printStackTrace();
// }
// }