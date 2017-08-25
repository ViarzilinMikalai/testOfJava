package ForJavaCourses;

import java.util.Scanner;

public class RemoveNumberFromText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the text");
		Scanner sc=new Scanner(System.in);
		String enteredText = sc.nextLine();
		String result = enteredText.replaceAll("[0-9]+", "");
		result = result.replaceAll("[\\s]{2,}", " ");
		System.out.println(result);

	}

}
