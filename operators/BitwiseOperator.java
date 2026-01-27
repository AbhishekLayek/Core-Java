package operators;

public class BitwiseOperator {
	public static void main(String[] args) {
		
		int a = 10; // Binary of 10: 1010
		int b = 6;  // Binary of 6: 0110
		
		// Bitwise AND Operator(&) - When the both bits are 1 then result will be 1, else 0.
		
		System.out.println(a & b); // 0010 = 2
		
		// Bitwise OR Operator(|) - when the both the bits are 0 then result will be 0, else 1.
		
		System.out.println(a | b); // 1110 = 14
		
		// Bitwise XOR Operator(^) - when the two bits are  then result will be 1, else 0.
		
		System.out.println(a ^ b); // 1100 = 12
		
		// Bitwise NOT Operator(~) - It will compliment the digits
		
		System.out.println(~0); // -1
		
		// Left Shift Operator(<<) - Left most bit will be shifted by specific position, and fill 0 to the rightmost bit
		
		System.out.println(b << 1); // 1100 = 12
		
		// Right Shift Operator(>>) - Right most bit will be shifted by specific position, and if the number is positive then leftmost bit will be filled with 0, else 1
		
		System.out.println(b >> 1); // 0011 = 3
	}
}
