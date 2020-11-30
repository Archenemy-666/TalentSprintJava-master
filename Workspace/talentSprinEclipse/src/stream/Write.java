package stream;
import java.io.*;
public class Write {
	public static void main(String[] args) throws IOException {
		FileOutputStream writing = new FileOutputStream("C:\\Users\\Archenemy_666\\Dropbox\\My PC (DESKTOP-JEMJTPE)\\Desktop\\hello.txt");
		String s = "hello world";
		byte[] out = s.getBytes();
		
		writing.write(out);
		s = " !!";
		writing.write(s.getBytes());
		writing.close();
	}

}
