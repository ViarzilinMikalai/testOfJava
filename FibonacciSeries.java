package ForJavaCourses;

import java.util.Scanner;

public class FibonacciSeries {
	public static int m=0;
	public static int enterNumbers(){
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()){
			m=sc.nextInt();
			if (m<=0){
				System.out.println("The number must be positive");
				enterNumbers();
			}
		}else{
			System.out.println("This isn't a number");
			enterNumbers();
		}
		return m;
	}
	
	public static long getFib(int num){
		if (num<=1){
			return num;
		} else{
			return getFib(num-2)+getFib(num-1);
		}
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=enterNumbers();
		int i=1;
		while(getFib(i)<=n){
			System.out.print(getFib(i) + " ");
			i++;
		};
	}
}


