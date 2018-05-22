public class Payroll {
	private int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
	private int[] hours = new int[7];
	private double[] payRate= new double[7];
	private double[] wages = new double[7];

	//Accessors
	public int getEmployeeId (int indx) {
		return employeeId[indx];
	}
	public int getHours (int indx) {
		return hours[indx];
	}
	public double getPayRate (int indx) {
		return payRate[indx];
	}
	public double getWages (int indx) {
		return wages[indx];
	}
	//mutators
	public void setEmployeeId (int indx, int id) {
		employeeId[indx] = id;
	}
	public void setHours (int indx, int hrs) {
		hours[indx] = hrs;
	}
	public void setPayRate (int indx, double pr) {
		payRate[indx] = pr;
	}
	public void setWages (int indx, double wgs) {
		wages[indx] = wgs;
	}

	public double calculateGrossPay (int id) {
		double grossPay = 0.0;
		int employeeIndex = -1;				
		for (int i = 0; i < employeeId.length; i++) {		
			if (employeeId[i] == id) {						 
				employeeIndex= i;							
				break;										
			}
		}
		if (employeeIndex != -1) {							
			int hrs = hours[employeeIndex];					
			double pr = payRate[employeeIndex];				
			grossPay = hrs * pr;							
		}
		return grossPay;
	}
}