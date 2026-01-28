package loops;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Starting Range: ");
		int start = sc.nextInt();
		
		System.out.print("Enter Ending Range: ");
		int end = sc.nextInt();
		
		System.out.printf("Numbers From %d To %d Are: \n",start,end);
		for(int i = start; i <= end; i++) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
