package probC;

abstract public class Employee {
	private String empId;
	
	public Employee(String eId) {
		this.empId = eId;
	}
	
	public void print(int m, int y) {
		System.out.println("Employee Id: " + empId + "\n");
		Paycheck p = calcCompensation(m, y);
		p.print();
	}
	public Paycheck calcCompensation(int month, int year) {
		double gp = calcGrossPay(month, year);
		return new Paycheck(gp);
	}	
	abstract public double calcGrossPay(int m, int y);
}
