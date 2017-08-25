package ForJavaCourses;

import java.util.Scanner;

public class PalindromWord {
	public static String palWord;
	public static String enterWord(){
		System.out.println("Enter the word");
		Scanner sc = new Scanner(System.in);
		palWord = sc.nextLine();
		palWord = palWord.trim();
		if(palWord.length()<2){
			System.out.println("In the word must be more letters...");
			enterWord();
		}
		return palWord;
	}
	public static void main(String[] args) {
		String str = new String(enterWord());
		String str2 = new String();
		for (int i=str.length()-1; i>=0; i--){
			str2+=str.charAt(i);
		}
		if(str.equalsIgnoreCase(str2)){
			System.out.println("The word \"" + str + "\" is palindrom.");
		}else{
			System.out.println("The word \"" + str + "\" isn't palindrom.");
		}
		
	}
}
