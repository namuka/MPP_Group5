package probC;

abstract public class Employee {
	private String empId;
	
	public Employee(String eId) {
		this.empId = eId;
	}
	
	public void print(int m, int y) {
		System.out.println("Employee Id: " + empId);
		Paycheck paycheck = calcCompensation(m, y);
		paycheck.print();
	}
	public Paycheck calcCompensation(int month, int year) {
		double grossPay = calcGrossPay(month, year);
		return new Paycheck(grossPay);
	}	
	abstract public double calcGrossPay(int m, int y);
}
