package prob2A;

public class Student {
	private String name;
	private GradeReport gradeReport;
	
	Student(GradeReport gp) {
		this.gradeReport=gp;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	
	public GradeReport getGradereport() {
		return gradeReport;
	}
	@Override 
	public String toString() {
		return name; 
	}
	
}
