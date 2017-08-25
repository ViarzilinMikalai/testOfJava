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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		int b=1;
		int number=enterNumbers();
		int fibonacciNumber = 1;
		System.out.print("Prime numbers from 1 to " + number + ": ");
		while(fibonacciNumber <= number){
		     System.out.print( fibonacciNumber + ", ");
		     fibonacciNumber = a + b;
		     a = b;
		     b = fibonacciNumber;
		}
	}

}
