package ForJavaCourses;

import java.util.Scanner;

public class IntersectionOfSegments {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Enter the coordinates
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coordinates of the segment AB (x1,y1,x2,y2)");
		String inputString1 = sc.nextLine();
		System.out.println("Enter the coordinates of the segment AB (x1,y1,x2,y2)");
		String inputString2 = sc.nextLine();
		
		//Convert strings to arrays
		String[] tempString1 = inputString1.split("\\s+|,\\s*");
		String[] tempString2 = inputString2.split("\\s+|,\\s*");
		/**
		From the arrays we get the variables to calculate  and convert them to int 
		*/
		int ax1 = Integer.parseInt(tempString1[0]);
		int ay1 = Integer.parseInt(tempString1[1]);
		int ax2 = Integer.parseInt(tempString1[2]);
		int ay2 = Integer.parseInt(tempString1[3]);
		int bx1 = Integer.parseInt(tempString2[0]);
		int by1 = Integer.parseInt(tempString2[1]);
		int bx2 = Integer.parseInt(tempString2[2]);
		int by2 = Integer.parseInt(tempString2[3]);
				
		int v1=(bx2-bx1)*(ay1-by1)-(by2-by1)*(ax1-bx1);
		int v2=(bx2-bx1)*(ay2-by1)-(by2-by1)*(ax2-bx1);
		int v3=(ax2-ax1)*(by1-ay1)-(ay2-ay1)*(bx1-ax1);
		int v4=(ax2-ax1)*(by2-ay1)-(ay2-ay1)*(bx2-ax1);
	    
		if((v1*v2<0) && (v3*v4<0)){
			System.out.println("The segments AB & CD intersect");
		}else {
			System.out.println("The segments AB & CD do not intersect");
		};
	}
}
