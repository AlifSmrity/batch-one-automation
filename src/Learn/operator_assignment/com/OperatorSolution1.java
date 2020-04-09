package Learn.operator_assignment.com;

import java.util.Scanner;

public class OperatorSolution1 {
	
public static void main	(String[]args) {
	
	int num1, num2, num3, total;
	
	Scanner input = new Scanner (System.in);
	
	System.out.print("Please Enter First Number: ");
	num1 = input.nextInt();
	
	System.out.print("Please Enter Second Number: ");
	num2 = input.nextInt();
	
	System.out.print("Please Enter Third Number: ");
	num3 = input.nextInt();
	
	
	total = num1 +  num2 + num2;
	
	System.out.println("Total :" + total);
	
}


}
