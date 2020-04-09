package Learn.operator_assignment.com;

import java.util.Scanner;

public class OperatorSolution4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double  milesPergallon;
		double milesDriven;
		double gallonsOfgasUsed;
		
		
		System.out.println("Please Enter the milesDriven : ");
		milesDriven= input.nextDouble();
		
		System.out.println ("Please Enter the gallonsOfgasUsed : ");
		gallonsOfgasUsed = input.nextDouble();
		
		milesPergallon = milesDriven/gallonsOfgasUsed;
		
		System.out.println (" MPG is :" + milesPergallon);
		
		
		
		

	}

}
