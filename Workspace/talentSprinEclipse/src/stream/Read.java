package stream;
import java.io.*;
public class Read {
	public static void main(String args[]) throws IOException {
		FileInputStream reading = new FileInputStream("C:\\Users\\Archenemy_666\\Dropbox\\My PC (DESKTOP-JEMJTPE)\\Desktop\\hello.txt");
		
		int ascii = reading.read();
		while(ascii != -1) {
			System.out.print((char)ascii);
			ascii = reading.read();
		}
		reading.close();
	}
	

}
