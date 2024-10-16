
package C_BasicsPractice;

import java.io.*;
import java.util.Scanner;

public class E_ReverseString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char ch = 0;
		String words = "";
		
		System.out.println("ENTER A WORD TO REVERSE : ");
		String word = scan.nextLine();
		
		for(int i = 0; i < word.length(); i++) {
			ch = word.charAt(i);
			words = ch + words;
		}
		
		System.out.println(ch);
		scan.close();
	}

}
