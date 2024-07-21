package basic_programs_of_java;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringVowels {

	public static void main(String args[]) {

		int vowelcount = 0;
		int consonantcount = 0;
		int wordcount = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String");

		String str = sc.nextLine();
		str=str.toLowerCase();
		StringTokenizer token = new StringTokenizer(str, "");
		wordcount = token.countTokens();
		char arr[] = str.toCharArray();
		
		for (int i = 0; i < str.length(); i++) {

			char ch = arr[i];
			{
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelcount++;
			}
				else if (ch >= 'a' && ch <= 'z') {
					consonantcount++;
				}
			}
		}
		System.out.println(vowelcount);
		System.out.println(consonantcount);
		System.out.print(wordcount);
	}
}