package dynamic_inputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderClass {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter The Integer Value: ");
		int n = Integer.parseInt(bf.readLine());
		
		System.out.print("Enter The String Value: ");
		String str= bf.readLine();
		
		System.out.println(n);
		System.out.println(str);
		
		bf.close();
	}
}
