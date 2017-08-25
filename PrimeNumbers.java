package ForJavaCourses;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {
	public static int m=0;
	public static int enterNumbers(){
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()){
			m=sc.nextInt();
			if (m<=0){
				System.out.println("The number must be positive");
				sc=null;
				enterNumbers();
			}
		}else{
			System.out.println("This isn't a number");
			sc=null;
			enterNumbers();
		}
		return m;
	}
	public static void main(String[] args) {
		int num=enterNumbers();
	    ArrayList<Integer> numbers = new ArrayList<Integer>();
	    /**2 is prime number */
	    if (num>=2){
	    	numbers.add(2);
	    };
	    /**Prime numbers is odd. Therefore, we go through all the odd numbers starting from 3 */
	    for(int i = 3; i <= num; i=i+2)
	    {
	      boolean prime = true;
	      for(int j = 2; j < i; j++)
	      {
	        if(i % j == 0){
	          prime = false;}
	      }
	      if(prime){
	        numbers.add(i);}
	    }
	    System.out.print("Prime numbers from 1 to " + num + ": ");
	    for (int ns:numbers){
	    	System.out.print(ns + ", ");
	    }
	}	
}
