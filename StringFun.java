/**
 * This class consists of a main function that takes in strings and produces outputs of different functions used on the strings
 * The method I picked is contains(), this returns a boolean value if the character is in the word that is used
 * The other method I picked is replace(), this replaces a specified letter with another specified letter
 * @author Alaap Bharadwaj
 */
import java.util.Scanner;

public class StringFun {
	public static void main(String[] args) {
		String s;
		String subString;
		String otherString;

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a String: ");
		s = reader.next();
		System.out.println("Enter a String: ");
		subString = reader.next();
		System.out.println("Enter a String: ");
		otherString = reader.next();


		System.out.println(s.length());
		System.out.println(s.equals(otherString));
		System.out.println(s.substring(1, 4));
		System.out.println(s.trim());
		System.out.println(s.indexOf(subString));
		System.out.println(s.lastIndexOf(subString));
		System.out.println(s.charAt(2));
		System.out.println(s.contains("sa"));
		System.out.println(s.replace("s", "d"));

	}
}