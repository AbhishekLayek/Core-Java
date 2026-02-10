package exception_handling.compiletime_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound_Exception {
	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("data.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
