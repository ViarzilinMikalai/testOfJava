package ForJavaCourses;

import java.util.Scanner;

public class GcdLcm {
    public static int gcd(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		int q = gcd(a,b);
		int lcm = a/q*b;
		System.out.println("Greatest common divisor (" + a+";"+b+")="+q);
		System.out.println("Least common multiple (" + a+";"+b+")="+lcm);

	}
}
