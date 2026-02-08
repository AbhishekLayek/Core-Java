package strings;

public class StringMethods {
	public static void main(String[] args) {
		
		String str1 = "Hello World!";
		String str2 = "Welcome";
		
		// .length(): It will provide the total count of characters or the length of string.
		System.out.println(str1.length());
		
		// charAt(int index): It will provide the character present in the given index.
		System.out.println(str1.charAt(0)); // H
		
		// subString(int beginIndex): It will provide the substring starting from beginIndex to the end.
		System.out.println(str1.substring(6)); // World!
		
		// subString(int beginIndex, int endIndex): It will provide the substring starting from beginIndex to the endIndex - 1.
		System.out.println(str1.substring(6, 11)); // World
		
		// concat(String str): It will append the given string at the end of the current string.
		System.out.println(str2.concat(" To Java")); // Welcome To Java
		
		// indexOf(char ch): It will give the index of the given character in the string.
		System.out.println(str1.indexOf('e')); // 1
		
		// lastIndexOf(String str): It will provide the last occurrence index of the given character in the string.
		System.out.println(str1.lastIndexOf('l')); // 9
		
		// equals(Object obj): It will compare two string object.
		System.out.println(str1.equals(str2)); // false
		
		// equalsIgnoreCase(String str): It will compare two strings without considering case.
		System.out.println(str1.equalsIgnoreCase("hello world!")); // true
		
		// toLowerCase(): It will convert all the characters of given String into lowercase.
		System.out.println(str1.toLowerCase()); // hello world!
		
		// toUpperCase(): It will convert all the characters of given String into uppercase.
		System.out.println(str1.toLowerCase()); // HELLO WORLD!
		
		// replace(char oldChar, char newChar): It will replace new character with the existing character.
		System.out.println(str2.replace('o', 'a')); // Welcame
		
		// toCharArray(): It will convert string into character array
		
		char[] arr = str2.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// startsWith(String prefix): It will check weather string will start with the given prefix or not.
		System.out.println(str1.startsWith("Hello")); // true
		
		// trim(): It will remove the extra whitespace at both ends.
		String str3 = "    Java    ";
		System.out.println(str3.trim()); // java
		
		// isEmpty(): It will check the string is empty or not.
		String str4 = "";
		System.out.println(str4.isEmpty()); // true
		
	}
}
