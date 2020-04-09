package Learn.operator_assignment.com;

import java.util.Scanner;

public class OperatorSolution3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	Scanner keyboard = new Scanner(System.in);
	
	
	double CountrytaxPercent= 0.02;
	double StatetaxPercent  = 0.04;
	double PurchaseAmount;
	double Statetax;
	double Countrytax;
	double Totaltax;
	double TotalSale;
	
	System.out.println("Please Enter the Purchase Amount : ");
	PurchaseAmount= keyboard.nextDouble();
	
	
	Countrytax= (CountrytaxPercent*PurchaseAmount);
	  Statetax=  (StatetaxPercent*PurchaseAmount);
	  Totaltax= (Countrytax+Statetax);
	 TotalSale= (Totaltax+PurchaseAmount);
	 
    System.out.println("Countrytax : " + Countrytax);
    
    System.out.println("Statetax : " + Statetax);  
	
    System.out.println("Totaltax : " + (Countrytax+Statetax));
    
    System.out.println("TotalSale :  " + (Totaltax+PurchaseAmount));
		
	}

}
