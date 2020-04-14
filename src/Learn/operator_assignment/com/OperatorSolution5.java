package Learn.operator_assignment.com;

public class OperatorSolution5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double TotalStock = 600;
		double pricePershare= 21.77;
		double CommissionPercent= 0.02;
		
		double PaidofTotalStockWithoutCommission = TotalStock*pricePershare;
		System.out.println("Price of Total Share Without Commission :" + PaidofTotalStockWithoutCommission);
		
		double AmountofCommission = PaidofTotalStockWithoutCommission*CommissionPercent;
		System.out.println("Total Amount of Commission :" + AmountofCommission );
		
		double TotalAmountPaid = AmountofCommission+PaidofTotalStockWithoutCommission;
		System.out.println("Total amount paid for the stock and commission : "+ TotalAmountPaid);
		
		
		
		

	}

}
